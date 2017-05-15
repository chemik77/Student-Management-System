package pl.chemik77.controllers.student;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import pl.chemik77.modelsFx.fx.DivisionFx;
import pl.chemik77.modelsFx.fx.FacultyFx;
import pl.chemik77.modelsFx.fx.StudentFx;
import pl.chemik77.modelsFx.model.StudentModel;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class StudentViewController {

	@FXML 
	private TextField lastTextField;
	@FXML 
	private TextField documentTextField;
	@FXML 
	private TextField peselTextField;
	@FXML 
	private TableView<StudentFx> studentTableView;
	@FXML 
	private TableColumn<StudentFx, String> lastColumn;
	@FXML 
	private TableColumn<StudentFx, String> firstColumn;
	@FXML 
	private TableColumn<StudentFx, String> documentColumn;
	@FXML 
	private TableColumn<StudentFx, FacultyFx> facultyColumn;
	@FXML 
	private TableColumn<StudentFx, DivisionFx> divisionColumn;
	@FXML 
	private Button addButton;
	@FXML 
	private Button editButton;
	@FXML 
	private Button deleteButton;
	
	private StudentModel studentModel;
	
	public void initialize() {
		this.studentModel = new StudentModel();
		
		this.studentModel.init();
		
		this.studentTableView.setItems(this.studentModel.getStudentFxOL());
		this.lastColumn.setCellValueFactory(cd-> cd.getValue().lastNameProperty());
		this.firstColumn.setCellValueFactory(cd-> cd.getValue().firstNameProperty());
		this.documentColumn.setCellValueFactory(cd-> cd.getValue().documentProperty());
		this.facultyColumn.setCellValueFactory(cd->cd.getValue().facultyFxProperty());
		this.divisionColumn.setCellValueFactory(cd->cd.getValue().divisionFxProperty());
	}
	
	@FXML 
	public void addButtonOnAction() {}
	@FXML 
	public void editButtonOnAction() {}
	@FXML 
	public void deleteButtonOnAction() {}

}
