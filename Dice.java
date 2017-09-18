import java.util.Random;
public class Dice {
   private int sides = 6;
   private Random random = new Random();
public Dice(){
}
public int rollDice() {
   return random.nextInt(sides) + 1;
} 
}