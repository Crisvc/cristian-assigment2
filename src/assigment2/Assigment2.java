package assigment2;

import java.util.Random;
import java.util.Scanner;

public class Assigment2 {
	
	public static void main(String [] args) {

	// variables 
		
		int guess = -1;
		int tries = 0;
		boolean correct = false;
		
		// input
		
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int secretNum = rand.nextInt(100) + 1;
		
		System.out.println("Guess a number between 0 and 100:");
		System.out.println(secretNum);
		
		
		while (!correct) {
			
			guess = keyboard.nextInt();
			tries++;
			
			
			if (tries > 6 - 2) {
				System.out.println("You Lose! Please Try Again");
			}
			else if (guess < secretNum) {
				System.out.println("Please pick a Higher Number:");
			}
			else if (guess > secretNum) {
				System.out.println("Please pick a Lower Number:");
				
			}
			
			if (guess == secretNum) {
				System.out.println("You WIN!");
			
			}
		
			
			
	
	 
		}
	
	  }
	}


	
