
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
/**
 * Write a description of class DialogUserInterface here.
 * 
 * @author Haley Ittner 
 * @version 11/8/2015
 */
// A dialog-based user interface.
public class DialogUserInterface implements UserInterface {
    // Contents of the title bar.
    private String titleBarText = "";
    // Icon for dialogs.
    private ImageIcon icon = new ImageIcon();
    /** Constructs user interface with specified title bar text.
     * @param title text to be displayed in the title bar.
     */
public DialogUserInterface(final String title) {
    this.titleBarText = title;
}
/** Show message requiring user to acknowledge.
 * @param messgae the message to be shown.
 */
@Override
public void showMessage(final String message) {
    JOptionPane.showMessageDialog(
    null,
    message,
    this.titleBarText,
    JOptionPane.PLAIN_MESSAGE);
}
 /** Asks a question and prompts for a Yes or No response.
     * Returns <CODE>true</CODE> is uder responds Yes;
     * <CODE>false</CODE> otherwise.
     * @param question the question to present o the user.
     * @return <CODE>true</CODE> if and only if the user response begins with "Y" or "y".
     */
@Override
public boolean askYesNoQuestion(final String question) {
    int response = JOptionPane.showConfirmDialog(
            null,
            question,
            this.titleBarText,
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            this.icon
            );
    switch (response) {
        case 0: return true;
        case 1: return false;
        case -1: return false;
        default: return false;
    }
}
/** Prompts then accpets and returns a user-entered string.
     * @param prompt message to show user.
     * @return string enetered by user.
     * */
@Override
public String requestString(final String prompt){
    return JOptionPane.showInputDialog(
            null,
            prompt,
            this.titleBarText,
            JOptionPane.PLAIN_MESSAGE);
        }
}