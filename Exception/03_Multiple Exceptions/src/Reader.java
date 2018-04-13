import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Reader {
	
	public void read() throws SQLException, FileNotFoundException {
		int errorCode = check();
		
		if(errorCode==1) {
			throw new SQLException("SQL Exception Par.");
		}
		if(errorCode==2) {
			throw new FileNotFoundException("File Not Found Exception Par.");
		}
	}
	
	public int check() {
		// 1. SQL Exception
		// 2. FileNotFoundException
		return 2;
	}

}
