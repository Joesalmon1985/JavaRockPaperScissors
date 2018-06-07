import java.util.Scanner;
import java.util.Random;

public class ChooseGame {
	public static void main( String[] args ) {
	char WantPlay;
	System.out.println( "Do you want to play Rock, Paper Scissors? Enter Y or N only.");
	Scanner keyboard = new Scanner(System.in);
	WantPlay = keyboard.nextInt();
	if ( WantPlay == 'Y' ) {
		System.out.println("Okay lets play");
		// This bit never seems to work no matter how I format it, how can I get this below line to run the other class?
		RockPaperScissors().RockPaperScissors ();
		}
	else if ( WantPlay == 'N') {
		System.out.println("Okay thats fine, goodbye.");
		}
	else {
		System.out.println("You can only enter Y or N. Try again");
		
		}
	}	
}