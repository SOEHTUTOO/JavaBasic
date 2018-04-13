import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {
   public static void main(String[] args) {
      Application.launch(args);
   }
   @Override
   public void start(Stage stage) throws Exception {
      stage.setScene(new Scene(new PersonUI(), 600, 280));
      stage.show();
   }
}