/*************************************************
* Keith Wong
* CIS 254
*
* Runs 1,000,000 games of craps
**************************************************/

import java.util.Random;

public class GameOfCraps {
   private Random randomNumbers=new Random();
   private enum Status{Continue, Won, Lost};
   int[] GamesWon;
   int[] GamesLost;
   int winTotal;
   int loseTotal;
  
   public void play(){
       int totalOfDice=0;
       int myPoints=0;
       Status gameStatus;
       int roll;
       GamesWon=new int[22];
       GamesLost=new int[22];
       for(int x=1; x<=1000000; x++){
           totalOfDice=rollDice();
           roll=1;
           switch(totalOfDice){
           case 7:
           case 11:
               gameStatus=Status.Won;
               break;
           case 2:
           case 3:
           case 12:
               gameStatus=Status.Lost;
               break;
           default:
               gameStatus=Status.Continue;
               myPoints=totalOfDice;
               break;
           }
       while(gameStatus==Status.Continue){
           totalOfDice=rollDice();
           roll++;
           if(totalOfDice==myPoints)
               gameStatus=Status.Won;
           else if(totalOfDice==7)
               gameStatus=Status.Lost;
       }
       if(roll>21)
           roll=21;
       if(gameStatus==Status.Won){
           GamesWon[roll]++;
           winTotal++;
       }
       else{
           GamesLost[roll]++;
           loseTotal++;
       }
       }
   printStats();  
   }
   public void printStats(){
       int totalGames=winTotal+loseTotal;
       int length=0;
       int RollsToWin;
       int RollsToLose;
      
       for(int x=1; x<=21; x++){
           if(x==21)
               System.out.printf("\n%d games won and %d games lost on rolls after the 20th roll", GamesWon[21],GamesLost[21] );
           else
               if(x<=21)
                   System.out.printf("\n%d games won and %d games lost on roll %d", GamesWon[x], GamesLost[x], x);
          
           RollsToWin=(1*GamesWon[1])+(2*GamesWon[2])+(3*GamesWon[3])+
           (4*GamesWon[4])+(5*GamesWon[5])+(6*GamesWon[6])+(7*GamesWon[7])+
           (8*GamesWon[8])+(9*GamesWon[9])+(10*GamesWon[10])+(11*GamesWon[11])+
           (12*GamesWon[12])+(13*GamesWon[13])+(14*GamesWon[14])+(15*GamesWon[15])+
           (16*GamesWon[16])+(17*GamesWon[17])+(18*GamesWon[18])+(19*GamesWon[19])+
           (20*GamesWon[20])+(21*GamesWon[21]);
          
           RollsToLose=(1*GamesLost[1])+(2*GamesLost[2])+(3*GamesLost[3])+
           (4*GamesLost[4])+(5*GamesLost[5])+(6*GamesLost[6])+(7*GamesLost[7])+
           (8*GamesLost[8])+(9*GamesLost[9])+(10*GamesLost[10])+(11*GamesLost[11])+
           (12*GamesLost[12])+(13*GamesLost[13])+(14*GamesLost[14])+(15*GamesLost[15])+
           (16*GamesLost[16])+(17*GamesLost[17])+(18*GamesLost[18])+(19*GamesLost[19])+
           (20*GamesLost[20])+(21*GamesLost[21]);
          
           length=(RollsToLose+loseTotal)+(RollsToWin+winTotal);
          
           }
       if((GamesWon[1]/GamesWon[1]+GamesLost[1])>(GamesWon[3]/GamesWon[3]+GamesLost[3])&&(GamesWon[3]/GamesWon[3]+GamesLost[3])>(GamesWon[5]/GamesWon[5]+GamesLost[5]))
           System.out.printf("\nChances of winning decrease as rolls increase");
       else              
           System.out.printf("\nChances of winning increase as rolls increase");
      
   System.out.printf("\n%s %d / %d = %.2f%%\n", "The chances of winning are", winTotal, totalGames, (100.0*winTotal/totalGames));
   System.out.printf("The average game length is %.2f rolls.\n", ((double)length/totalGames));
   }
  
   public int rollDice(){
       int die1=1+randomNumbers.nextInt(6);
       int die2=1+randomNumbers.nextInt(6);
       int sum=die1+die2;
       return sum;
   }
   public static void main(String args[]){
       GameOfCraps game=new GameOfCraps();
       game.play();
      
   }
  
}