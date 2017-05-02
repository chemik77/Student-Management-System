package pl.chemik77;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pl.chemik77.database.dbUtils.DbManager;
import pl.chemik77.utils.FillDatabase;
import pl.chemik77.utils.FxmlUtils;

public class Main extends Application {
	
	public static void main(String[] args) {
		
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Pane root = FxmlUtils.getPane("/fxml/MainWindow.fxml");
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		DbManager.initDatabase();
		FillDatabase.fillDatabase();
	}

}
