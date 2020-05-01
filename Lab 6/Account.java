/*******************************************************************************
* Keith Wong
* CIS 254
*
* Account.java
* Account class with a constructor to validate and
* initialize instance variable balance of type double.
********************************************************************************/
public class Account {
   //instance variables that stores the checkings balance and savings balance
   private double checkingsBalance, savingsBalance;
   double checkings, savings;

   //contructor
   public Account( double checkingsBalance, double savingsBalance )
   {
      if ( checkingsBalance > 0.0 )
         checkings = checkingsBalance;

      if ( savingsBalance > 0.0 )
         savings = savingsBalance;
   }

   //credit an amount to the account
   public void creditCheckings( double amount ) 
   {
      checkingsBalance = checkingsBalance + amount;
   }

   //credit an amout to the account
   public void creditSavings( double amount )
   {
      savingsBalance = savingsBalance + amount;
   }

   //debit an amount to the account
   public void debitCheckings( double amount )
   {
      if (checkingsBalance >= amount)
      {
      checkingsBalance = checkingsBalance - amount;
      }

      if (checkingsBalance < amount)
      {
         System.out.println( "Transaction amount exceeded checkings balance");
      }
   }

   //debit an amount to the account
   public void debitSavings( double amount )
   {
      if (savingsBalance >= amount)
      {
         savingsBalance = savingsBalance - amount;
      }

      if (savingsBalance < amount)
      {
         System.out.println( "Transaction amount exceeded savings balance");
      }
   }

   //transfer an amount from checkings to savings
   public void moveFromCheckingsToSavings( double amount )
   {
      if (checkingsBalance >= amount)
      {
         debitCheckings( amount );
         creditSavings( amount );
      }

      if (checkingsBalance < amount)
      {
          System.out.println( "Transaction amount exceeded checking balance" );
      }
   }

   //transfer an amount from savings to checkings
   public void moveFromSavingsToCheckings( double amount )
   {
      if (savingsBalance >= amount)
      {
         debitSavings( amount );
         creditCheckings( amount );
      }

      if (savingsBalance < amount)
      {
         System.out.println( "Transaction amount exceeded savings balance");
      }
   }

   //return the account balance
   public double getCheckingsBalance()
   { 
      return checkingsBalance;
   }

   public double getSavingsBalance()
   {
      return savingsBalance;
   }
}