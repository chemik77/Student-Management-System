package pl.chemik77.controllers.teacher;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.Label;

import javafx.scene.control.TableView;
import javafx.stage.Stage;

import pl.chemik77.modelsFx.fx.CourseFx;
import pl.chemik77.modelsFx.fx.TeacherFx;
import pl.chemik77.modelsFx.model.TeacherModel;

import javafx.scene.control.TableColumn;

public class TeacherCoursesController {
	@FXML
	private Label degreeLabel;
	@FXML
	private Label lastNameLabel;
	@FXML
	private Label firstNameLabel;
	@FXML
	private TableView<CourseFx> courseTableView;
	@FXML
	private TableColumn<CourseFx, String> courseCodeColumn;
	@FXML
	private TableColumn<CourseFx, String> courseNameColumn;
	@FXML
	private TableColumn<CourseFx, String> ectsColumn;
	@FXML
	private Button cancelButton;
	@FXML
	private Button addButton;
	@FXML
	private Button deleteButton;

	private TeacherModel teacherModel;
	
	@FXML
	private void initialize() {
		this.teacherModel = new TeacherModel();
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
	
	public void getCourses(TeacherFx teacherFx, ObservableList<CourseFx> teacherCoursesFxOL) {
		this.degreeLabel.setText(teacherFx.getDegree());
		this.lastNameLabel.setText(teacherFx.getLastNameTeacher());
		this.firstNameLabel.setText(teacherFx.getFirstNameTeacher());
		this.courseTableView.setItems(teacherCoursesFxOL);
		this.courseCodeColumn.setCellValueFactory(cd -> cd.getValue().codeCourseProperty());
		this.courseNameColumn.setCellValueFactory(cd -> cd.getValue().nameCourseProperty());
		this.ectsColumn.setCellValueFactory(cd -> cd.getValue().ectsProperty().asString());
	}
}
