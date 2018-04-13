
import java.sql.SQLException;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
	
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

	@Override
	public void start(Stage stage) throws Exception {
		
		User user = new User();
		
		Label title = new Label("WELCOME TO LOG IN!");
		Label emailLabel = new Label("EMAIL");
		Label passwordLabel = new Label("PASSWORD");
		TextField emailField = new TextField();
		PasswordField passwordField = new PasswordField();
		Button loginBtn = new Button("Log In");
		Label message = new Label();
		
		GridPane layout = new GridPane();
		layout.setAlignment(Pos.CENTER);
		layout.setHgap(10);
		layout.setVgap(5);
		layout.add(title, 0, 0, 2, 1);
		layout.add(emailLabel, 0, 1);
		layout.add(emailField, 1, 1);
		layout.add(passwordLabel, 0, 2);
		layout.add(passwordField, 1, 2);
		layout.add(message, 0, 3, 2, 1);
		layout.add(loginBtn, 1, 4);
		
		
		loginBtn.setOnAction(e->{
			
			user.setEmail(emailField.getText());
			user.setPassword(passwordField.getText());
			
			
			if(user.getCheckNo()!=0) {
				message.setText("You are Exist in Database.");
			}else {
				message.setText("User Doesn't Exist.");
			}
			
			
			
			
		});
		
		Scene scene = new Scene(layout, 300, 300);
		
		stage.setTitle("User Log In");
		stage.setScene(scene);
		stage.show();
		
	}
	
}
