
import java.util.ArrayList;

import java.util.Random;

import java.util.Scanner;


public class BirthdayCoincedence {
	
	private static Scanner console;
	
	public static void main(String[] args) {
	
		console = new Scanner(System.in);
		
		int trials=0;
		
		System.out.print("How many times you want to perform the experiment: ");
		
		trials=console.nextInt();
		
		double matchFoundAtDate=0;
		
		Random random = new Random();
		
		int experimentCount=1;
		
		// iterates the below code for user input
		
			while(experimentCount<=trials) {
			
			ArrayList<Integer> birthDate = new ArrayList<Integer>(365);
			
				for (int date=1;date<=365;date++) {
				
				// generates a number from 1-365 (both inclusive)
				
				int randomDate = 1 + random.nextInt(365);
				
				if(birthDate.indexOf(randomDate)==-1) {
				
				birthDate.add(randomDate);
				
				}
				
					else{
					
					// you can uncomment this line
					
					System.out.println("Experiment ["+experimentCount+"]: Found Match after iteration: "+date);
					
					// we are adding the number for each experiment
					
					matchFoundAtDate+=date;
					
						for(int dy:birthDate) {
						
							System.out.print(dy+" ");
					
						}
					
					System.out.println(randomDate);
					
					break;
					
					} 
				
				}
			
			experimentCount++;
			
			}
		
		// below are we are printing the average
		
		System.out.println("Average number of people that were added for ["+trials+"] trials until a birthday match occurred: "+ String.format("%.2f",(matchFoundAtDate/trials)));
	
	}

}