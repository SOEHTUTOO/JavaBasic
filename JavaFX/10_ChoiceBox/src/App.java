import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		ChoiceBox<String> foodMenu = new ChoiceBox<>();
		foodMenu.getItems().add("Cake");
		foodMenu.getItems().add("Juice");
		foodMenu.getItems().add("Burger");
		foodMenu.setValue("Cake");
		
		foodMenu.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> obj, String oldVal, String newVal) {
				System.out.println("Old Value : "+oldVal);
				System.out.println("New Value : "+newVal);
				
			}
			
		});
		
		HBox hbox = new HBox();
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().add(foodMenu);
		
		Scene scene = new Scene(hbox, 300, 300);
		
		stage.setScene(scene);
		stage.setTitle("Choice Box");
		stage.show();
		
	}
	
	public static void main(String[] args) {
		
		launch(args);
		
	}

}
