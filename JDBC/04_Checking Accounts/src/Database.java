import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


/*
 * 
 * Prepared Statement with wild card for unknown input.
 * 
 */


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

		String cmdSql = "select count(*) as password from members where name=? and password=?";

		PreparedStatement stmt;

		try {
			stmt = conn.prepareStatement(cmdSql);
			stmt.setString(1, name);
			stmt.setString(2, password);
			ResultSet results = stmt.executeQuery();

			while (results.next()) {
				int check = results.getInt("password");

				if (check != 0) {
					System.out.println("You are Exist");
				} else {
					System.out.println("Your are Not Exist");
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void disconnect() throws SQLException {
		if (conn != null) {
			conn.close();
		}

	}

}
