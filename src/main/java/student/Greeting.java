package student;
/**
 * This class is a place holder which you will fully implement based on the javadoc.
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 */

/**
 * The greeting class stores the locality ID, locality name, and a string format of the greeting
 * both ascii and unicode. That way the various ways to look at the greeting are paired together,
 * which could simplify the process of looking up the greeting making it easier to add additional
 * greeting types without having to change code in other places.
 */
public class Greeting {
    /** int value of locality. Mutable */
    private int localityID;

    /** holds the name of the locality. Immutable. */
    private String localityName;

    /** holds the greeting message in ascii characters. Immutable. */
    private String asciiGreeting;

    /** holds the greeting message in unicode characters. Immutable. */
    private String unicodeGreeting;

    /** holds the format of greeting message. Immutable. */
    private String formatStr;

    /**
     * This is a simple constructor that takes 2 arguments.
     * @param localityID int -> a number 1-4 represent country
     * @param localityName String -> country name
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");
    }

    /**
     * This is a constructor for the Greeting class that takes 3 arguments
     * @param localityID int -> a number 1-4 represent country
     * @param localityName String -> country name
     * @param greeting String -> greeting message
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }

    /**
     * This is the more specific constructor for Greeting class.
     * Constructs a new Greeting object and initializes to the given localityID, localityName,
     * asciiGreeting, unicodeGreeting, and formatStr.
     * @param localityID int
     * @param localityName String
     * @param asciiGreeting String -> Greeting message in ascii characters
     * @param unicodeGreeting String -> Greeting message in unicode
     * @param formatStr String -> format of a greeting message
     */
    public Greeting(int localityID, String localityName, String asciiGreeting,
                    String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * Getter method for the localityID of a Greeting object.
     * @return int -> the localityID of a Greeting object
     */
    public int getLocalityID() {
        return this.localityID;
    }

    /**
     * Getter method for the localityName of a Greeting object.
     * @return String -> the localityName of a Greeting object
     */
    public String getLocalityName() {
        return this.localityName;
    }

    /**
     * Getter method for the asciiGreeting message of a Greeting object.
     * @return String -> the asciiGreeting message
     */
    public String getAsciiGreeting() {
        return this.asciiGreeting;
    }

    /**
     * Getter method for the unicodeGreeting message of a Greeting object.
     * @return String -> the unicodeGreeting message
     */
    public String getUnicodeGreeting() {
        return this.unicodeGreeting;
    }

    /**
     * Gets the Unicode format string. This string will have a %s, so that the name can be inserted into
     * the greeting in the correct location.
     * @return String -> the format string with the greeting inserted into the format
     */
    public String getFormatStr() {
        if (this.localityName.equals("China")) {
            return String.format("%%s, %s!", this.unicodeGreeting);
        } else {
            return String.format("%s, %%s!", this.unicodeGreeting);
        }
    }

    /**
     * This string will have a %s, so that the name can be inserted into the greeting in the correct location.
     * @param asciiOnly boolean -> if true, insert asciiGreeting message
     * @return String -> the format string with the greeting inserted into the format.
     */
    public String getFormatStr(boolean asciiOnly) {
        if (asciiOnly) {
            if (this.localityName.equals("China")) {
                return String.format("%%s, %s!", this.asciiGreeting);
            } else {
                return String.format("%s, %%s!", this.asciiGreeting);
            }
        } else {
            if (this.localityName.equals("China")) {
                return String.format("%%s, %s!", this.unicodeGreeting);
            } else {
                return String.format("%s, %%s!", this.unicodeGreeting);
            }
        }
    }

    /**
     * Convert the object to a string.
     * @return String
     * Greeting usa = new Greeting(2, "USA");
     * it would print out:
     * "{localityID:2, localityName:\"USA\", asciiGreeting:\"Hello\", unicodeGreeting:\"Hello\"}"
     */
    public String toString() {
        return "{localityID:" + this.localityID + ", localityName:\"" + this.localityName
                + "\", asciiGreeting:\"" + this.asciiGreeting + "\", unicodeGreeting:\"" + this.unicodeGreeting + "\"}";
    }

}
