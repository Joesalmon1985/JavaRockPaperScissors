import java.util.Scanner;
import java.util.Random;


public class RockyPaperScissors {
	public static void main( String[] args ) {
		int pc, cc,rnd;

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "Choose rock paper scissors\n 1= Rock,\n 2= Paper \n 3= Scissors");
		pc = keyboard.nextInt();
		cc = (int )(Math.random() * 2);
		if ( pc == 1 ) {
			System.out.println ( "You chose Rock" );
		}
		else if ( pc == 2 ) {
			System.out.println ( "You chose Paper" );
		}
		else if ( pc == 3 ) {
			System.out.println ( "You chose Scissors" );
		}else {
			System.out.print("you have not made a valid selection. The game won't work");
   	
}
		System.out.print("random number is" + cc);
	}
}
