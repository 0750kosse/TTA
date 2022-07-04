import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialise  max, min & userGuess variables 
		int max = 5;
		int min = 0;
		int userGuess = 0;
		
		// Generating a random number between min and max
		// Method 1
		// Random randomNumber= new Random();
		// int int_random = randomNumber.nextInt(max);
		// System.out.println(int_random);
				
		// Method 2
		int int_random = (int)Math.floor(Math.random()*(max - min + 1)+ min);
		
		
		// Method 3
		// int int_random = ThreadLocalRandom.current().nextInt();
		// System.out.println(int_random);
		
		
		try (// Asks user for a guess
		Scanner userValue = new Scanner(System.in)) {
		System.out.println("Guess the number : "); 
			
			// loops while userGuess is not equal to randomNumber
			while (userGuess != int_random) {
			// Reads user value
				userGuess = userValue.nextInt();
				System.out.println("number choosen is "+ userGuess);
				
				if(userGuess < int_random) {
					System.out.println( "Try again, the number you chose is too low");
					
				} else if (userGuess > int_random){
					System.out.println("the number you chose is too high");
					
				} else if (userGuess == int_random) {
					System.out.println("Congrats");
					break;
				}
			}
		}
		userGuess++;
	}
}


