// This is a simple program to play rock paper scissors between a player and the pc. It's clumbsy and needs a ton of work. Any hints welcome.

import java.util.Scanner;
import java.util.Random;


public class rps {
	public static void main( String[] args ) {
		int pc, cc,rnd;

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "Choose rock paper scissors\n 1= Rock,\n 2= Paper \n 3= Scissors");

// This sets the 'pc' player choice to either 1,2 or 3 to represent the appropriate selection.
		pc = keyboard.nextInt();

// This chooses a random number to determine the player choice. Because I can't code it is done in such a way that the computer mainly chooses rock.
		cc = (int )((Math.random() * 2)+1);

// These lines confirm the players choice to them.
		if ( pc == 1 ) {
			System.out.println ( "You chose Rock" );
		}
		else if ( pc == 2 ) {
			System.out.println ( "You chose Paper" );
		}
		else if ( pc == 3 ) {
			System.out.println ( "You chose Scissors" );

// This line tells the user they have chosen the wrong selection, ideally it would loop back a couple of times maybe.
		}else {
			System.out.print("you have not made a valid selection. The game won't work");
   	
}

// At the moment this tells the player the random number that was chosen, mainly so I know what is going on.
		System.out.print("random number is" + cc);

// This is the way the game plays out if the player choice is rock
		if ( pc == 1 ) {
			if ( cc == 1 ) { 
				System.out.println ( "You both chose Rock, a draw." );
			}
			else if ( cc == 2 ) {
				System.out.println ( "You chose Rock, but the computer chose paper, you loose.");
			}else{
				System.out.print( "You chose Rock, and the computer chose Scissors, you win!"); 
		}

// This is the way the game plays out if the player choice is paper.
		if ( pc == 2 ) {
			System.out.println ( "You chose Paper" );
			if ( cc == 1 ) { 
				System.out.println ( "You chose Paper, computer chose rock, you win." );
			}
			else if ( cc == 2 ) {
				System.out.println ( "You both chose paper, a draw.");
			}else{
				System.out.print( "You chose Paper and the computer chose Scissors, you loose!"); 
		}

// This is the way the game plays out if the player choice is scissors.
		if ( pc == 3 ) {
			System.out.println ( "You chose Scissors" );
	}
			if ( cc == 1 ) { 
				System.out.println ( "You chose Scissors, computer chose rock, you loose." );
			}
			else if ( cc == 2 ) {
				System.out.println ( "You chose scissors and the computer chose paper, you win.");
			}else{
				System.out.print( "You chose scissors and the computer chose Scissors, a draw!"); 
		}

	}}}}
