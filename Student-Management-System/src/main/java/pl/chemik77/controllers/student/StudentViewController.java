package pl.chemik77.controllers.student;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import pl.chemik77.modelsFx.fx.DivisionFx;
import pl.chemik77.modelsFx.fx.FacultyFx;
import pl.chemik77.modelsFx.fx.StudentFx;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Button;

public class StudentViewController {

	@FXML 
	TextField lastTextField;
	@FXML 
	TextField documentTextField;
	@FXML 
	TextField peselTextField;
	@FXML 
	TableColumn<StudentFx, String> lastColumn;
	@FXML 
	TableColumn<StudentFx, String> firstColumn;
	@FXML 
	TableColumn<StudentFx, String> documentColumn;
	@FXML 
	TableColumn<FacultyFx, String> facultyColumn;
	@FXML 
	TableColumn<DivisionFx, String> divisionColumn;
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
