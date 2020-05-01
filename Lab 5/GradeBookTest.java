/***********************************************************************************
* Keith Wong
* CIS 254
*
*
* GradeBookTest.java - Creating and manipulating a GradeBook object 
************************************************************************************/
import java.util.Scanner;

public class GradeBookTest
{
   // main method begins program execution
   public static void main( String[] args )
   {

      // create a Scanner object to obtain input from command window
      Scanner input = new Scanner( System.in );

      // create GradeBook object
      GradeBook gradeBook1 = new GradeBook( "cs101 Introduction to Java Programming", "Albert Einstein" );
      GradeBook gradeBook2 = new GradeBook( "cs102 Data Structures in Java", "Alfred Nobel" );

      gradeBook1.displayMessage();
      gradeBook2.displayMessage();
   }
}
