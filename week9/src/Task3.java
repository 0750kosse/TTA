
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare variables
		int number1 = 0;
		int number2 = 1;
		// nextNumber is the sum of the previous 2 numbers
		int nextNumber = number1 + number2;
		
		System.out.println(number1);
		System.out.println(number2);
		
	while (nextNumber < 100) {
			number1 = number2;
			number2 = nextNumber;
			nextNumber = number1 + number2;
		System.out.println(nextNumber);
			}
	}

}
