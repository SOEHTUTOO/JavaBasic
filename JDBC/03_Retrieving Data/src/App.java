import java.sql.SQLException;
import java.util.List;

public class App {
	 
	public static void main(String[] args) {
		
		Database db = new Database();
		
		try {
			db.connect();
			System.out.println("Database Connected");
		} catch (SQLException e) {
			System.out.println("Database Cannot Connect.");
			e.printStackTrace();
		}
		
		Student student = db.getAStudent(7);
		if(student!=null) {
			System.out.println("ID : "+student.getId()+", NAME : "+student.getName()+", EMAIL : "+student.getEmail()+", PASSWORD :"+student.getPassword()+", MOBILE : "+student.getPassword());
		}
		
//		List<Student> students = db.getStudent();
//		for(Student std:students) {
//			System.out.println("ID : "+std.getId()+", NAME : "+std.getName()+", EMAIL : "+std.getEmail()+", PASSWORD :"+std.getPassword()+", MOBILE : "+std.getPassword());
//		}
		
		try {
			db.disconnect();
			System.out.println("Database Disconnected");
		} catch (SQLException e) {
			System.out.println("Database Can't Disconnect");
			e.printStackTrace();
		}
	}
}
