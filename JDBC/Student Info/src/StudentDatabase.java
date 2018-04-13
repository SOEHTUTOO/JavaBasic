import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDatabase {
	
	private Connection dbConnector;

	public void startConnectDB() throws SQLException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		dbConnector = DriverManager.getConnection("jdbc:mysql://localhost:3306/stdb","root","");
		
	}
	
	public void stopConnectDB() throws SQLException {
		
		if(dbConnector!=null) {
			dbConnector.close();
		}
	}
	
	public void saveStudentInfoToDB() { 
		
		Student stInfo = new Student();
		System.out.println(stInfo.getStudentName()
				+stInfo.getBirthDate()
				+stInfo.getBirthMonth()
				+stInfo.getBirthYear()
				+stInfo.getFatherName()
				+stInfo.getMotherName()
				+stInfo.getStudentPlace()
				+stInfo.getStudentMobile());
		
//		try {
//			
//			String mysqlCommandLine ="insert into studentinfos (name,date,month,year,father,mother,place,mobile) values ('"
//					+stInfo.getStudentName()+"','"
//					+stInfo.getBirthDate()+"','"
//					+stInfo.getBirthMonth()+"','"
//					+stInfo.getBirthYear()+"','"
//					+stInfo.getFatherName()+"','"
//					+stInfo.getMotherName()+"','"
//					+stInfo.getStudentPlace()+"','"
//					+stInfo.getStudentMobile()+"');";
//			
//			Statement mysqlCommand = dbConnector.createStatement();
//			mysqlCommand.execute(mysqlCommandLine);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
		
	}
}
