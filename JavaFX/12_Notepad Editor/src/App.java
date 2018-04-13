import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		FileChooser fileChooser = new FileChooser();

		MenuItem close = new MenuItem("Close");
		MenuItem open = new MenuItem("Open...");
		MenuItem save = new MenuItem("Save...");
		Menu fileMenu = new Menu("Menu");
		fileMenu.getItems().add(open);
		fileMenu.getItems().add(save);
		fileMenu.getItems().add(close);

		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(fileMenu);

		TextArea tArea = new TextArea();

		BorderPane layout = new BorderPane();
		layout.setTop(menuBar);
		layout.setCenter(tArea);

		open.setOnAction(e -> {

			File openFile = fileChooser.showOpenDialog(stage);

			try (BufferedReader textReader = new BufferedReader(new FileReader(openFile))) {

				String readTexts;
				while ((readTexts = textReader.readLine()) != null) {
					tArea.appendText(readTexts+"\n");
				}
				
				/////// Second Way to solve /////////////
				
//				String temStr = "";
//				while((readTexts = textReader.readLine()) != null) {
//					temStr += readTexts+"\n";
//				}
//				
//				tArea.setText(temStr);

			} catch (IOException e1) {
				e1.printStackTrace();
			}

		});

		save.setOnAction(e -> {

			File saveFile = fileChooser.showSaveDialog(stage);

			try (BufferedWriter textWriter = new BufferedWriter(new FileWriter(saveFile))) {
				
				String inputText = tArea.getText();
				String [] inputTextArray = inputText.split("\n");
				
				for(String splitedText: inputTextArray) {
					textWriter.write(splitedText);
					textWriter.newLine();
				}
				
				
		
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		});

		close.setOnAction(e -> {
			stage.close();
		});

		Scene scene = new Scene(layout, 600, 400);

		stage.setTitle("THE PHTOTOSHOP");
		stage.setScene(scene);
		stage.show();

	}

	public static void main(String[] args) {

		launch(args);

	}

}
