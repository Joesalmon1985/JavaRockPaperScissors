import java.util.Scanner;
import java.util.Random;


public class RockPaperScissors {
	public static void main( String[] args ) {
		// The choice of the player as 1,2 or 3 for rock, paper or scissors.
		int PlayerChoice;
		// The choice of the computer as 1,2 or 3 for rock, paper or scissors.
		int ComputerChoice;
		
		// This generates the random number used for the computer choice
		Random rnd = new Random();  // Hey, I did use rnd... but its not an int.
		ComputerChoice = rnd.nextInt(3) + 1;  // returns int in the range [0, 3)
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "Choose rock paper scissors\n 1= Rock,\n 2= Paper \n 3= Scissors");
		PlayerChoice = keyboard.nextInt();
		if ( PlayerChoice == 1 ) {
			System.out.println ( "You chose Rock" );
			if (ComputerChoice == 1 ) {
				System.out.println ( "The computer chose Rock, the game is a draw");
			}
			else if (ComputerChoice == 2) {
				System.out.println ( "The computer chose Paper, you loose!");
			}
			else {
				System.out.println ("The computer chose Scissors, you win!");
			
			}
		}
		else if ( PlayerChoice == 2 ) {
			System.out.println ( "You chose Paper" );
			if (ComputerChoice == 1 ) {
				System.out.println ( "The computer chose Rock, the game is a win for you");
			}
			else if (ComputerChoice == 2) {
				System.out.println ( "The computer chose Paper, you draw with the computer.");
			}
			else {
				System.out.println ("The computer chose Scissors, you loose the game!");
			
			}
		}
		else if ( PlayerChoice == 3 ) {
			System.out.println ( "You chose Scissors" );
		}else {
			System.out.print("you have not made a valid selection. The game won't work");
   	
		}
		System.out.print("random number is " + ComputerChoice);
	}
}
