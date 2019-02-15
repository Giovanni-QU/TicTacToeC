import java.util.Scanner;
/**
 * Tic-Tac-Toe: Two-player console, non-graphics
 * @author relkharboutly
 * @date 1/5/2017
 */
public class TTTConsole  {
                                                     
      public static Scanner in = new Scanner(System.in); // the input Scanner
 //make a reference to tic tac toe class here, call methods on it
      public TicTacToe t = new TicTacToe();
   public static TicTacToe TTTboard = new TicTacToe();
   /** The entry main method (the program starts here) */
   public static void main(String[] args) {
      
	   int currentState = TicTacToe.PLAYING;
	   String userInput;
	   //game loop
	   do {
         TTTboard.printBoard();
         // Print message if game-over
         currentState = TTTboard.checkForWinner();
         if (currentState == ITicTacToe.CROSS_WON) {
             System.out.println("'X' won! Bye!");
          } else if (currentState == ITicTacToe.NOUGHT_WON) {
             System.out.println("'O' won! Bye!");
          } else if (currentState == ITicTacToe.TIE) {
             System.out.println("It's a TIE! Bye!");
          }
         /**
          * get player input here and call setMove(). user should input a number between 0-8
          */
         userInput = in.next();
         int loc = Integer.parseInt(userInput);
         TTTboard.setMove(1, loc);
         
         //user can break the loop. remove this line when you finish implementation.
         
         TTTboard.setMove(2, TTTboard.getComputerMove());
      } while ((currentState == ITicTacToe.PLAYING) && (!userInput.equals("q"))); // repeat if not game-over
   }
 
     
}