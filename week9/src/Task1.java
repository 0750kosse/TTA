

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creates Scanner object
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number");
		// Reads user number/input
		int userNumber = userInput.nextInt();
		// Reads number of iterations
		System.out.println("Enter number of iterations");
		int userIterations = userInput.nextInt();
		System.out.println("The user number is " + userNumber + ", and will iterate " + userIterations + " times");
		// Loops and displays times-table for the userNumber up to the number of userIterations
		for (int i=0; i <= userIterations; i++) {
			int timesTable = userNumber * i;	
		System.out.println(userNumber + " * " + i + " = " + timesTable);
		
		}
	}
}

