import java.util.Collection;
import java.util.Map;
/**
 * Corpus of works by one author, with access to attributes of said corpus
 * 
 * @author Haley Ittner
 * @version 12/2/2015
 */
public abstract class AbstractCorpus extends Object
{
    public AbstractCorpus()
    {
    }
    public abstract void addText(TextBlob text);
    public abstract long averageWordLength();
    public abstract long numberOfCharacters();
    public abstract long numberOfWords();
    public abstract Collection<TextBlob> texts();
    public abstract Map<Character, Long> actualSymbolFrequencies();
    public abstract Map<String,Long> actualSymbolPairFrequencies();
    public abstract long averageSentenceLength();
    public abstract long numberOfSentences();
    public abstract Map<Character,Double> relativeSymbolFrequencies();
    public abstract Map<String,Double> relativeSymbolPairFrequencies();
    public abstract double vocabularyRichness();
}
