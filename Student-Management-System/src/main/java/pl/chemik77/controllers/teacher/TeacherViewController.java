package pl.chemik77.controllers.teacher;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import pl.chemik77.modelsFx.fx.CourseFx;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Button;

public class TeacherViewController {

	@FXML 
	TextField teacherTextField;
	@FXML 
	Label divisionLabel;
	@FXML 
	TableColumn<CourseFx, String> courseNameColumn;
	@FXML 
	TableColumn<CourseFx, String> courseCodeColumn;
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
