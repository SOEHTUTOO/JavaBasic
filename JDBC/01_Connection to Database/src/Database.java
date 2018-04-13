import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	private Connection conn;

	public void connect() throws SQLException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver found.");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found.");
			e.printStackTrace();
		}

		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");

	}

	public void disconnect() throws SQLException {
		if (conn != null) {
			conn.close();
		}
	}
}
