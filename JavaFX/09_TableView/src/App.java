import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

public class App extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		Products p1 = new Products("P001", "Lenovo Laptop", 560000);
		Products p2 = new Products("P002", "Acer Laptop", 460000);
		Products p3 = new Products("P003", "Dell Laptop", 360000);
		Products p4 = new Products("P004", "Asus Laptop", 500000);

		ObservableList<Products> list = FXCollections.observableArrayList();

		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);

		TableView<Products> tbView = new TableView<>();
		tbView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		TableColumn<Products, String> idCol = new TableColumn<>("PRODUCT ID");
		TableColumn<Products, String> nameCol = new TableColumn<>("PRODUCT NAME");
		TableColumn<Products, Integer> priceCol = new TableColumn<>("PRODUCT PRICE");

		idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));

		idCol.setPrefWidth(200);
		nameCol.setPrefWidth(200);
		priceCol.setPrefWidth(200);

		tbView.getColumns().add(idCol);
		tbView.getColumns().add(nameCol);
		tbView.getColumns().add(priceCol);

		tbView.getItems().addAll(list);

		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		hbox.setSpacing(10);

		TextField idField = new TextField();
		TextField nameField = new TextField();
		TextField priceField = new TextField();

		Button saveBtn = new Button("Save");
		saveBtn.setPrefSize(100, 50);

		Button delBtn = new Button("Delete");
		delBtn.setPrefSize(100, 50);

		hbox.getChildren().add(idField);
		hbox.getChildren().add(nameField);
		hbox.getChildren().add(priceField);
		hbox.getChildren().add(saveBtn);
		hbox.getChildren().add(delBtn);

		saveBtn.setOnAction(e -> {

			String id = idField.getText();
			String name = nameField.getText();
			int price = Integer.parseInt(priceField.getText());

			Products pdn = new Products(id, name, price);
			tbView.getItems().add(pdn);

		});

		delBtn.setOnAction(e -> {

			// Products product = tbView.getSelectionModel().getSelectedItem();
			// tbView.getItems().remove(product);

			ObservableList<Products> items = tbView.getSelectionModel().getSelectedItems();
			tbView.getItems().removeAll(items); // To Remove Selected
			// tbView.getItems().retainAll(items); // To Remove Unselected

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

		launch(args);

	}

}
