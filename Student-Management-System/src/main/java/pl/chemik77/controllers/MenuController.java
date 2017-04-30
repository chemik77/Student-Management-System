package pl.chemik77.controllers;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import pl.chemik77.utils.FxmlUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MenuController {

	@FXML
	private Button addStudentButton;
	@FXML 
	private Button listOfStudentsButton;
	
	public void initialize() {
		
	}
	
	@FXML
	public void addStudentButtonOnAction(ActionEvent event) {
		
		Pane root = null;
		FxmlUtils.loadView(root, "/fxml/StudentInformation.fxml");
		
		((Node) event.getSource()).getScene().getWindow().hide();
		
	}

	@FXML 
	public void listOfStudentsButtonOnAction() {
		
	}

	
}
