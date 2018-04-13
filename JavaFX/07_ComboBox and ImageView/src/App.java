import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

class ImgItem{
	
	private String name;
	private Image img;
	
	public ImgItem(String name, Image img) {
		
		this.name = name;
		this.img = img;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return name;
	}
	
}

public class App extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		Image happyImg = new Image("/icons/smiling.png");
		Image unHappyImg = new Image("/icons/crying.png");
		
		ImgItem happyItem = new ImgItem("HAPPY", happyImg);
		ImgItem unHappyItem = new ImgItem("UN-HAPPY", unHappyImg);
		
		ComboBox<ImgItem> comBox = new ComboBox<>();
		comBox.getItems().add(happyItem);
		comBox.getItems().add(unHappyItem);
		comBox.setValue(happyItem);
//		comBox.setEditable(true);

		
		
		ImageView imgView = new ImageView();
		imgView.setImage(happyImg);
		
		comBox.setOnAction(e->{
			
			ImgItem selectItem = comBox.getSelectionModel().getSelectedItem();
			imgView.setImage(selectItem.getImg());
				
			
		});
		
		HBox hbox = new HBox();
		hbox.setAlignment(Pos.CENTER);
		hbox.setSpacing(15);
		hbox.getChildren().add(comBox);
		hbox.getChildren().add(imgView);
		
		Scene scene = new Scene(hbox, 300, 300);
		
		stage.setScene(scene);
		stage.show();
		

	}

	public static void main(String[] args) {
		
		launch(args);

	}

}
