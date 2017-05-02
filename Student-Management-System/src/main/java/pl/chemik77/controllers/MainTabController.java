package pl.chemik77.controllers;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import pl.chemik77.utils.FxmlUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainTabController {

	@FXML
	private Button addStudentButton;
	@FXML 
	private Button listOfStudentsButton;
	@FXML 
	private Button coursesButton;
	
	public void initialize() {
		
	}
	
	@FXML
	public void addStudentButtonOnAction(ActionEvent event) {
		
		Pane root = null;
		FxmlUtils.loadStage(root, "/fxml/student/StudentInformation.fxml", "menu.studentInformation");
		FxmlUtils.hidePreviousWindow(event);
		
	}

	@FXML 
	public void listOfStudentsButtonOnAction(ActionEvent event) {
		
		Pane root = null;
		FxmlUtils.loadStage(root, "/fxml/student/ListOfStudents.fxml", "list.listOfStudents");
		FxmlUtils.hidePreviousWindow(event);
		
	}

	@FXML 
	public void coursesButtonOnAction(ActionEvent event) {
		Pane root = null;
		FxmlUtils.loadStage(root, "/fxml/course/CourseInformation.fxml", "course.title");
		FxmlUtils.hidePreviousWindow(event);
	}

	
}
