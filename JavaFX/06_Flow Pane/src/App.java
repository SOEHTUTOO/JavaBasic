import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		TextField inputField = new TextField();
		Button btn = new Button("Create");
		
		
		FlowPane layout = new FlowPane();
		layout.setHgap(10);
		layout.setVgap(10);
		layout.setPrefSize(100, 80);
		
		HBox hbox = new HBox();
		hbox.setAlignment(Pos.TOP_CENTER);
		hbox.setPadding(new Insets(20,0,0,0));
		hbox.setSpacing(10);
		hbox.getChildren().add(inputField);
		hbox.getChildren().add(btn);
		
		
		VBox vbox = new VBox();
		vbox.setAlignment(Pos.TOP_CENTER);
		vbox.setSpacing(10);
		vbox.getChildren().add(hbox);
		vbox.getChildren().add(layout);
		
		btn.setOnAction(e->{
			Button newBtn = new Button(inputField.getText());
			newBtn.setPrefSize(100, 80);
			layout.getChildren().add(newBtn);
			
		});
		
		Scene scene = new Scene(vbox, 330, 330);
		
		stage.setScene(scene);
		stage.setTitle("FlowPane");
		stage.show();

	}

	public static void main(String[] args) {
		
		launch(args);

	}

}
