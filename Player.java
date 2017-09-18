
/**
 * The characteristics of the player are stored in the player class.
 * 
 * @author Haley Ittner
 * @version 11/8/2015
 */
public class Player
{
    String name = null;
    int tokens = 100;

    /**
     * Contructs a player object.
     */
    public Player()
    {
    }
    // Sets the name of the player.
    public String setName(String userName) {
        this.name = userName;
        return name;
    }
    /**
     * Returns the value of tokens the player has.
     * @return tokens how many tokens the player currently has.
     * */
    public int numberOfTokens()
    {
        return tokens;
    }
    /**
     * Returns the name of the Player
     * @return name the name of the player currently playing.
     */
    public String getName() {
        return name;
    }
    /**
     * When the player starts a round they lose 10 tokens.
     * @return the current amount of tokens the player had minus 10.
     */
    public int roundFee()
    {
        return tokens -= 10;
    }
    /** 
     * When a player wins a round they gain 20 tokens
     * @return the cureent amoun of tokens the player had plus 20.
     */
    public int winning() {
        return tokens += 20;
    }
}
