package pl.chemik77.controllers.teacher;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import pl.chemik77.modelsFx.fx.CourseFx;
import pl.chemik77.modelsFx.fx.TeacherFx;
import pl.chemik77.modelsFx.model.CourseModel;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class TeacherViewController {

	@FXML 
	private TextField teacherTextField;
	@FXML 
	private Label divisionLabel;
	@FXML 
	private TableView<CourseFx> courseTableView;
	@FXML 
	private TableColumn<CourseFx, TeacherFx> teacherNameColumn;
	@FXML 
	private TableColumn<CourseFx, String> courseNameColumn;
	@FXML 
	private TableColumn<CourseFx, String> courseCodeColumn;
	@FXML 
	private Button addButton;
	@FXML 
	private Button editButton;
	@FXML 
	private Button deleteButton;
	
	private CourseModel courseModel;
	
	
	public void initialize() {
		courseModel = new CourseModel();
		courseModel.init();
		
		this.courseTableView.setItems(this.courseModel.getCourseFxOL());
		this.teacherNameColumn.setCellValueFactory(cd-> cd.getValue().teacherFxProperty());
		this.courseNameColumn.setCellValueFactory(cd-> cd.getValue().nameCourseProperty());
		this.courseCodeColumn.setCellValueFactory(cd-> cd.getValue().codeCourseProperty());
	}
	
	@FXML 
	public void addButtonOnAction() {}
	@FXML 
	public void editButtonOnAction() {}
	@FXML 
	public void deleteButtonOnAction() {}

	@FXML public void teacherOnMouseClicked() {
	}

}
