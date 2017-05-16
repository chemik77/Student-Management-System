package pl.chemik77.utils;

import java.io.IOException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FxmlUtils {
	
	public static Pane getPane(String fxmlPath) {
		
		FXMLLoader loader = new FXMLLoader(FxmlUtils.class.getClass().getResource(fxmlPath));
		loader.setResources(ResourceBundle.getBundle("bundles.ApplicationResources"));
		try {
			return loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getBundles(String key) {
		
		return ResourceBundle.getBundle("bundles.ApplicationResources").getString(key);
		
	}
	
	public static Stage loadStage(Pane root, String fxmlPath, String key) {
		
		root = (Pane) FxmlUtils.getPane(fxmlPath);
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.setTitle(FxmlUtils.getBundles(key));
		stage.show();
		return stage;
	}
	
	public static void hidePreviousWindow(ActionEvent event) {
		((Node) event.getSource()).getScene().getWindow().hide();
	}
	
	
}
