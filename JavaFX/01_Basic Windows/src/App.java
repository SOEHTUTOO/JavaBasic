import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/*
 *  Extends Application class ( Abstract Class)
 *  launch();
 *  Override Start Stop Init
 *  
 */

public class App extends Application{

	public static void main(String[] args) {
		
		launch(args);
	}
	
	@Override
	public void init() throws Exception {
		
		super.init();
	}
	
	@Override
	public void stop() throws Exception {
		
		super.stop();
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Label label = new Label("My First JavaFX Application!");
		Button btn = new Button("Click Me");
		
		StackPane layout = new StackPane(); // HBox - (Horizon) VBox
		layout.getChildren().add(btn);
		layout.getChildren().add(label);
		
		Scene scene = new Scene(layout, 300, 200);
		
		stage.setScene(scene);
		stage.show();
		
	}

}
