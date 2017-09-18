
/**
 * The User Interface that allows the program to communicate with the player. 
 * 
 * @author Haley Ittner 
 * @version 11/8/2015
 */
public interface UserInterface
{
  void showMessage(String message);

  /**
   * Asks a question and prompts for a Yes or No response.
   * Returns true if user responds Yes; false otherwise.
   * @param question the question to present to the user
   * @return true if and only if the user indicates Yes
   */
  boolean askYesNoQuestion(String question);

  /**
   * Prompts then accepts and returns a user-entered string.
   * @param prompt message to show user
   * @return string entered by user
   */
  String requestString(String prompt);
}
