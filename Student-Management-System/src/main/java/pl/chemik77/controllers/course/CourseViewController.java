package pl.chemik77.controllers.course;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import pl.chemik77.modelsFx.fx.CourseFx;
import pl.chemik77.modelsFx.fx.StudentCourseFx;
import pl.chemik77.modelsFx.fx.StudentFx;
import pl.chemik77.modelsFx.model.CourseModel;
import pl.chemik77.modelsFx.model.StudentCourseModel;

public class CourseViewController {

	@FXML 
	private ComboBox<CourseFx> courseNameComboBox;
	@FXML 
	private Label ectsLabel;
	@FXML 
	private Label facultyLabel;
	@FXML 
	private Label teacherLabel;
	@FXML 
	private TableView<StudentCourseFx> studentTableView;
	@FXML 
	private TableColumn<StudentCourseFx, StudentFx> studentColumn;
	@FXML 
	private TableColumn<StudentCourseFx, String> documentColumn;
	@FXML 
	private TableColumn<StudentCourseFx, Number> gradeColumn;
	@FXML 
	private Button addButton;
	@FXML 
	private Button editButton;
	@FXML 
	private Button deleteButton;
	
	private StudentCourseModel studentCourseModel;
	private CourseModel courseModel;
	
	public void initialize() {
		this.studentCourseModel = new StudentCourseModel();
		this.courseModel = new CourseModel();
		
		this.studentCourseModel.init();
		this.courseModel.init();
		
		this.courseNameComboBox.setItems(this.courseModel.getCourseFxOL());
		this.studentCourseModel.courseFxProperty().bind(this.courseNameComboBox.valueProperty());
		
		this.studentTableView.setItems(this.studentCourseModel.getStudentCourseFxOL());
		this.studentColumn.setCellValueFactory(cd-> cd.getValue().studentFxProperty());
		this.documentColumn.setCellValueFactory(cd-> cd.getValue().getStudentFx().documentProperty());
		this.gradeColumn.setCellValueFactory(cd-> cd.getValue().gradeProperty());
		
		
	}
	
	@FXML 
	public void addButtonOnAction() {}
	@FXML 
	public void editButtonOnAction() {}
	@FXML 
	public void deleteButtonOnAction() {}

	@FXML public void courseComboBoxOnAction() {
		this.studentCourseModel.filterStudentCourseList();
	}

}
