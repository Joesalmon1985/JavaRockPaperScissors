import java.util.Scanner;
import java.util.Random;

public class ChooseGame {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);	
	String wantPlay;
	boolean wantYes, wantNo;
	System.out.println( "Do you want to play Rock, Paper Scissors? Enter Y or N only.");
	wantPlay = keyboard.next();
	wantYes = wantPlay.equals("Y");
	wantNo = wantPlay.equals("N");
	if ( wantYes == true ) {
		System.out.println("Okay lets play");
		RockPaperScissors.main(null);
		}
	else if ( wantNo == true) {
		System.out.println("Okay thats fine, goodbye.");
		}
	else {
		System.out.println("You can only enter Y or N. Try again");
		
		}
	}	
}
