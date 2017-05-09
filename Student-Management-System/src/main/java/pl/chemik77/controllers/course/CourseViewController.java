package pl.chemik77.controllers.course;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import pl.chemik77.modelsFx.fx.StudentCourseFx;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Button;

public class CourseViewController {

	@FXML 
	TextField courseNameTextField;
	@FXML 
	TextField courseCodeTextField;
	@FXML 
	Label ectsLabel;
	@FXML 
	Label facultyLabel;
	@FXML 
	Label teacherLabel;
	@FXML 
	TableColumn<StudentCourseFx, String> studentColumn;
	@FXML 
	TableColumn<StudentCourseFx, String> documentColumn;
	@FXML 
	TableColumn<StudentCourseFx, String> gradeColumn;
	@FXML 
	Button addButton;
	@FXML 
	Button editButton;
	@FXML 
	Button deleteButton;
	@FXML 
	public void addButtonOnAction() {}
	@FXML 
	public void editButtonOnAction() {}
	@FXML 
	public void deleteButtonOnAction() {}

}
