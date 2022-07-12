package week10;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Welcome to the game");
		String userDirection;
		int startX = (int) (Math.random() * 10);
		int startY = (int) (Math.random() * 10);
		//boolean running = true;
		
		// Creates new character
		Character goku = new Character("Goku",100, 50, 5, startX,startY);
		// Creates new map
		Map gokuMap = new Map(10,10);
		// assigns random starting position to player
		goku.setStartX(startX);
		goku.setStartY(startY);
		System.out.println("X:" + goku.setStartX(startX) + "-Y:" + goku.setStartY(startY));
		
		boolean endGame =( gokuMap.getX() == 5 ) && (gokuMap.getY() == 5);
		
		gokuMap.setCurrentX(startX);
		gokuMap.setCurrentY(startY);
		System.out.println("player starting position:");
		System.out.println("X:" + gokuMap.setCurrentX(startX) + "-Y:" + gokuMap.setCurrentY(startY));

		try (Scanner userInput = new Scanner(System.in)) {

			
			while(!endGame) {
				System.out.println("Enter the player direction (N, S, W, E)");
				userDirection = userInput.nextLine();
				System.out.println("you chose to move " + userDirection);
				System.out.println("----------------------------------");
				
				gokuMap.move(userDirection);
			}
		}
	}
}
