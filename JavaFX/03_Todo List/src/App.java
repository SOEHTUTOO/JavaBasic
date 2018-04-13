import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

	
	public static void main(String[] args) {
		
		launch(args);
		
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		
		TextField inputField = new TextField();
		Button saveBtn = new Button("Save");
		
		HBox hbox = new HBox();
		hbox.setAlignment(Pos.TOP_CENTER);
		hbox.setPadding(new Insets(10,0,0,0));
		hbox.setSpacing(15);
		hbox.getChildren().add(inputField);
		hbox.getChildren().add(saveBtn);
		
		
		VBox vbox = new VBox();
		vbox.getChildren().add(hbox);
		
		
		
		
		saveBtn.setOnAction(e->{
			
			vbox.getChildren().add(new Label("\t\t- "+inputField.getText()));
			vbox.setAlignment(Pos.TOP_LEFT);
			vbox.setSpacing(10);
			
		});
		
		
		
		
		
		Scene scene = new Scene(vbox, 300, 400);
		

		
		stage.setScene(scene);
		
		stage.setTitle("ToDo List");
		stage.show();

	}

}
