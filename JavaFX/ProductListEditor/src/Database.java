import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Database {

	private static Connection connectionToDB;

	public void connect() throws SQLException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		connectionToDB = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb", "root", "");

	}

	public void sentData(Product product) {

		String sentDataCommand = "insert into products (id,name,price) values (?, ?, ?)";

		try {
			PreparedStatement cmdStmt = connectionToDB.prepareStatement(sentDataCommand);
			cmdStmt.setString(1, product.getId());
			cmdStmt.setString(2, product.getName());
			cmdStmt.setInt(3, product.getPrice());
			cmdStmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delData(Product product) {

		String delDataCommand = "delete from products where id=?";

		try {
			PreparedStatement cmdStmt = connectionToDB.prepareStatement(delDataCommand);
			cmdStmt.setString(1, product.getId());
			cmdStmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Product> getData() {

		List<Product> list = new ArrayList<>();

		String getDataCommand = "select * from products";

		try {
			Statement cmdStmt = connectionToDB.createStatement();
			ResultSet results = cmdStmt.executeQuery(getDataCommand);

			while (results.next()) {

				String id = results.getString("id");
				String name = results.getString("name");
				int price = results.getInt("price");

				list.add(new Product(id, name, price));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public void disconnect() throws SQLException {

		if (connectionToDB != null) {
			connectionToDB.close();
		}

	}

}
