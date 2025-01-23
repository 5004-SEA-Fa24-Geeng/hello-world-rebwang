package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc
 * 
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 * 
 */
public class Greeting {
    private int localityID;
    private String localityName;
    private String asciiGreeting;
    private String unicodeGreeting;
    private String formatStr;

    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");

    }

    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %%s!");

    }

    /**
     * Constructs a new Greeting object and initializes to the given localityID, localityName,
     * asciiGreeting, unicodeGreeting, and formatStr.
     * @param localityID
     * @param localityName
     * @param asciiGreeting
     * @param unicodeGreeting
     * @param formatStr
     */
    public Greeting(int localityID, String localityName, String asciiGreeting,
                    String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    public int getLocalityID() {
        return this.localityID;
    }

    public String getLocalityName() {
        return this.localityName;
    }

    public String getAsciiGreeting() {
        return this.asciiGreeting;
    }

    public String getUnicodeGreeting() {
        return this.unicodeGreeting;
    }

    public String getFormatStr() {
        if (this.localityName.equals("China")) {
            return String.format("%%s, %s!", this.unicodeGreeting);
        }
        else {
            return String.format("%s, %%s!", this.unicodeGreeting);
        }
    }

    public String getFormatStr(boolean asciiOnly) {
        if (asciiOnly) {
            if (this.localityName.equals("China")) {
                return String.format("%%s, %s!", this.asciiGreeting);
            }
            else {return String.format("%s, %%s!", this.asciiGreeting);}
        }
        else {
            if (this.localityName.equals("China")) {
                return String.format("%%s, %s!", this.unicodeGreeting);
            }
            else {return String.format("%s, %%s!", this.unicodeGreeting);}
        }
    }

//    public String toString() {
//
//    }


    public static void main(String[] args) {

    }

}
