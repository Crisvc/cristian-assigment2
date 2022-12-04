package assigment2;

import java.util.Random;
import java.util.Scanner;

public class Assigment2 {
	
	public static void main(String [] args) {
	
 Scanner scanner = new Scanner(System.in);		
 Random random = new Random();
 int randomNumber = random.nextInt(100) + 1;
 System.out.println("Please choose a number between 1 and 100.");
 int playerGuess = scanner.nextInt();
 
while (true) {
if (playerGuess == randomNumber) {
	System.out.println("YOU WIN!");
} else if (playerGuess > randomNumber) {
	System.out.println("Please choose a lower number:");
} else {
	System.out.println("Please choose a higher number:");
}
	 
 }
	
	
	
}
}

	
