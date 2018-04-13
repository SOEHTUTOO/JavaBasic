import java.sql.SQLException;

public class App {
	public static void main(String[] args) {

		Database db = new Database();

		try {
			db.connect();
			System.out.println("Database connect.");
		} catch (SQLException e) {
			System.out.println("Database not connect.");
			e.printStackTrace();
		}

		try {
			db.disconnect();
			System.out.println("Database disconnected.");
		} catch (SQLException e) {
			System.out.println("Disconnect Error.");
			e.printStackTrace();
		}
	}
}
