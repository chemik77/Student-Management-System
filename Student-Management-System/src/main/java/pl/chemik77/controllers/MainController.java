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
		
		MenuController menuController = loader.getController();
		menuController.setMainController(this);
		setScreen(gridPane);
		
	}

	public void setScreen(GridPane gridPane) {
		
		mainStackPane.getChildren().clear();
		mainStackPane.getChildren().add(gridPane);
	}
	
}
