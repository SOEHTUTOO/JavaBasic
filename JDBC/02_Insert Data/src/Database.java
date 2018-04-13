import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Database {
	
	private Scanner input;
	private Connection conn;

	public void connect() throws SQLException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Found.");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found.");
			e.printStackTrace();
		}
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
		
	}
	
	public void disconnect() throws SQLException {
		if(conn!=null) {
			conn.close();
		}
	}
	
	public void addMember() {
		
		input = new Scanner(System.in);
		System.out.print("Type your name >>");
		String name = input.nextLine();
		System.out.print("Type your email >>");
		String email = input.nextLine();
		System.out.print("Type your password >>");
		String password = input.nextLine();
		System.out.print("Type your mobile number >>");
		String mobile = input.nextLine();
		
		String insertSql = "insert into members (name,email,password,mobile) values ('"+name+"', '"+email+"', '"+password+"','"+mobile+"');";
		
		try {
			Statement stmt = conn.createStatement();
			stmt.execute(insertSql);
			System.out.println("Member Adding Successful.");
		} catch (SQLException e) {
			System.out.println("Memeber can't add.");
			e.printStackTrace();
		}
		
	}
	
}
