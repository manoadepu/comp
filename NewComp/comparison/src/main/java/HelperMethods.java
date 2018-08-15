import models.DonorMatchResult;
import models.ViewPotentialSourcesRequest;
import io.restassured.response.Response;
import models.viewPotentialSources.Source;
import models.viewPotentialSources.ViewPotentailSourcesResponse;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.*;

public class HelperMethods {

    //order
    //compareDonorSearchResults
    //

    static Compare compare = new Compare();


    /**
     *
     * @param patientGuid
     * @param deltaFile
     * @param passResultFile
     */
    public static void compareSearchResultsForPatient(String patientGuid, File deltaFile, File passResultFile, int donorCount, int cordCount){
        Writer.writeToComparisionDeltaFile("\n***************************************************************************************\n");
        Writer.writeToComparisionDeltaFile("\t***********PatientGuid:"+patientGuid+" ***********");
        Writer.writeToComparisionDeltaFile("\n****************************************************************************************\n");
        //getDonors from 4.1
        ViewPotentialSourcesRequest DonorSearchRequest = new ViewPotentialSourcesRequest();
        DonorSearchRequest = Compare.getviewPotentialSourcesRequestObject("DONOR",patientGuid,donorCount-1);
        Response donorSearchResultsResponse = Compare.restCall(Constants.potentialSources,DonorSearchRequest);

        ViewPotentailSourcesResponse cordSearchResults = new ViewPotentailSourcesResponse();
        ViewPotentailSourcesResponse donorsSearchResults = new ViewPotentailSourcesResponse();
        if(donorSearchResultsResponse.getStatusCode()!=200){
            Writer.writeToComparisionDeltaFile("\nNo donors in potential sources for patient: "+ patientGuid+" \n");
        }
        else{
            donorsSearchResults = donorSearchResultsResponse.getBody().as(ViewPotentailSourcesResponse.class);
            DonorHelperMethods.compareDonorSearchResults(patientGuid, donorsSearchResults);
        }

        //TODO: compare cord results

//        //getCords from 4.1
//        ViewPotentialSourcesRequest CordSearchRequest = new ViewPotentialSourcesRequest();
//        CordSearchRequest = Compare.getviewPotentialSourcesRequestObject("CORD",patientGuid,cordCount-1);
//        Response cordSearchResultsResponse = Compare.restCall(Constants.potentialSources,CordSearchRequest);
//
//        if(cordSearchResultsResponse.getStatusCode()!=200){
//            writeToComparisionDeltaFile("\nNo Cords in potential sources for patient: "+ patientGuid+" \n");
//        }
//        else{
//            cordSearchResults = cordSearchResultsResponse.getBody().as(ViewPotentailSourcesResponse.class);
//            CordHelperMethods.compareCordSearchResults(cordSearchResults);
//        }
    }






    /**
     * Comparing Hap3 Map and Hap4 Map - map has all the donors with subject guid as the key
     * @param Hap3DonorSources
     * @param Hap4DonorSources
     */
    public static void compareHap3DonorMapToHap4DonorMap(HashMap<String, DonorMatchResult> Hap3DonorSources, HashMap<String, DonorMatchResult> Hap4DonorSources){
        System.out.println("Comparing Hap3 and Hap4 results");
        //TODO: verify both the maps size is same
        //comparing to maps - values
        Iterator it = Hap3DonorSources.entrySet().iterator();

        for (Map.Entry<String, DonorMatchResult> entry : Hap3DonorSources.entrySet()) {
            String key = entry.getKey();
            DonorMatchResult Hap3DonorMatchResult = new DonorMatchResult();
            DonorMatchResult Hap4DonorMatchResult = new DonorMatchResult();
            Hap3DonorMatchResult = entry.getValue();

            //getting hap4 object
            Hap4DonorMatchResult = Hap4DonorSources.get(entry.getKey());

            Writer.writeToComparisionDeltaFile("\nComparing match results for donor: "+ entry.getKey()+"\n");
            DonorResultsComparator comparator = new DonorResultsComparator();
            comparator.compare(Hap3DonorMatchResult,Hap4DonorMatchResult);
        }

    }







}
