package pl.chemik77;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import pl.chemik77.database.dbUtils.DbManager;
import pl.chemik77.utils.FillDatabase;

public class Main extends Application {

	public static void main(String[] args) {
		
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/StudentInformation.fxml"));
		
		BorderPane root = loader.load();
		Scene scene = new Scene(root, 900, 600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Student Information System");
		primaryStage.show();
		
		DbManager.initDatabase();
		FillDatabase.fillDatabase();
	}

}
