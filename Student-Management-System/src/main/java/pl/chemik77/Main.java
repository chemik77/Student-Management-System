package pl.chemik77;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		StackPane root = new StackPane();
		Scene scene = new Scene(root, 900, 600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Student Information System");
		primaryStage.show();
	}

}