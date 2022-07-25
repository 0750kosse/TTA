package week10;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Welcome to the game");
		String userDirection;
		
		//Random starting position
		int startX = (int) (Math.random() * 10);
		int startY = (int) (Math.random() * 10);
		
		// Creates new character
		Character goku = new Character("Goku",100, 50, 5, startX,startY);
		
		// Creates new map
		Map gokuMap = new Map(10,10);
		// assigns random starting position to player
		
		goku.setStartX(startX);
		goku.setStartY(startY);
		System.out.println("Your starting position is: \n" +  "X:" + goku.setStartX(startX) + "-Y:" + goku.setStartY(startY));
		System.out.println("----------------------------------");
		System.out.println();
		
		// End game
		boolean endGame =( gokuMap.getX() == 5 ) && (gokuMap.getY() == 5);
		
		gokuMap.setCurrentX(startX);
		gokuMap.setCurrentY(startY);
		

		try (Scanner userInput = new Scanner(System.in)) {

			
			while(!endGame) {
				
				System.out.println("Enter the player direction (N, S, W, E)");
				userDirection = userInput.nextLine();
				System.out.println("you chose to move " + userDirection);
				System.out.println("----------------------------------");
				
				gokuMap.move(userDirection);
				
				if(gokuMap.getCurrentY() == 3 && gokuMap.getCurrentX() == 5) {
					
					Character baddie = new Character("The Baddie ",100, 50, 5, gokuMap.getCurrentY(),gokuMap.getCurrentX());
					int damageCaused = goku.setMaxDamage((int) (Math.random() * 100));
					int damageReceived = goku.getMaxDamage((int) (Math.random() * 100));
					baddie.printDetails();
					
					Scanner playerOptions = new Scanner(System.in);
					System.out.println("What you want to do, options are : 1. Fight, 2. Run like a coward, 3. Negotiate");
					System.out.println("-------------------------------");
					String playerChoice = playerOptions.nextLine();
					
					switch(playerChoice) {
					case "1":
						if(damageReceived > damageCaused) goku.setMaxHealth(50);
						System.out.println("damage caused is :" + damageCaused + ", damage received is: " + damageReceived + " .Your health is now " + goku.setMaxHealth(50) );
						
						
					}
				}
				
			}
		}
	}
}
