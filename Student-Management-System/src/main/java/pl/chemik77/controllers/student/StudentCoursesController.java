package pl.chemik77.controllers.student;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.Label;

import javafx.scene.control.TableView;
import javafx.stage.Stage;

import pl.chemik77.modelsFx.fx.StudentCourseFx;
import pl.chemik77.modelsFx.fx.StudentFx;
import pl.chemik77.modelsFx.model.StudentCourseModel;

import javafx.scene.control.TableColumn;

public class StudentCoursesController {
	@FXML
	private Label lastNameLabel;
	@FXML
	private Label firstNameLabel;
	@FXML
	private TableView<StudentCourseFx> courseTableView;
	@FXML
	private TableColumn<StudentCourseFx, String> courseCodeColumn;
	@FXML
	private TableColumn<StudentCourseFx, String> courseNameColumn;
	@FXML
	private TableColumn<StudentCourseFx, Number> ectsColumn;
	@FXML
	private Button cancelButton;
	@FXML
	private Button addButton;
	@FXML
	private Button deleteButton;
	
	private StudentCourseModel studentCourseModel;

	@FXML
	private void initialize() {
		this.studentCourseModel = new StudentCourseModel();
		this.studentCourseModel.init();
	}
	
	@FXML
	public void cancelButtonOnAction(ActionEvent event) {
		Stage stage = (Stage) this.cancelButton.getScene().getWindow();
		stage.close();
		
	}

	
	@FXML
	public void addButtonOnAction(ActionEvent event) {

		
	}

	
	@FXML
	public void deleteButtonOnAction(ActionEvent event) {

		
	}
	
	public void getCourses(StudentFx studentFx, ObservableList<StudentCourseFx> studentCourseFxOL) {
		this.lastNameLabel.setText(studentFx.getLastName());
		this.firstNameLabel.setText(studentFx.getFirstName());
		this.courseTableView.setItems(studentCourseFxOL);
		this.courseNameColumn.setCellValueFactory(cd -> cd.getValue().getCourseFx().nameCourseProperty());
		this.courseCodeColumn.setCellValueFactory(cd -> cd.getValue().getCourseFx().codeCourseProperty());
		this.ectsColumn.setCellValueFactory(cd -> cd.getValue().getCourseFx().ectsProperty());
	}
}
