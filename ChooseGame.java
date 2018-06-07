import java.util.Scanner;
import java.util.Random;

public class ChooseGame {
	public static void main( String[] args ) {
	int WantPlay;
	System.out.println( "Do you want to play Rock, Paper Scissors? Enter Y or N only.");
	Scanner keyboard = new Scanner(System.in);
	WantPlay = keyboard.nextInt();
	if ( WantPlay == 'Y' ) {
		System.out.println("Okay lets play");
		RockPaperScissors.RockPaperScissors ();
		}
	else if ( WantPlay == 'N') {
		System.out.println("Okay thats fine, goodbye.");
		}
	else {
		System.out.println("You can only enter Y or N. Try again");
		
		}
	}	
}