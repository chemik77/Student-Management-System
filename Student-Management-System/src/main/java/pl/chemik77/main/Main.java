package pl.chemik77.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/MainScreen.fxml"));
		StackPane pane = loader.load();
		Scene scene = new Scene(pane, 500, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Student Information System");
		primaryStage.show();
		
	}

}
