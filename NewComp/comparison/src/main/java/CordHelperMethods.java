import models.DonorMatchResult;
import models.viewPotentialSources.Source;
import models.viewPotentialSources.ViewPotentailSourcesResponse;

import java.util.HashMap;
import java.util.List;

public class CordHelperMethods {
    /**
     * compare cord search results
     * input: Hap4.1 cord search results(ViewPotentailSourcesResponse)
     * @param cordSearchResults
     */
    public static HashMap<String, DonorMatchResult> compareCordSearchResults(ViewPotentailSourcesResponse cordSearchResults){
        int index = 0;
        int numberOfCordSources = cordSearchResults.getSources().size();
        List<Source> cordSources = cordSearchResults.getSources();
        while(numberOfCordSources>index){
            Source cordSource = cordSources.get(index);
            index++;
            System.out.println("Donor source: "+cordSource.toString());

            //Comparing each cordSource with oracle phenotype
            //TODO
        }
        return null;
    }
}
