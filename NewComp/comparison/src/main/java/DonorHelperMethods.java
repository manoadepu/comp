import models.DonorMatchResult;
import models.viewPotentialSources.Source;
import models.viewPotentialSources.ViewPotentailSourcesResponse;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;

public class DonorHelperMethods {

    /**
     * converts List<Sources> to HashMap<String, DonorMatchResult>
     * @param donorSources
     * @return
     */
    public static HashMap<String, DonorMatchResult> convertDonorSourcesListToHashMap(List<Source> donorSources){
        HashMap<String, DonorMatchResult> hap4DonorMatchResultHashMap = new HashMap<String, DonorMatchResult>();

        int listSize = donorSources.size();
        int index = 0;

        while(listSize>index){
            DonorMatchResult donorMatchResult = new DonorMatchResult();

            //XOF6_MCAT_ID not present in MatchResult
//            donorMatchResult.setXOF6_MCAT_ID(donorSources.get(index).getMatchResult().);
//            donorMatchResult.setXOF8_MCAT_ID();
//            donorMatchResult.setXOF10_MCAT_ID();

            //donorMatchResult.setUPDATE_DTE(rs.getString(4));
//            donorMatchResult.setSIX_MATCH_RATE();
            //donorMatchResult.setNMDP_DID(rs.getString(4));
//            donorMatchResult.setLOC_MATCH_CNT();
            donorMatchResult.setLOC_9OF10_RTE(String.valueOf(donorSources.get(index).getMatchResult().get9of10Pct()));
            donorMatchResult.setLOC_8OF10_RTE(String.valueOf(donorSources.get(index).getMatchResult().get8of10Pct()));
            donorMatchResult.setLOC_8OF8_RTE(String.valueOf(donorSources.get(index).getMatchResult().get8of8Pct()));
            donorMatchResult.setLOC_7OF8_RTE(String.valueOf(donorSources.get(index).getMatchResult().get7of8Pct()));
            donorMatchResult.setLOC_6OF8_RTE(String.valueOf(donorSources.get(index).getMatchResult().get6of8Pct()));
            donorMatchResult.setLOC_10OF10_RTE(String.valueOf(donorSources.get(index).getMatchResult().get10of10Pct()));
//            donorMatchResult.setFOUR_MATCH_RATE(String.valueOf(donorSources.get(index).getMatchResult().get));
//            donorMatchResult.setFIVE_MATCH_RATE(String.valueOf();
            donorMatchResult.setDRB1_MATCH_GRADE_NBR(String.valueOf(donorSources.get(index).getMatchResult().getDrb1MatchGrd()));
            donorMatchResult.setDRB1_MATCH_RATE(String.valueOf(donorSources.get(index).getMatchResult().getDrb1Pct()));
            donorMatchResult.setDQB1_MATCH_GRADE_NBR(String.valueOf(donorSources.get(index).getMatchResult().getDqb1MatchGrd()));
            donorMatchResult.setDQB1_MATCH_RATE(String.valueOf(donorSources.get(index).getMatchResult().getDqb1Pct()));
            //donorMatchResult.setDONOR_MATCH_RESULT_IID(rs.getString(4));
            donorMatchResult.setC_MATCH_RATE(String.valueOf(donorSources.get(index).getMatchResult().getCpct()));
//            donorMatchResult.setC_MATCH_GRADE_NBR(String.valueOf();
            //donorMatchResult.setCREATE_DTE(rs.getString(4));
            donorMatchResult.setB_MATCH_GRADE_NBR(String.valueOf(donorSources.get(index).getMatchResult().getBmatchGrd()));
            donorMatchResult.setB_MATCH_RATE(String.valueOf(donorSources.get(index).getMatchResult().getBpct()));
            donorMatchResult.setA_MATCH_RATE(String.valueOf(donorSources.get(index).getMatchResult().getApct()));
            donorMatchResult.setA_MATCH_GRADE_NBR(String.valueOf(donorSources.get(index).getMatchResult().getAmatchGrd()));
//            donorMatchResult.setAB_MCAT_ID(String.valueOf();

            hap4DonorMatchResultHashMap.put(donorSources.get(index).getSourceGuid(), donorMatchResult);
            index++;
        }
        return hap4DonorMatchResultHashMap;
    }


    /**
     * converts resultset to HashMap<String, DonorMatchResult>
     * @param rs
     * @return
     */
    public static HashMap<String, DonorMatchResult> getDonorMatchResultListFromResultSet(ResultSet rs){

        int numOfRecords = 0;
        HashMap<String, DonorMatchResult> donorMatchResultHashMap = new HashMap<String, DonorMatchResult>();
        try{
            while (rs.next()) {
                DonorMatchResult donorMatchResult = new DonorMatchResult();
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

                System.out.println(rs.getString(64));

                donorMatchResultHashMap.put(rs.getString(64), donorMatchResult);
                numOfRecords++;
            }
        }catch (Exception e){e.printStackTrace();}
        System.out.println("numOfRecords: "+ numOfRecords);
        return donorMatchResultHashMap;
    }

    /**
     * compares donor search results
     * input: Hap4.1 donor search results(ViewPotentailSourcesResponse)
     * @param donorSearchResults
     */
    public static void compareDonorSearchResults(String patientGuid, ViewPotentailSourcesResponse donorSearchResults){

        //key:patientGuid, value:Donors
        HashMap<String, DonorMatchResult> donorSearchResultsMapFromHap3 = new HashMap<String,DonorMatchResult>();
        HashMap<String, DonorMatchResult> donorSearchResultsMapFromHap4 = new HashMap<String,DonorMatchResult>();

        //connection to oracle to get the phenotype id
        Statement getPhenotypeIDStatement = Compare.connectionToOracle();

        //connection to oracle to fetch the donor search results
        Statement getDonorSearchResults = Compare.connectionToOracle();

        //Query to get the phenotype Id when we have patient guid
        int phenotypeID=0;
        String queryToFetchPhenotypeID = "Select PHENOTYPE_IID from haplogic.phenotype where subject_guid='"+patientGuid+"'";
        try{
            ResultSet phenotypeIDResultSet = getPhenotypeIDStatement.executeQuery(queryToFetchPhenotypeID);
            while(phenotypeIDResultSet.next()){
                phenotypeID = phenotypeIDResultSet.getInt("PHENOTYPE_IID");
            }
        }catch(Exception e){e.printStackTrace();}

        //Query to fetch donor search results for the phenotype retrieved from queryToFetchPhenotypeID
        String queryToFetchDonorSearchResults = "select *  from HAPLOGIC.DONOR_MATCH_RESULT dmr join haplogic.phenotype p on p.phenotype_iid = dmr.base_phenotype_iid join haplogic.phenotype pm on pm.phenotype_iid = dmr.match_phenotype_iid where dmr.base_phenotype_iid ="+phenotypeID;


        try{
            ResultSet donorsResultSet = getDonorSearchResults.executeQuery(queryToFetchDonorSearchResults);
            donorSearchResultsMapFromHap3 = DonorHelperMethods.getDonorMatchResultListFromResultSet(donorsResultSet);
        }catch(Exception e){e.printStackTrace();}


        donorSearchResultsMapFromHap4 = DonorHelperMethods.convertDonorSourcesListToHashMap(donorSearchResults.getSources());

        HelperMethods.compareHap3DonorMapToHap4DonorMap(donorSearchResultsMapFromHap3, donorSearchResultsMapFromHap4);

    }
}
