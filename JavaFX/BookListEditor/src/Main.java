import java.sql.SQLException;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		Database database = new Database();
		
		List<Product> list = database.getData();

		TextField idField = new TextField();
		TextField nameField = new TextField();
		TextField priceField = new TextField();
		Button saveBtn = new Button("Save");
		saveBtn.setPrefSize(100, 50);
		Button delBtn = new Button("Delete");
		delBtn.setPrefSize(100, 50);

		TableColumn<Product, String> idCol = new TableColumn<>("PRODUCT ID");
		TableColumn<Product, String> nameCol = new TableColumn<>("PRODUCT NAME");
		TableColumn<Product, Integer> priceCol = new TableColumn<>("PRODUCT PRICE");

		idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
		idCol.setPrefWidth(200);
		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		nameCol.setPrefWidth(200);
		priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
		priceCol.setPrefWidth(200);
		
		TableView<Product> tbView = new TableView<>();
		tbView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		tbView.getColumns().add(idCol);
		tbView.getColumns().add(nameCol);
		tbView.getColumns().add(priceCol);
		tbView.getItems().addAll(list);

		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		hbox.setSpacing(10);

		hbox.getChildren().add(idField);
		hbox.getChildren().add(nameField);
		hbox.getChildren().add(priceField);
		hbox.getChildren().add(saveBtn);
		hbox.getChildren().add(delBtn);

		saveBtn.setOnAction(e -> {

			String productID = idField.getText();
			String productName = nameField.getText();
			int productPrice = Integer.parseInt(priceField.getText());
			
			tbView.getItems().add(new Product(productID, productName, productPrice));

			database.sentData(new Product(productID, productName, productPrice));

			});

		delBtn.setOnAction(e -> {

			Product item = tbView.getSelectionModel().getSelectedItem();
			tbView.getItems().removeAll(item);

			database.delData(item);

		});

		VBox vbox = new VBox();
		vbox.getChildren().add(tbView);
		vbox.getChildren().add(hbox);

		Scene scene = new Scene(vbox, 600, 400);

		stage.setTitle("PRODUCT LIST");
		stage.setScene(scene);

		stage.show();

	}

	public static void main(String[] args) {
		
		Database db = new Database();
		
		try {
			db.connect();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		launch(args);

		try {
			db.disconnect();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
