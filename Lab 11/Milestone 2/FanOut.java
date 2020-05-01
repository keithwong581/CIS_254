
/******************************************************
 * Keith Wong
 * CIS 254
 * FanOut.java
 ******************************************************/

import java.awt.Graphics;
import javax.swing.JPanel;

public class FanOut extends JPanel // allows class FanOut to use the capabilities of J.Panel
{
   public int N; // declares N to integer and public
   public int NUM_STEPS; // declares NUM_STEPS to integer and public
   public FanOut(int N) // constructor
   {
      // sets number of lines
      NUM_STEPS = N;
   }
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        int width = getWidth(); // gets the width of the panel
        int height = getHeight(); // gets the height of the panel

        for (int i = 0; i <= NUM_STEPS; i++) {
        	
            int endX = i * width/NUM_STEPS; // given by professor
            int endY = height - i * height/NUM_STEPS; // given by professor
            
            g.drawLine ( 0, 0, endX, endY ); // given by professor
            g.drawLine ( endX, endY, width, height ); // given by professor
            
            int endXX = i * width/NUM_STEPS;
            int endYY = i * height/NUM_STEPS;
            
            g.drawLine ( width, 0, endXX, endYY ); // lines from top right corner to middle 
            g.drawLine ( endXX, endYY, 0, height ); // lines from bottom left corner to middle 
        	}

    }

}