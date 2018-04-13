import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Database {

	private Connection conn;
	
	public void connect() throws SQLException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Found.");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found.");
			e.printStackTrace();
		}
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
		
	}
	
	public Student getAStudent(int id) {
		
		String cmdSql = "select * from members where id="+id;
		
		Student std = null;
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet results = stmt.executeQuery(cmdSql);
			
			while(results.next()) {
				
				String name = results.getString("name");
				String email = results.getString("email");
				String password = results.getString("password");
				String mobile = results.getString("mobile");
				
				std = new Student(id, name, email, password, mobile);
			}
		} catch (SQLException e) {
			System.out.println("Can't get Student data.");
			e.printStackTrace();
		}
		
		return std;
	}
	
	public List<Student> getStudent() {
		
		List<Student> students = new ArrayList<>();
		
		String cmdSql = "select * from members";
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet results = stmt.executeQuery(cmdSql);
			
			while(results.next()) {
				
				int id = results.getInt("id");
				String name = results.getString("name");
				String email = results.getString("email");
				String password = results.getString("password");
				String mobile = results.getString("mobile");
				
				students.add(new Student(id, name, email, password, mobile));
			}
		} catch (SQLException e) {
			System.out.println("Can't get Student data.");
			e.printStackTrace();
		}
		
		return students;
		
	}
	
	public void disconnect() throws SQLException {
		if(conn!=null) {
			conn.close();
		}
		
	}
	
}
