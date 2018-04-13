import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		MenuItem newFile = new MenuItem("New File");
		MenuItem openFile = new MenuItem("Open File");
		MenuItem saveFile = new MenuItem("Save File");
		Menu fileMenu = new Menu("File");
		fileMenu.getItems().add(newFile);
		fileMenu.getItems().add(openFile);
		fileMenu.getItems().add(saveFile);
		
		MenuItem aboutItem = new MenuItem("About");
		Menu helpMenu = new Menu("Help");
		helpMenu.getItems().add(aboutItem);
		
		////////// Here to see carefully ////////////
		
		CheckMenuItem checkMenuItem = new CheckMenuItem("Check Tools");
		
		Menu windowsItem = new Menu("Tools");
		windowsItem.getItems().add(checkMenuItem);
		
		Menu windowsMenu = new Menu("Windows");
		windowsMenu.getItems().add(windowsItem);
		
		/////////////////////////////////////////////
		
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(fileMenu);
		menuBar.getMenus().add(windowsMenu);
		menuBar.getMenus().add(helpMenu);
		
		TextArea tArea = new TextArea();
		
		BorderPane layout = new BorderPane();
		layout.setTop(menuBar);
		layout.setCenter(tArea);
		
		Scene scene = new Scene(layout, 600, 400);
		
		stage.setScene(scene);
		stage.show();

	}
	
	public static void main(String[] args) {
		
		launch(args);
		
	}

}
