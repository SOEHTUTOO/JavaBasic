import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {

	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Button btn = new Button();
		btn.setText("HELLO");

		Label label = new Label();

		HBox hbox = new HBox();
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().add(btn);
		hbox.getChildren().add(label);

//		btn.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent arg0) {
//
//				label.setText("Wow....");
//			}
//		});
		
//		btn.setOnAction((e)->{ // btn.setOnAction((ss)->{ or btn.setOnAction( ss -> {
//
//				label.setText(btn.getText());
//		});
		
		btn.setOnAction((e)->{ // btn.setOnAction((ss)->{ or btn.setOnAction( ss -> {
				
			if(btn.getText().equals("HELLO")) {
				btn.setText("HI");
			} else {
				btn.setText("HELLO");
			}
			
			
			
				
	});
		
		Scene scene = new Scene(hbox, 300, 200);
		
		stage.setScene(scene);
		stage.setTitle("Button Action");
		stage.show();
	}

}
