package week10;

import java.util.HashMap;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> bestPlayers = new HashMap<String, String>();
		bestPlayers.put("Football", "Messi");
		bestPlayers.put("MotoGP", "Marquez");
		System.out.println(bestPlayers);
		System.out.println(bestPlayers.get("Football"));
		
		for (String i: bestPlayers.values()) {
			System.out.println(i);
		}
		
		HashMap<String, Integer> petrolPrices = new HashMap<String, Integer>();
		petrolPrices.put("Monday", 1);
		petrolPrices.put("Wed", 2);
		petrolPrices.put("Fri", 3);
		
		System.out.println(petrolPrices.keySet());
		System.out.println(petrolPrices.values());
		
		for (String i: petrolPrices.keySet()) {
			System.out.println(i);
		}
		
		for (Integer i: petrolPrices.values()) {
			System.out.println(i);
		}
	}

}

