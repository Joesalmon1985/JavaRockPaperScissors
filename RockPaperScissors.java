import java.util.Scanner;
import java.util.Random;


public class RockPaperScissors {
	public static void main( String[] args ) {
		// The choice of the player as 1,2 or 3 for rock, paper or scissors.
		int PlayerChoice;
		// The choice of the computer as 1,2 or 3 for rock, paper or scissors.
		int ComputerChoice;
		// The random number used to select the computer choice
		int ComputerChoiceRnd;

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "Choose rock paper scissors\n 1= Rock,\n 2= Paper \n 3= Scissors");
		PlayerChoice = keyboard.nextInt();
		ComputerChoice = (int )(Math.random() * 2);
		if ( PlayerChoice == 1 ) {
			System.out.println ( "You chose Rock" );
		}
		else if ( PlayerChoice == 2 ) {
			System.out.println ( "You chose Paper" );
		}
		else if ( PlayerChoice == 3 ) {
			System.out.println ( "You chose Scissors" );
		}else {
			System.out.print("you have not made a valid selection. The game won't work");
   	
}
		System.out.print("random number is" + ComputerChoice);
	}
}
