
public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ------ i ---------
		System.out.println("Task i");
		
		for (int i = 0; i < 4; i++) {          // loop controlling column size
			for (int j = 0; j < 10; j++) {     // inner loop controlling rows & prints 10 rows of '*'
				System.out.print("*");		   
				}
			System.out.println();			   
		}
		
		// ------ ii ---------
		System.out.println("Task ii");
		
		for (int i = 0; i <= 5; i++) {			// loop controlling column size
			for (int j = 0; j < i; j++) {		// inner loop prints * while j is less than i
				System.out.print("*");	
			}
		System.out.println();
		}	
		
		// ------ iii ---------
		System.out.println("Task iii");
		
		for (int i = 0; i <= 5; i++) {			// loop controlling column size
			for (int j = i; j < 5; j++) {		// inner loop prints first white space triangle
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {		// second inner loop prints actual triangle (*)
				System.out.print("*");	
			}
		System.out.println();
		}
		
		// ------ iv ---------
		System.out.println("Task iv");
		
		for (int i = 0; i <= 5; i++) {			// loop controlling column size
			for (int j = i; j < 5; j++) {		// inner loop prints first white space triangle
				System.out.print(" ");
					}
			for (int k = 0; k < i ; k++) {		// second inner loop prints left side triangle (*)
				System.out.print("*");	
			}
			for (int l = 1; l < i + 2; l++) {	// third inner loop prints right side triangle (*)
				System.out.print("*");
			}
		System.out.println();
		}
		
		// ------ v ---------
		System.out.println("Task v");
		
		for (int i = 1; i <= 5;  i++) {			// loop controlling column size
			for(int j = i; j < 5; j++) {		// inner loop prints first white space triangle
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {		// second inner loop prints left side triangle (i)
				System.out.print(i);
			}
			for (int l = 1; l < i ; l++) {		// second inner loop prints right side triangle (i)
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
	
}
