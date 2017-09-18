import java.util.ArrayList;
/**
 * This is the game of craps, that uses either a console or dialog boxes to play with the user. 
 * 
 * @author Haley Ittner 
 * @version 11/8/2015
 */
public class DiceGame
{
    // Plays the Dice Game.
   public static void main(String[] args) {
       // An arayy of type Player.
       ArrayList<Player> group = new ArrayList<Player>();
       // The default user interface when nothing is enetered.
       UserInterface ui = new DialogUserInterface("The Dice Game");
       /** If the user chooses to continue in dialog mode, a new dialog object is launched.
        * If they choose no, then a new console object is launched. 
        */
       if(ui.askYesNoQuestion("Do you want to use dialog?")) {
           ui = new DialogUserInterface("The Dice Game");
        } else {
            ui = new ConsoleUserInterface("The Dice Game");
        }
        // The opening message to the player.
       ui.showMessage("Welcome!");
       //Prompts the user if they would like to play the Dice Game.
       ui.askYesNoQuestion("Would you like to play the Dice Game?");
       // Saves the answer to how many players are playing the game
       String answer = ui.requestString("How many players are playing?");
       //Converts the string (the number of players) to an int so it can be used.
       int unit = Integer.parseInt(answer);
       //Initializing an int x, used in the while loop, to 0.
       int x = 0;
       //While x is less than the number of players, a new player is added to the group arraylist.
       while(x < unit) {
           Player number1 = new Player();
           String response = ui.requestString("Please enter your name");
           number1.setName(response);
           group.add(number1);
           x++;
        }
       /**
        * While the user still answeres "Yes" when prompted, the game will continue. Once the
        * current player does not wish to play anymore, the next player will begin their game.
        */  
       for(Player current : group) {
       while(ui.askYesNoQuestion("Its " + current.getName() + "'s turn!\nYou have " + 
       current.numberOfTokens() + " tokens\nIt costs 10 tokens to play a round")){
           // 10 tokens are taken when the player agrees to play a round.
           current.roundFee();
           // Notifying the user the game has begun.
           ui.showMessage("The round has begun! \nHere's the comeout roll!");
           // A die is created to roll.
           Dice die1 = new Dice();
           // Another die is created to roll.
           Dice die2 = new Dice();
           // The sum of the two dice when rolled.
           int sum = die1.rollDice() + die2.rollDice();
           // If the sum is 7 or 11, the player has won the round. They also win 20 tokens. 
           if(sum == 7 || sum == 11){
           ui.showMessage("Your roll sum is " + sum + " Winner, winner, chicken dinner!");
           current.winning();
        }
        else {
            // If the sum is 2, 3, or 12 the player loses the round.
            if((sum == 2) || (sum == 3) || (sum == 12)) {
                ui.showMessage("Your roll sum is " + sum + " LoooOOOoooooser");
            }
            else {
                // If the sum is anything else, this notifys the user of that number.
                ui.showMessage("Your point number is " + sum);
                // A new int to store the original sum in.
                int smoosh = sum;
                // A new int that is going to store the new sum. 
                int doodybutts = 0;
                // While the new roll is not equal to 7 or smoosh, the rolling continues.
                while((doodybutts != 7) && (doodybutts != smoosh)) {
                // Doodybutts gets the new sum.
                doodybutts = die1.rollDice() + die2.rollDice();
                // Nofiying the player of the current sum.
                ui.showMessage("The current roll sum is " + doodybutts);
            }
            // If the sum is equal to 7 the player loses the round.
            if(doodybutts == 7) {
                ui.showMessage("LoooOOOooooser");
            }
            else {
                // If smoosh is equal to doodybutts then the player wins 20 tokens.
                ui.showMessage("Winner, winner, chicken dinner!");
                current.winning();
            }
            }
        }
       }
       /** When the player chooses to stop playing, this notifys the player of how many tokens
        * they leave with and to play again soon.
        */
       ui.showMessage(current.getName() + " left with " + current.numberOfTokens() + 
       " tokens! \nPlay again soon!");
}
}
}