package pl.chemik77.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class MainController {
	
	@FXML
	private StackPane mainStackPane;
	
	@FXML
	public void initialize() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/MenuScreen.fxml"));
		GridPane gridPane = null;
		
		try {
			
			gridPane = loader.load();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		mainStackPane.getChildren().add(gridPane);
		
	}
	
}
