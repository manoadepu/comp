import models.DonorMatchResult;
import models.Hap3Count;
import models.Hap4Count;
import models.ViewPotentialSourcesRequest;
import models.viewPotentialSources.ViewPotentailSourcesResponse;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static io.restassured.mapper.ObjectMapperType.JACKSON_2;

public class Compare {

    public static boolean SolrTableInOracle = false;
    public static boolean restEndPoint = true;

    public static Statement Hap3Statement = connectionToOracle();
    public static Statement Hap4Statement = connectionToOracle();

    public static void CompareCountAndResults(List<Integer> phenotypeIds, List<String>patientGuids){

        //1. Get count of search results for patient guid
        int phenotypeCount=0;
        int index=0;
        int Passcount = 0;
        int FailCount = 0;
        if(phenotypeIds.size()==patientGuids.size()){
            System.out.println("phenotypeId"+phenotypeIds.get(index)+" | patientGuid: "+patientGuids.get(0));
            while(phenotypeIds.size()>index){

                //fetching the count of search results from hap3 and hap4
                Hap3Count hap3Count = SearchResultByPhenotypeCount(phenotypeIds.get(index));
                Hap4Count hap4Count = SearchResultByPatientGuidCount(patientGuids.get(index));

                if(hap3Count.getHap3DonorCount()==hap4Count.getHap4DonorCount() && hap3Count.getHap3CordCount()==hap4Count.getHap4CordCount()){

                    //2. Get Search result data from 3.1(phenotype)
                    DonorMatchResult donorMatchResultFromHap3 = getSearchResultfromHap3(phenotypeIds.get(index));

                    //3. Get Search result data from 4(patient guid)
                    DonorMatchResult donorMatchResultFromHap4 = getSearchResultfromHap4(patientGuids.get(index));
                    Writer.writeToPassResultFile("\n-----------------------\n");
                    Writer.writeToPassResultFile("\tPatient Guid: "+ patientGuids.get(index));
                    Writer.writeToPassResultFile("\tPhenotype ID: "+ phenotypeIds.get(index));
                    Writer.writeToPassResultFile("\t"+hap3Count.toString());
                    Writer.writeToPassResultFile("\t"+hap4Count.toString());
                    Writer.writeToPassResultFile("\n-----------------------\n");
                    Passcount++;

                    HelperMethods.compareSearchResultsForPatient(patientGuids.get(index), Writer.deltaFile, Writer.PassResultFile,hap4Count.getHap4DonorCount(), hap4Count.getHap4CordCount());
                }
                else{

                    Writer.writeToDeltaFile("\n------------ ---------- ------------- --------------- --------------\n");
                    Writer.writeToDeltaFile("\nPhenotypeID: "+ phenotypeIds.get(index));
                    Writer.writeToDeltaFile("\n");
                    Writer.writeToDeltaFile("patientGuid: "+ patientGuids.get(index));
                    Writer.writeToDeltaFile("\n");
                    Writer.writeToDeltaFile("Hap3 count"+ hap3Count.toString()+"\n");
                    Writer.writeToDeltaFile("Hap3 count"+ hap4Count.toString()+"\n");
                    Writer.writeToDeltaFile("\n------------ ---------- ------------- --------------- --------------\n");
                    //TODO:Print missing guids.
                    FailCount++;
                }
                index++;
            }
        }
        Writer.writeToPassResultFile("TOTAL PASSED (COUNT):"+Passcount);
        Writer.writeToDeltaFile("TOTAL FAILED (COUNT): "+FailCount);
    }

    public static Statement connectionToOracle(){
        Statement stmt=null;
        try{
            //Connection1
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = null;
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@mn1s32004:1573:idatast2", "MADEPU", "Depu_2018");
            stmt=connection.createStatement();
        }catch(Exception e){e.printStackTrace();}

        return stmt;
    }

