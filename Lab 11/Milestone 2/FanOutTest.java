
/******************************************************
 * Keith Wong
 * CIS 254
 * Tests FanOut.java
 ******************************************************/

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class FanOutTest
{
   public static void main( String[] args )
   {
   int N = 0; // set N to zero here
   boolean validity = false; // this sets variable "validity" to be false, so that code will run correctly when entering valid input
      while (validity == false)
      {
         String test = JOptionPane.showInputDialog("Enter number of lines between 2 and 50"); // prompts the user to input a number between 2 and 50
         // creates a panel for the drawing to be displayed
         N = Integer.parseInt(test);
         if (N < 2 || N > 50) 
         { 
             JOptionPane.showMessageDialog(null, "Invalid input, please try again"); // makes sure that user input is valid
         }
           else
         {  validity = true; // if this is false, then the program goes on as intended
         }
      }
      FanOut fan = new FanOut(N);
   System.out.println(N);
   // creates frame to hold panel
   JFrame application = new JFrame();
   // set the frame to exit when closed
   application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   // will prompt the user to to specify N number of lines to draw
   application.add(fan) ; // adds panel to frame
   application.setSize(250, 250); // sets size of frame
   application.setVisible( true ); // makes frame visible
   } // end main
} // end class FanOutTest