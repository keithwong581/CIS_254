
/*******************************************************
* Keith Wong
* CIS 254
*
* Lab 9: Triangles.java
* Program prints four triangles, one below the other
*******************************************************/

public class Triangles {
	
	public static void main( String args[] ) {
		
		int row; // the row position
		int column; // the column position
		int space; // number of spaces to print
		int numLines = 10; // the number of lines per triangle
	
		//Draws First Triangle
		for (row = 1; row <= numLines; row++) {

			for ( column = 1; column <= row; column++ )
				System.out.print( "*" );
				System.out.println( );
		}
		
		System.out.println("");
		
		//Draws Second Triangle
		for (row = numLines; row <= numLines && row >= 0; row--) {

			for ( column = 1; column <= row; column++ )
				System.out.print( "*" );
				System.out.println( );
		}		
		
		System.out.println("");

		//Draws Third Triangle
		for (row = numLines; row >= 1; row--) {

			for (space = numLines; space > row; space-- )
				
				System.out.print( " " );
				
				for ( column = 1; column <= row; column++ )

					System.out.print( "*" );
					System.out.println( );
		}
		
		System.out.println("");

		//Draws Fourth Triangle
		for (row = 1; row >= 1 && row <= numLines; row++) {

			for (space = numLines; space > row; space-- )
				
				System.out.print( " " );
				
				for ( column = 1; column <= row; column++ )

					System.out.print( "*" );
					System.out.println( );
		}
		
	}
	
}