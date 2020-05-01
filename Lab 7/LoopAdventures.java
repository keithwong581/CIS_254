/************************************************************
* Keith Wong
* CIS 254
*
* Create a while loop that returns the product and factorial
* of numbers 1 to 20
*************************************************************/ 

public class LoopAdventures {
	
	public static void main(String[] args) {
		
		int N = Integer.parseInt(args[0]);
		int max = 20;
		int product = 1;
		int factorial = 1;
		
		if (N > 0 && N <= 20) {
			
		System.out.printf("\n\t N \t\t      2^N \t\t\t   N! \n");
		System.out.printf("\t---\t\t      ----\t\t\t------\n");
			
			while (max >= N) {
				
				product = 2 * product;
				factorial = factorial * N;
				
				System.out.printf("\t%2d \t\t %8d \t %20d \n", N, product, factorial);

				N++;
				
			}
			
		} else {
			
			System.out.println("Your number is out of bounds.");
			
		}
		
		System.out.println("\n2) The max variable is used to contain the while loop within a certain parameter. The while loop loops until ");
		System.out.println("   the N reaches 20, and then stops. Each time the code loops, it solves for the new product and factorial");
		System.out.println("   using N and prints it out. After each print, N increases by 1. However, there is a problem in the final product");
		System.out.println("   becuase from N! 13 and on, the solutions are incorrect.");
		System.out.println("\n3) The problem can be fixed by changing the N and factorial to long so that it can hold more bits, therefore");
		System.out.println("   avoiding the overflow problem that is occuring.");
	}
	
}
