import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;
/**
 * The TextBlob class holds the text of an author.
 * 
 * @author Haley Ittner 
 * @verson 11/18/2015
 */
public class TextBlob extends Object {
    // The string that holds text.
       private String textBody = "";
       // The string that holds the id of the text.
       private String textID = "";
       // A file reader to read te text files for the text blob.
       FileReader filer = null;
       // A buffered reader to read the text from the file reader.
       BufferedReader reader= null;      
    // Constructor that takes no parameters   
    public TextBlob() {
    }
    /**
     * Constructor that creates a TextBlob with text.
     * @param text the text the new text blob will hold.
     */
    public TextBlob(String text) {
        if(textBody.length() > 2147483647) {
            System.out.println("Error: text too large");
        } else {
        textBody = text;
    }
    }
    /**
     * Constructor that creates a text blob with both an id and a body.
     * @param text the text the text blob will hold.
     * @param id the ID of the text blob.
     */
    public TextBlob(String id, String text) {
        if(textBody.length() > 2147483647) {
            System.out.println("Error: text too large");
            textID = id;
        } else {
        textBody = text;
        textID = id;
    }
    }
    /**
     * Constructor that creates a text blob from text, or a file, with an id.
     * @param id the ID of the text blob.
     * @param text the text to put into the text blob.
     * @param filename the name of the file with the text to put into the text blob
     */
    public TextBlob(String id, String text, String filename) {
        textID = id;
        try {
                filer = new FileReader(filename);
                reader = new BufferedReader(filer);
                String line;
                while((line = reader.readLine()) != null) {
                    text += line;
        }
        filer.close();
        } catch (java.io.IOException ioe) {
            System.err.println(ioe);
            textBody = null;
        }
        if(textBody.length() > 2147483647) {
            System.out.println("Error: text too large");
        } else {
            textID = id;
            textBody = text;
    }
}
    /**
     * Method to append the text of a certain text blob.
     * @param text the text to be added to the text blob.
     */
    public void append(String text) {
        textBody += text;
    }
    /**
     * A method to access the id of a text blob.
     * @return the id of the text blob.
     */
    public String id() {
        return textID;
    }
    /**
     * A method to get the number of characters in a text blob.
     * @return the number of characters in a text blob.
     */
    public long numberOfCharacters() {
        textBody.replaceAll("\\W", "");
        return textBody.length();
    }
    /**
     * A method to get the text body of a text blob.
     * @return the text of the text blob.
     */
    public String text() {
        return textBody;
    }
    /**
     * A method to append the text blob using text or a file.
     * @param text the text to append to the text blob.
     * @param filename the file of text to be appended to the text blob.
     */
    public void append(String text, String filename) {
        if(text == null) {
            try {
                filer = new FileReader(filename);
                reader = new BufferedReader(filer);
                String line;
                while((line = reader.readLine()) != null) {
                    text += line;
        }
        filer.close();
        } catch (java.io.IOException ioe) {
            System.err.println(ioe);
            textBody = null;
        }
            textBody = textBody + text;
        } else {
    if(filename == null) {
        textBody = textBody + text;
    } else {
         try {
                filer = new FileReader(filename);
                reader = new BufferedReader(filer);
                String line;
                while((line = reader.readLine()) != null) {
                    text += line;
        }
        filer.close();
        } catch (java.io.IOException ioe) {
            System.err.println(ioe);
            textBody = null;
        }
            textBody = textBody + text;
        }
    }
}
}