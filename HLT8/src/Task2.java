public class Task2 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "The quick brown fox jumps over the lazy ";
		boolean[] myBoolean  = new boolean[26];
		boolean pangram = true;
		int index = 0;
		
		for (int i = 0; i < sentence.length(); i ++) {
			char chracter = sentence.toLowerCase().charAt(i);
			
			
			 if(chracter >= 'a' && chracter <= 'z') {
				index = chracter - 'a';
				//System.out.println(index);
				}
			
			myBoolean[index] = true;
			
		}
			
		for(int i = 0; i < myBoolean.length; i++) {
			if(myBoolean[i] == false) {
				System.out.println(myBoolean);
				pangram = false;
				}
		}
		
			
		if (pangram) {
			System.out.println("yayyy" + pangram);
			} else {
			System.out.println("osrry...." + pangram);
			}
	}
		
}

