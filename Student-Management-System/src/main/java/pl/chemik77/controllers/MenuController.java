package pl.chemik77.controllers;

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
		FxmlUtils.loadStage(root, "/fxml/StudentInformation.fxml", "menu.studentInformation");
		FxmlUtils.hidePreviousWindow(event);
		
	}

	@FXML 
	public void listOfStudentsButtonOnAction(ActionEvent event) {
		
		Pane root = null;
		FxmlUtils.loadStage(root, "/fxml/ListOfStudents.fxml", "list.listOfStudents");
		FxmlUtils.hidePreviousWindow(event);
		
	}

	
}
