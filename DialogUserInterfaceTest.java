
/**
 * Write a description of class DialogUserInterfaceTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class DialogUserInterfaceTest
{
    private DialogUserInterface dialogUs1 = new DialogUserInterface("DEMO TITLE");
    @Test
    public void showMessageActivation(){
        dialogUs1.showMessage("This is a message.");
    }
    @Test
    public void askYesNoTest(){
         assertTrue(dialogUs1.askYesNoQuestion("Testing: Please select 'Yes'"));
         assertFalse(dialogUs1.askYesNoQuestion("Testing: Please select 'No'"));
         assertFalse(dialogUs1.askYesNoQuestion(
         "Testing: Please close this dialog without clicking on 'Yes' or 'No'"));
        }
        @Test
        public void requestStringTest() {
          assertEquals("", dialogUs1.requestString("Testing: Please click 'ok' without typing anything into the input field"));
          assertEquals("Hello", dialogUs1.requestString("Testing: Please enter the text 'Hello' (without quotes) into the input field and click 'ok'"));
          assertNull(dialogUs1.requestString("Testing: Please enter the text 'Hello' into the input field and click 'Cancel'"));
          assertNull(dialogUs1.requestString("Testing: Please enter the text 'Hello' into the input field then close this dialog without clicking 'Cancel' or 'ok'"));
}
}
