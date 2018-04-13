import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		Label label1 = new Label("Scene 1");
		Button btn1 = new Button("Go to Scene 2");
		
		Label label2 = new Label("Scene 2");
		Button btn2 = new Button("Go Back");
		
		HBox hbox = new HBox();
		hbox.setAlignment(Pos.CENTER);
		hbox.setSpacing(10);
		hbox.getChildren().add(label1);
		hbox.getChildren().add(btn1);
		
		VBox vbox = new VBox();
		vbox.setAlignment(Pos.CENTER);
		vbox.setSpacing(10);
		vbox.getChildren().add(label2);
		vbox.getChildren().add(btn2);
		
		
		Scene scene1 = new Scene(hbox, 500, 500);
		Scene scene2 = new Scene(vbox, 500, 500);
		
		btn1.setOnAction(e->{
			stage.setScene(scene2);
		});
		
		btn2.setOnAction(e->{
			stage.setScene(scene1);
		});
		
		stage.setScene(scene1);
		stage.show();
	
	}

	public static void main(String[] args) {
		
		launch(args);

	}

}
