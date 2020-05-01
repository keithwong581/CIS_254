
/****************************************************************
* Keith Wong
* CIS 254
*
* Craps.java
* Craps class simulates the dice game craps.
*****************************************************************/
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Craps {
	
	// create random number generator for use in method rollDice 
	private static final Random randomNumbers = new Random();
	
	// enumeration with constants that represent the game status
	private enum Status { CONTINUE, WON, LOST };
	
	// constants that represent common rolls of the dice
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11; 
	private static final int BOX_CARS = 12;
	
	// plays one game of craps
	public static void main( String[] args ) throws Exception { 

		int bankBalance = 1000;
		int myPoint = 0; // point if no win or loss on first roll
		Status gameStatus; // can contain CONTINUE, WON or LOST
		int wager;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sumOfDice = rollDice(); // first roll of the dice
	
		while(true)
	      {
	         System.out.println("Enter your wager");
	         wager = Integer.parseInt(br.readLine());
	         if (wager<= bankBalance)
	            break;
	         else
	            System.out.println("You don't have enough money.");
	       }
		
		// determine game status and point based on first roll
		switch ( sumOfDice ) {
	
			case SEVEN: // win with 7 on first roll
			case YO_LEVEN: // win with 11 on first roll
				gameStatus = Status.WON;
				break;
			case SNAKE_EYES: // lose with 2 on first roll
			case TREY: // lose with 3 on first roll
			case BOX_CARS: // lose with 12 on first roll
				gameStatus = Status.LOST;
				break;
			default: // did not win or lose, so remember point
				gameStatus = Status.CONTINUE; // game is not over
				myPoint = sumOfDice; // remember the point
				System.out.printf( "Point is %d\n", myPoint );
				break; // optional at end of switch 
		} // end switch
				
				// while game is not complete 		
			while( gameStatus == Status.CONTINUE ) { // not WON or LOST	
				 sumOfDice = rollDice(); // roll dice again
				 
				 // determine game status
				 if ( sumOfDice == myPoint ) // win by making point
					 gameStatus = Status.WON;
				 else if ( sumOfDice == SEVEN ) // lose by rolling 7 before point
					 gameStatus = Status.LOST;
			} // end while
			
		// display won or lost message
		if( gameStatus == Status.WON ) {
			System.out.println( "Player wins" );
			bankBalance = bankBalance + wager;
			System.out.printf("Your new bank balance is %d\n", bankBalance);
		} else {
			System.out.println( "Player loses");
			bankBalance = bankBalance - wager;
			System.out.printf("Your new bank balance is %d\n", bankBalance);
			if(bankBalance == 0)
				System.out.println("Sorry. You busted!");
		}
		
	} // end main
	
	// roll dice, calculate sum and display results
	public static int rollDice() {
		
		// pick random die values
		int die1 = 1 + randomNumbers.nextInt( 6 ); // first die roll
		int die2 = 1 + randomNumbers.nextInt( 6 ); // second die roll
		
		int sum = die1 + die2; // sum of die values
	
		// display results of this roll
		System.out.printf( "Player rolled %d + %d = %d\n",
			 die1, die2, sum );
		return sum; // return sum of dice 
	} // end method rollDice

	public static void chatter(Status gameStatus) {
		 
		int random = randomNumbers.nextInt(4);
		if(gameStatus == Status.WON) { // chatter text when winning
			switch(random) {
				case 1:
					System.out.println("Woo! Congrats!");
					break;
				case 2:
					System.out.println("You did it!! Nice!");
					break;
				case 3:
					System.out.println("Oh yea, you won!");
					break;
				case 4:
					System.out.println("oh yea you deserved it!");
					break;
			}
			
		}

		else if(gameStatus == Status.LOST) { // chatter text when losing
			switch(random) {
		         case 1:
		            System.out.println("Don't worry, you got it next time!");
		            break;
		         case 2:
		            System.out.println("Gah! Better luck next time!");
		            break;
		         case 3:
		            System.out.println("Maybe you'll win next time...");
		            break;
		         case 4:
		            System.out.println("Hopefully next time you got it!");
		            break;
			}
			
		}
		
		else {
			switch(random) { // text when the game has not finished
		         case 1:
		            System.out.println("Oh, you're going for broke huh?");
		            break;
		         case 2:
		            System.out.println("Aw, c'mon take a change!");
		            break;
		         case 3:
		            System.out.println("You're up big. Now's the time to cash in your chips!");
		            break;
		         case 4:
		            System.out.println("Go for it! Go further beyond!");
		            break;
			}
		
		}
	
	}
	
}


