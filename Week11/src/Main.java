import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		System.out.println("-------------------Library Application-------------------"); 
		System.out.println("Select from the following options:"); 
		System.out.println(" 1: Show all users"); 
		System.out.println(" 2: Show all books"); 
		System.out.println(" 3: Show all users that have books loaned"); 
		System.out.println(" 4: Show all books that are loaned by users"); 
		System.out.println(" 5: Show all loaned books and the users who loaned them"); 
		System.out.println(" 6: Show all overdue books"); 
		System.out.println(" 7: Custom query"); 
		System.out.println(" 8: Exit this program"); 
		System.out.print(">> ");
		
		Scanner input = new Scanner(System.in);
		String optionInput = input.next();
		String query="";
		
			
			switch (optionInput) {
			case "1":
				System.out.println("ALL USERS:");
				query = "SELECT * FROM users";
				
			break;
			
			case "2":
				System.out.println("ALL BOOK CATALOG:");
				query = "SELECT * FROM books";
			break;
			
			case "3":
				System.out.println("ALL USERS THAT HAVE BOOKS LOANED:");
				query = "SELECT u_id, u.first_name, u.last_name FROM loaned l "
						+ "JOIN users u ON u.user_id = l.u_id;";
			break;
			
			case "4":
				System.out.println("ALL BOOKS THAT ARE LOANED BY USERS:");
				query = "SELECT b_isbn, b.title, b.author FROM loaned l\n"
						+ "JOIN books b ON b.isbn = l.b_isbn;";
			break;
			
			case "5":
				System.out.println("ALL LOANED BOOKS AN THE USERS WHO LOANED THEM");
				query = "SELECT  u_id, b_isbn, b.title, u.first_name, u.last_name FROM loaned l\n"
						+ "JOIN books b ON b.isbn = l.b_isbn\n"
						+ "JOIN users u ON u.user_id = l.u_id;";
			break;
			
			case "6":
				System.out.println("ALL OVERDUE BOOKS:");
				query = "SELECT due_date, due_date < CURDATE(),u_id, b_isbn, u.first_name, u.last_name, b.title, b.author  FROM loaned l\n"
						+ "JOIN books b ON b.isbn = l.b_isbn\n"
						+ "JOIN users u ON u.user_id = l.u_id\n"
						+ "WHERE due_date < CURDATE()\n"
						+ "ORDER BY due_date < CURDATE();";
			break;
			
			case "7":
				System.out.println("BOOKS WITH STOCK > 250:");
				query = "SELECT b.title, b.author, b.stock FROM loaned l\n"
						+ "JOIN books b ON b.isbn = l.b_isbn\n"
						+ "WHERE b.stock > 250;";
			break;
			
			case "8":
				System.out.println("you succesfuly exited this excellent program ");
				return;
			}
			
			
			Database db = new Database("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost:3306/library", "root" , "******", query);
			db.printResults();
		}

}
