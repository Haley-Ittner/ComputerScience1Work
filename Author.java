
/**
 * The Author class of the Authorship Analysis project, that holds the information on an 
 * individual author.
 * 
 * @author Haley Ittner
 * @version 11/16/2015
 */
public class Author extends Object {
    // Constant variable for unknown authors.
    public static final String UNKNOWN_AUTHOR = "Anonymous";
    // Constant variable for unknown median year.
    public static final int UNKNOWN_YEAR = 0;
    // A string field that holds the name of the author, if there is one.
    private static String authorName;
    // An int field that holds the median year of the author's work.
    private static int medianYear;
    // A constuctor that take no parameters.
    public Author() {
        authorName = UNKNOWN_AUTHOR;
        medianYear = UNKNOWN_YEAR;
    }
    /**
     * A constructor that takes one parameter for the authors name.
     * @param name the name of the author.
     */
    public Author(String name) {
        authorName = name;
        medianYear = UNKNOWN_YEAR;
    }
    /**
     * A constructor that takes two parameters, the median year and the authors name.
     * @param name the name of the author
     * @param year the median year of the authors work.
     */
    public Author(String name, int year) {
        authorName = name;
        medianYear = year;
    }
    /**
     * An accessor method to get the author's name.
     * @return the name of the author.
     */
    public String name() {
        return authorName;
    }
    /**
     * An accessor method to get the median year of the author's work.
     * @return the median year of the author's work.
     */
    public int year() {
        return medianYear;
    }
}
