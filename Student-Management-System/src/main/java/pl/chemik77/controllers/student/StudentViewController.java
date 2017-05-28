package pl.chemik77.controllers.student;

import java.io.IOException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import pl.chemik77.controllers.other.PersonalInfoController;
import pl.chemik77.modelsFx.fx.DivisionFx;
import pl.chemik77.modelsFx.fx.FacultyFx;
import pl.chemik77.modelsFx.fx.StudentFx;
import pl.chemik77.modelsFx.model.PersonalInfoModel;
import pl.chemik77.modelsFx.model.StudentCourseModel;
import pl.chemik77.modelsFx.model.StudentModel;
import pl.chemik77.utils.FxmlUtils;

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
	@FXML
	private Button personalInfoButton;
	@FXML
	private Button coursesButton;

	private StudentModel studentModel;

	private PersonalInfoModel personalInfoModel;
	
	private StudentCourseModel studentCourseModel;

	
	@FXML
	public void initialize() {
		this.studentModel = new StudentModel();
		this.personalInfoModel = new PersonalInfoModel();
		this.studentCourseModel = new StudentCourseModel();
		
		this.studentModel.init();
		this.studentCourseModel.init();
		
		
		this.studentTableView.setItems(this.studentModel.getStudentFxOL());
		this.lastColumn.setCellValueFactory(cd -> cd.getValue().lastNameProperty());
		this.firstColumn.setCellValueFactory(cd -> cd.getValue().firstNameProperty());
		this.documentColumn.setCellValueFactory(cd -> cd.getValue().documentProperty());
		this.facultyColumn.setCellValueFactory(cd -> cd.getValue().facultyFxProperty());
		this.divisionColumn.setCellValueFactory(cd -> cd.getValue().divisionFxProperty());
		
		this.personalInfoButton.disableProperty().bind(this.personalInfoModel.personalInfoFxProperty().isNull());
		this.coursesButton.disableProperty().bind(this.studentCourseModel.studentFxProperty().isNull());
		
		this.studentTableView.getSelectionModel().selectedItemProperty()
				.addListener((observable, oldValue, newValue) -> {
					this.personalInfoModel.setStudentFx(newValue);
					this.personalInfoModel.setPersonalFromObject();
					
					this.studentCourseModel.setStudentFx(newValue);
				});
		
		
		
		}

	@FXML
	public void addButtonOnAction() {

		BorderPane borderPane = null;
		borderPane = (BorderPane) FxmlUtils.getPane("/fxml/student/StudentAdd.fxml");
		
		Scene scene = new Scene(borderPane);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();

	}

	@FXML
	public void editButtonOnAction() {
	}

	@FXML
	public void deleteButtonOnAction() {
	}

	@FXML
	public void personalInfoButtonOnAction() throws IOException {

		Stage stage = new Stage();
		Pane pane = this.personalInfoModel.connectController();
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();

	}

	@FXML
	public void coursesButtonOnAction() throws IOException {
		
		this.studentCourseModel.filterStudentCourseList();
		Stage stage = new Stage();
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/student/StudentCourses.fxml"));
		loader.setResources(ResourceBundle.getBundle("bundles.ApplicationResources"));
		Pane pane = loader.load();
		StudentCoursesController studentCoursesController = (StudentCoursesController)loader.getController();
		studentCoursesController.getCourses(this.studentCourseModel.getStudentFx(), this.studentCourseModel.getStudentCourseFxOL());
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
		
		
	}


}
