import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private ResultSetMetaData rsmd;

	private String driver;
	private String database;
	private String username;
	private String password;
	private String query;

	public Database(String driver, String database, String username, String password, String query) throws SQLException {
		// TODO Auto-generated constructor stub

		this.driver = driver;
		this.database = database;
		this.username = username;
		this.password = password;
		this.query = query;
		
		try {
			Class.forName(driver);
			this.conn = DriverManager.getConnection(database, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.stmt = this.conn.createStatement();
		this.rs = stmt.executeQuery(query);
		this.rsmd = this.rs.getMetaData();

	}
	
	public void printResults() throws SQLException {
		
		int totalFields = this.rsmd.getColumnCount();
		
		while(rs.next()) {
			
			for (int i = 1; i <= totalFields; i++) {
				
				if(i > 1) System.out.println(", ");
				String fieldValue = rs.getString(i);
				System.out.print(fieldValue);
				}
			System.out.println();
			System.out.println(" ");
		}
	}

	
}









