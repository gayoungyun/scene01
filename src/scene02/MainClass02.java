package scene02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainClass02 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println(getClass().getResource("test02.fxml"));
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("test02.fxml"));
		
		AnchorPane root = loader.load();
		
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
