import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Database {

	private Scanner input;

	private Connection conn;

	public void connect() throws SQLException {

		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");

	}

	public void checkInfo() {

		input = new Scanner(System.in);
		String name = null;
		String password = null;

		System.out.println("To check your name/nPlease enter your name and password to continue  ");
		System.out.print("Type Your Name Here >> ");
		name = input.nextLine();
		System.out.println("Type Your Password Here >> ");
		password = input.nextLine();

		String cmdSql = "select count(*) as password from members where name='" + name + "' and password='" + password
				+ "';";

		Statement stmt;

		try {
			stmt = conn.createStatement();
			ResultSet results = stmt.executeQuery(cmdSql);

			while (results.next()) {
				int check = results.getInt("password");

				if (check != 0) {
					System.out.println("You are Exist");
				} else {
					System.out.println("Your are Not Exist");
				}

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void disconnect() throws SQLException {
		if (conn != null) {
			conn.close();
		}

	}

}
