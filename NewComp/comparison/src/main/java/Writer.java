import org.apache.commons.io.FileUtils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Writer {

    public static String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
    public static String comparisionDeltaFilePath="/Users/madepu/DEV/comparison/src/main/resources/output/ComparisionDelta_"+timeStamp;
    public static File ComparisionDeltaFile = new File(comparisionDeltaFilePath);

    public static String deltaFilePath="/Users/madepu/DEV/comparison/src/main/resources/output/delta_"+timeStamp;
    public static File deltaFile = new File(deltaFilePath);


    public static String TODOFilePath="/Users/madepu/DEV/comparison/src/main/resources/output/TODO_"+timeStamp;
    public static File TODOFile = new File(TODOFilePath);

    public static String LogFilePath="/Users/madepu/DEV/comparison/src/main/resources/output/Logs_"+timeStamp;
    public static File LogFile = new File(LogFilePath);

    public static String PassResultFilePath="/Users/madepu/DEV/comparison/src/main/resources/output/Passed_"+timeStamp;
    public static File PassResultFile = new File(PassResultFilePath);
    /**
     * writes to comparision delta file.
     * @param message
     */
    public static void writeToComparisionDeltaFile(String message) {
        try{
            FileUtils.writeStringToFile(ComparisionDeltaFile,message,true);
        }catch(Exception e){e.printStackTrace();}
    }

    public static void writeToTODOFile(String message) {
        try{
            FileUtils.writeStringToFile(TODOFile,message,true);
        }catch(Exception e){e.printStackTrace();}
    }

    public static void writeToPassResultFile(String message) {
        try{
            FileUtils.writeStringToFile(PassResultFile,message,true);
        }catch(Exception e){e.printStackTrace();}
    }

    public static void writeToDeltaFile(String message) {
        try{
            FileUtils.writeStringToFile(deltaFile,message,true);
        }catch(Exception e){e.printStackTrace();}
    }

    public static void writeToLogFile(String message) {
        try{
            FileUtils.writeStringToFile(LogFile,message,true);
        }catch(Exception e){e.printStackTrace();}
    }
}
