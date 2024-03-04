package scene03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainClass03 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
System.out.println(getClass().getResource("test03.fxml"));
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("test03.fxml"));
		
		AnchorPane root = loader.load();
		
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
