import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 
 * Prepared Statement with wild card for unknown input.
 * 
 */

public class Database {

	private Connection conn;
	private User user;

	public void connect() throws SQLException {

		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");

	}

	public void checkInfo() {
		
		String cmdSql = "select count(*) as userexit from members where email=? and password=?";

		PreparedStatement stmt;

		try {
			stmt = conn.prepareStatement(cmdSql);
			stmt.setString(1, user.getEmail());
			stmt.setString(2, user.getPassword());
			ResultSet results = stmt.executeQuery();

			System.out.println(user.getEmail()+user.getPassword()+results.getInt("userexit"));
			
			
			while (results.next()) {
				
				user.setCheckNo(results.getInt("userexit"));
				

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