    public static Hap3Count SearchResultByPhenotypeCount(int phenotype){
        Statement donorCountQueryStatement = connectionToOracle();
        Statement cordCountQueryStatement = connectionToOracle();

        String DonorCountQuery = "select count(*) AS Hap3Count  from HAPLOGIC.DONOR_MATCH_RESULT dmr join haplogic.phenotype p on p.phenotype_iid = dmr.base_phenotype_iid join haplogic.phenotype pm on pm.phenotype_iid = dmr.match_phenotype_iid where dmr.base_phenotype_iid = "+ phenotype;
        String CordCountQuery = "select count(*) AS Hap3Count  from HAPLOGIC.CBU_MATCH_RESULT dmr join haplogic.phenotype p on p.phenotype_iid = dmr.base_phenotype_iid join haplogic.phenotype pm on pm.phenotype_iid = dmr.match_phenotype_iid where dmr.base_phenotype_iid = "+ phenotype;

        Hap3Count hap3Count = new Hap3Count();

        try{
            ResultSet donorCountResultSet = donorCountQueryStatement.executeQuery(DonorCountQuery);
            ResultSet cordCountResultSet = cordCountQueryStatement.executeQuery(CordCountQuery);

            //fetching donor count
            while (donorCountResultSet.next()){
                hap3Count.setHap3DonorCount(donorCountResultSet.getInt("Hap3Count"));
            }
            while(cordCountResultSet.next()){
                hap3Count.setHap3CordCount(cordCountResultSet.getInt("Hap3Count"));
            }
            Writer.writeToLogFile("\nPhenotypeID: "+phenotype+"Hap3 Counts: "+ hap3Count.toString()+"\n");
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Hap3 Count"+ hap3Count.toString());

//        try{
//            donorCountQueryStatement.close();
//            cordCountQueryStatement.close();
//        }catch(Exception e){e.printStackTrace();}
        return hap3Count;
    }

    public static Hap4Count SearchResultByPatientGuidCount(String patientGuid) {

        Statement statement = connectionToOracle();
        String query ="select count (*) as Hap3Count from HAPLOGIC.SOLR_DONOR_MATCH_RESULT sdmr where sdmr.BASE_SUBJECT_GUID='"+patientGuid+"'and sdmr.SEQUENCE_NUMBER=1";
        Hap4Count hap4Count = new Hap4Count();

        //rest call to viewPotentailSources
        if(restEndPoint){
            //donor count
            ViewPotentialSourcesRequest donorviewPotentialSourcesRequest = new ViewPotentialSourcesRequest();
            donorviewPotentialSourcesRequest = getviewPotentialSourcesRequestObject("DONOR",patientGuid,5);
            Response response = restCall(Constants.potentialSources,donorviewPotentialSourcesRequest);

            if(response.getStatusCode()!= 200) {
                //write to logs
                Writer.writeToLogFile("This "+patientGuid+ "does not have potential sources of type 'DONOR' ");
            }
            else{
                ViewPotentailSourcesResponse donorViewPotentialSourcesResponse = response.body().as(ViewPotentailSourcesResponse.class);
                hap4Count.setHap4DonorCount(donorViewPotentialSourcesResponse.getTotalNumberOfResults());
            }

            //cord count
            ViewPotentialSourcesRequest cordViewPotentialSourcesRequest = new ViewPotentialSourcesRequest();
            cordViewPotentialSourcesRequest = getviewPotentialSourcesRequestObject("CORD",patientGuid,5);
            Response response1 = restCall(Constants.potentialSources,cordViewPotentialSourcesRequest);

            if(response1.getStatusCode()!= 200) {
                //writeToLogs
                Writer.writeToLogFile("This "+patientGuid+ "does not have potential sources of type 'CORD' ");
            }
            else{
                ViewPotentailSourcesResponse cordViewPotentialSourcesResponse = response1.body().as(ViewPotentailSourcesResponse.class);
                hap4Count.setHap4CordCount(cordViewPotentialSourcesResponse.getTotalNumberOfResults());
            }
            Writer.writeToLogFile("\nPatientGuid: "+patientGuid+"Hap4 Counts: "+ hap4Count.toString()+"\n");
        }
        return hap4Count;
    }



    public static DonorMatchResult getSearchResultfromHap3(int phenotypeID){
        String query = "select pm.subject_guid match_guid,pm.sequence_num match_seq_num, dmr.*, p.subject_guid patient_guid,p.SEQUENCE_NUM patient_seq_num from HAPLOGIC.DONOR_MATCH_RESULT dmr join haplogic.phenotype p on p.phenotype_iid = dmr.base_phenotype_iid join haplogic.phenotype pm on pm.phenotype_iid = dmr.match_phenotype_iid where dmr.base_phenotype_iid = "+phenotypeID;
        DonorMatchResult donorMatchResult = new DonorMatchResult();
        try{
            ResultSet rs = Hap3Statement.executeQuery(query);
            donorMatchResult = DonorMatchResultFromResultSet(rs);
        }catch (Exception e){e.printStackTrace();}
        return donorMatchResult;
    }
    public static DonorMatchResult getSearchResultfromHap4(String patientGuid){
        String query = "select * from HAPLOGIC.SOLR_DONOR_MATCH_RESULT sdmr where sdmr.BASE_SUBJECT_GUID='"+patientGuid+"' and sdmr.SEQUENCE_NUMBER=1";
        DonorMatchResult donorMatchResult = new DonorMatchResult();
        try{
            ResultSet rs = Hap4Statement.executeQuery(query);
            donorMatchResult = DonorMatchResultFromResultSet(rs);
        }catch(Exception e){e.printStackTrace();}
        return donorMatchResult;
    }

    public static DonorMatchResult DonorMatchResultFromResultSet(ResultSet rs){
        DonorMatchResult donorMatchResult = new DonorMatchResult();
        try{
            while (rs.next()){
                donorMatchResult.setXOF6_MCAT_ID(String.valueOf(rs.getInt("XOF6_MCAT_ID")));
                donorMatchResult.setXOF8_MCAT_ID(String.valueOf(rs.getInt("XOF6_MCAT_ID")));
                donorMatchResult.setXOF10_MCAT_ID(String.valueOf(rs.getInt("XOF10_MCAT_ID")));
                //donorMatchResult.setUPDATE_DTE(rs.getString(4));
                donorMatchResult.setSIX_MATCH_RATE(String.valueOf(rs.getInt("SIX_MATCH_RATE")));
                //donorMatchResult.setNMDP_DID(rs.getString(4));
                donorMatchResult.setLOC_MATCH_CNT(String.valueOf(rs.getInt("LOC_MATCH_CNT")));
                donorMatchResult.setLOC_9OF10_RTE(String.valueOf(rs.getInt("LOC_9OF10_RTE")));
                donorMatchResult.setLOC_8OF10_RTE(String.valueOf(rs.getInt("LOC_8OF10_RTE")));
                donorMatchResult.setLOC_8OF8_RTE(String.valueOf(rs.getInt("LOC_8OF8_RTE")));
                donorMatchResult.setLOC_7OF8_RTE(String.valueOf(rs.getInt("LOC_7OF8_RTE")));
                donorMatchResult.setLOC_6OF8_RTE(String.valueOf(rs.getInt("LOC_6OF8_RTE")));
                donorMatchResult.setLOC_10OF10_RTE(String.valueOf(rs.getInt("LOC_10OF10_RTE")));
                donorMatchResult.setFOUR_MATCH_RATE(String.valueOf(rs.getInt("FOUR_MATCH_RATE")));
                donorMatchResult.setFIVE_MATCH_RATE(String.valueOf(rs.getInt("FIVE_MATCH_RATE")));
                donorMatchResult.setDRB1_MATCH_GRADE_NBR(String.valueOf(rs.getInt("DRB1_MATCH_GRADE_NBR")));
                donorMatchResult.setDRB1_MATCH_RATE(String.valueOf(rs.getInt("DRB1_MATCH_RATE")));
                donorMatchResult.setDQB1_MATCH_GRADE_NBR(String.valueOf(rs.getInt("DQB1_MATCH_GRADE_NBR")));
                donorMatchResult.setDQB1_MATCH_RATE(String.valueOf(rs.getInt("DQB1_MATCH_RATE")));
                //donorMatchResult.setDONOR_MATCH_RESULT_IID(rs.getString(4));
                donorMatchResult.setC_MATCH_RATE(String.valueOf(rs.getInt("C_MATCH_RATE")));
                donorMatchResult.setC_MATCH_GRADE_NBR(String.valueOf(rs.getInt("C_MATCH_GRADE_NBR")));
                //donorMatchResult.setCREATE_DTE(rs.getString(4));
                donorMatchResult.setB_MATCH_GRADE_NBR(String.valueOf(rs.getInt("B_MATCH_GRADE_NBR")));
                donorMatchResult.setB_MATCH_RATE(String.valueOf(rs.getInt("B_MATCH_RATE")));
                donorMatchResult.setA_MATCH_RATE(String.valueOf(rs.getInt("A_MATCH_RATE")));
                donorMatchResult.setA_MATCH_GRADE_NBR(String.valueOf(rs.getInt("A_MATCH_GRADE_NBR")));
                donorMatchResult.setAB_MCAT_ID(String.valueOf(rs.getInt("AB_MCAT_ID")));
            }
        }catch (Exception e){e.printStackTrace();}
        return donorMatchResult;
    }



    public static Response restCall(String endpoint, Object requestObject) {
        String url = Constants.BASE_URI+endpoint;
        Response response = given().log().all()
                .contentType(ContentType.JSON)
                .body(requestObject, JACKSON_2)
                .when().post(url).thenReturn();
        System.out.println("STATUS CODE: "+response.getStatusCode());
        return response;
    }


    public static ViewPotentialSourcesRequest getviewPotentialSourcesRequestObject(String sourceType, String patientGuid, int pageSize){
        ViewPotentialSourcesRequest viewPotentialSourcesRequest = new ViewPotentialSourcesRequest();
        if(sourceType==Constants.DONOR_SOURCE_TYPE){
            viewPotentialSourcesRequest.setPageNumber(0);
            viewPotentialSourcesRequest.setPageSize(pageSize);
            viewPotentialSourcesRequest.setPatientGuid(patientGuid);
            viewPotentialSourcesRequest.setProductType("NMDP");
            viewPotentialSourcesRequest.setSequenceNumber(1);
            viewPotentialSourcesRequest.setSourceType("DONOR");
        }
        if(sourceType==Constants.CORD_SOURCE_TYPE){
            viewPotentialSourcesRequest.setPageNumber(0);
            viewPotentialSourcesRequest.setPageSize(pageSize);
            viewPotentialSourcesRequest.setPatientGuid(patientGuid);
            viewPotentialSourcesRequest.setProductType("NMDP");
            viewPotentialSourcesRequest.setSequenceNumber(1);
            viewPotentialSourcesRequest.setSourceType("CORD");
        }
        return  viewPotentialSourcesRequest;
    }
}
