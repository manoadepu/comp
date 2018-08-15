import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    static Compare compare = new Compare();
    //static Connection connection = null;
    public static void main(String[] argv) throws Exception{
        compareDonorMatchResult();
    }

    public static void compareDonorMatchResult(){
        Writer.writeToLogFile("===========Search Results Comparision started================");
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

        List<String> patientGuids = new ArrayList<String>();
        List<Integer> phenotypeIds = new ArrayList<Integer>();
        try{
            Statement stmt = compare.connectionToOracle();

            File file = new File("/Users/madepu/DEV/comparison/src/main/resources/PatientGuids");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
               patientGuids.add(line);
            }
            int count =1;
            Writer.writeToLogFile("\nLoading . . . \n");
            for (String pGuid: patientGuids) {
                Writer.writeToLogFile("\n\t"+count+".patientGuid: "+ pGuid);
                ResultSet phenotypesResult = stmt.executeQuery("Select PHENOTYPE_IID from haplogic.phenotype where subject_guid='"+pGuid+"' and SEQUENCE_NUM=1");
                while (phenotypesResult.next()){
                    phenotypeIds.add(phenotypesResult.getInt("PHENOTYPE_IID"));
                }
                count++;
            }
            compare.CompareCountAndResults(phenotypeIds, patientGuids);
        }catch(Exception e){
            e.printStackTrace();
        }
    }}

