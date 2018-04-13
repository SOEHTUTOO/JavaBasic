import java.sql.SQLException;

public class App {

	public static void main(String[] args) {
		
		Database db = new Database();
		
		try {
			db.connect();
			System.out.println("Database connected.");
		} catch (SQLException e) {
			System.out.println("Database can't connect.");
			e.printStackTrace();
		}
		
		db.addMember();
		
		try {
			db.disconnect();
			System.out.println("Database disconnected.");
		} catch (SQLException e) {
			System.out.println("Database Can't disconnect.");
			e.printStackTrace();
		}
	}
}
