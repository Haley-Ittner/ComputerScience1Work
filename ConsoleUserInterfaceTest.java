import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * Write a description of class ConsoleUserInterfaceTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConsoleUserInterfaceTest {
    private ConsoleUserInterface consoleUI1
        = new ConsoleUserInterface("DEMO TITLE");
@Test
public void showMessageActivation() {
    consoleUI1.showMessage("This is a message.");
}
@Test
public void askYesNTest() {
    assertTrue(consoleUI1.askYesNoQuestion("Testing: please type 'Yes'"));
    assertFalse(consoleUI1.askYesNoQuestion("Testing: Please type 'No'"));
    assertFalse(consoleUI1.askYesNoQuestion("Testing: Please respond with anything that does not begin "
    + "with a n/N or a y/Y"));
}
@Test
public void requestStringTest() {
    assertEquals("", consoleUI1.requestString(
               "Testing; Please press Return/Enter without typing any text"));
    assertEquals("Hello", consoleUI1.requestString(
               "Testing: Please enter the text 'Hello' (without quotes)"));
    }
}
