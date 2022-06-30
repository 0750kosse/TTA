
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1900; i <= 2400; i++) {
			
			boolean leap = ((i% 4 == 0) || (i % 400 == 0) );
			if(i % 100 == 0) {} 
			else  if(i% 4 == 0 || i % 400 == 0 ) {
				 System.out.println( i );
			}
		}
	}
}
