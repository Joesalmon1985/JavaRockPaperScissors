import java.util.Scanner;
import java.util.Random;

public class ChooseGame {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);	
	String WantPlay;
	boolean WantYes, WantNo;
	System.out.println( "Do you want to play Rock, Paper Scissors? Enter Y or N only.");
	WantPlay = keyboard.next();
	WantYes = WantPlay.equals("Y");
	WantNo = WantPlay.equals("N");
	if ( WantYes == true ) {
		System.out.println("Okay lets play");
		// This bit never seems to work no matter how I format it, how can I get this below line to run the other class?
		// RockPaperScissors().RockPaperScissors ();
		// RockPaperScissors = RockpaperScissors ();
		RockPaperScissors.main(null);
		}
	else if ( WantNo == true) {
		System.out.println("Okay thats fine, goodbye.");
		}
	else {
		System.out.println("You can only enter Y or N. Try again");
		
		}
	}	
}
