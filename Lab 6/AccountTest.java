/***************************************************************************
* Keith Wong
* CIS 254
*
* AccountTest.java
* Inputting and outputting floating-point numbers with Account objects.
***************************************************************************/
import java.util.Scanner;

public class AccountTest
{
   public static void main(String[] args)
   {
      Account account1 = new Account( 50.00, 0);
      Account account2 = new Account(0, -7.75);

      System.out.printf( "checkings balance is: $%.2f\n", account1.getCheckingsBalance() );
      System.out.printf( "savings balance is: $%.2f\n", account2.getSavingsBalance() );

      Scanner input = new Scanner( System.in );
      double depositAmount;

      System.out.println( "\nEnter deposit amount for checkings." );
      depositAmount = input.nextDouble();
      System.out.printf( "\nadding $%.2f to checkings\n", depositAmount );
      account1.creditCheckings( depositAmount );

      System.out.printf( "\ncheckings balance is $%.2f", account1.getCheckingsBalance() );
      System.out.printf( "\nsavings balance is $%.2f\n", account2.getSavingsBalance() );

      System.out.println( "\nEnter deposit amount for savings." );
      depositAmount = input.nextDouble();
      System.out.printf( "\nadding $%.2f to savings\n", depositAmount );
      account2.creditSavings( depositAmount );

      System.out.printf( "\ncheckings balance is: $%.2f", account1.getCheckingsBalance() );
      System.out.printf( "\nsavings balance is: $%.2f\n", account2.getSavingsBalance() );

      System.out.println( "\nEnter withdrawl amount from checkings." );
      depositAmount = input.nextDouble();
      System.out.printf( "\nsubtractings $%.2f from checkings.", depositAmount );
      account1.debitCheckings( depositAmount );

      System.out.printf( "\ncheckings balance is $%.2f", account1.getCheckingsBalance() );
      System.out.printf( "\nsavings balance is $%.2f", account2.getSavingsBalance() );

      System.out.println( "\nEnter withdrawl amount from savings." );
      depositAmount = input.nextDouble();
      System.out.printf( "\nsubtracting $%.2f from savings.", depositAmount );
      account2.debitSavings( depositAmount );

      System.out.printf( "\ncheckings balance is $%.2f", account1.getCheckingsBalance() );
      System.out.printf( "\nsavings balance is $%.2f", account2.getSavingsBalance() );

      System.out.println( "\nenter amount to move from checkings to savings");
      depositAmount = input.nextDouble();
      System.out.printf( "\n$%.2f moved from checkings to savings", depositAmount );
      account1.moveFromCheckingsToSavings( depositAmount );

      System.out.printf( "\ncheckings balance is $%.2f", account1.getCheckingsBalance() );
      System.out.printf( "\nsavings balance is $%.2f", account2.getSavingsBalance() );

      System.out.println( "\nenter amount to move from savings to checkings" );
      depositAmount = input.nextDouble();
      System.out.printf( "\n$%.2f moved from savings to checkings", depositAmount );
      account2.moveFromSavingsToCheckings( depositAmount );

      System.out.printf( "\ncheckings balance is: $%.2f", account1.getCheckingsBalance() );
      System.out.printf( "\nsavings balance is: $%.2f", account2.getSavingsBalance() ) ;
   }
}