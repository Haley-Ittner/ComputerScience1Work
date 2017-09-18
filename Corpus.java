import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
/**
 * Corpus of works by one author, with access to attributes of said corpus
 * 
 * @author Haley Ittner
 * @version 12/2/2015
 */
public class Corpus extends AbstractCorpus
{
    // The name of the author for the corpus
    private Author name;
    // the collection of the authors work
    private ArrayList<TextBlob> bodyOfWork = new ArrayList<TextBlob>();
    // A map of characters and longs
    private Map<Character, Long> map;
    // A map of strings and longs
    private Map<String, Long> map2;
    // A map of characters and doubles
    private Map<Character, Double> map3;
    // A map of strings and doubles
    private Map<String, Double> map4;
    // A constructor that takes no parameters
    public Corpus()
    {
    }
    /**
     * Constructor that takes a author object.
     * @param author the Author that belongs to this corpus.
     */
    public Corpus(Author author)
    {
       name = author;
    }
    /**
     *  A constructor that takes both a textblob and an author for this corpus
     *  @param author name of the author for this body of work
     *  @param text the textblob of the author to add to the corpus
     */
    public Corpus(Author author, TextBlob text)
    {
       name = author;
       bodyOfWork.add(text);
    }
    /**
     * A method to add tect to the corpus
     * @param text the text to be added to the corpus
     */
    public void addText(TextBlob text)
    {
         bodyOfWork.add(text);
    }
    /**
     * A method to find the average length of words in a corpus
     * @return the average length of thewords in this corpus
     */
    public long averageWordLength()
    {
        return numberOfCharacters()/numberOfWords();        
    }
    /**
     * A method to find how many characters are in a corpus
     * @return the number of characters in a corpus
     */
    public long numberOfCharacters()
    {
        String workingText = "";
        for(TextBlob text : bodyOfWork) {
        workingText += text.text().replaceAll("\\W", "");
    }
        return workingText.length();
    }
    /**
     * A method to find the number of words in a corpus
     * @return the number of words in the corpus.
     */
    public long numberOfWords()
    {   
        String workingText = "";
        long counter = 0L;
        for(TextBlob work : bodyOfWork) {
            workingText = work.text();
            workingText.trim();
            for(int x = 0; x < workingText.length(); x++) {
                if(workingText.substring(x, x + 1).equals(" ")) {
                    counter += 1L;
                }
            }
        }
        return counter + 1L;
    }
    public Collection<TextBlob> texts()
    {
        return bodyOfWork;
    }
    public Map<Character, Long> actualSymbolFrequencies() {
        return map;
    }
    public Map<String,Long> actualSymbolPairFrequencies() {
        return map2;
    }
    public long averageSentenceLength() {
        return 1L;
    }
    public long numberOfSentences() {
        return 1L;
    }
    public Map<Character,Double> relativeSymbolFrequencies() {
        return map3;
    }
    public Map<String,Double> relativeSymbolPairFrequencies() {
        return map4;
    }
    public double vocabularyRichness() {
        return 0.0;
    }
}
