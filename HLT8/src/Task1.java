public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Part 1
		//Creates string 'sentence'
		String sentence = "Are you as excited as I am?";
		
		//Creates string 'reverseSentence', with no value assigned
		String reverseSentence;
		
		// Splits 'sentence' strings using the space between words as splitter, then assigns to array 'array'
		String[] array = sentence.split(" ");
		
		// Initialise StringBuilder
		StringBuilder myString = new StringBuilder();
		// Loop through the 'sentence' string backwards & assign it to reverseSentence
		for (int i = array.length -1 ; i >= 0 ; i--) {
			reverseSentence = array[i];
			System.out.println("aaa : " + reverseSentence);
			// append result of loop to 'myString'
			myString.append(reverseSentence + " ");
		}
		// Capitalises first letter of the string
		String capitalise= myString.substring(0,1).toUpperCase() + myString.substring(1);
		System.out.println(capitalise);
		

// Part 2
		//Create an array of words called & assign values
		String[] wordList = {"Stressed", "Parts", "Straw", "Keep", "Wolf"};
		//Create a string 'reversedWord' with no assigned value 
		String reversedWord;
		// loops trough 'wordlList' string			
		for (int i = 0; i < wordList.length; i++) {
		reversedWord = "";
		wordList[i] = wordList[i].toLowerCase();
		System.out.println("reversedWord is : " + reversedWord);
		
		for (int j = wordList[i].length()-1; j >=0; j--) {
		reversedWord += wordList[i].charAt(j);
		
		String letter1 = reversedWord.substring(0,1).toUpperCase();
		String restOfLetters = reversedWord.substring(1,reversedWord.length());
		reversedWord = letter1 + restOfLetters;
		}
		System.out.println(reversedWord);
			
	}
  }
}