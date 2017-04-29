package pl.chemik77.controllers;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pl.chemik77.utils.FxmlUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MenuController {

	@FXML
	private Button addStudentButton;
	
	public void initialize() {
		
	}
	
	@FXML
	public void addStudentButtonOnAction(ActionEvent event) {
		
		Pane root = null;
		root = (Pane) FxmlUtils.getPane("/fxml/StudentInformation.fxml");
		Stage stage = new Stage();
		stage.setTitle("Menu");
		stage.setScene(new Scene(root));
		stage.show();
		
		((Node) event.getSource()).getScene().getWindow().hide();
	}

	
}
