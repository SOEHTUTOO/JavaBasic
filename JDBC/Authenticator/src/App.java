import java.sql.SQLException;


public class App {
	 
	public static void main(String[] args) {
		
		Database db = new Database();
		
		try {
			db.connect();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		db.checkInfo();
		
		
		try {
			db.disconnect();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
