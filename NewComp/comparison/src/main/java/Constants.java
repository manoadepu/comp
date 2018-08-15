public class Constants {
    private static Constants ourInstance = new Constants();

    public static Constants getInstance() {
        return ourInstance;
    }

    private Constants() {
    }

    public static String BASE_URI = "https://preprodhapws-rest.nmdp.org:8090";
    public static String potentialSources = "/potentialSources";
    public static String DONOR_SOURCE_TYPE = "DONOR";
    public static String CORD_SOURCE_TYPE = "CORD";


}
