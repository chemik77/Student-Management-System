package pl.chemik77.controllers.student;

import java.io.IOException;
import java.util.ResourceBundle;

import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import pl.chemik77.controllers.other.PersonalInfoController;
import pl.chemik77.modelsFx.fx.DivisionFx;
import pl.chemik77.modelsFx.fx.FacultyFx;
import pl.chemik77.modelsFx.fx.StudentFx;
import pl.chemik77.modelsFx.model.PersonalInfoModel;
import pl.chemik77.modelsFx.model.StudentCourseModel;
import pl.chemik77.modelsFx.model.StudentModel;

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
	private TableColumn<StudentFx, String> peselColumn;
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

	private SortedList<StudentFx> sortedList;
	
	
	@FXML
	public void initialize() {
		this.studentModel = StudentModel.getInstance();
		this.personalInfoModel = new PersonalInfoModel();
		this.studentCourseModel = new StudentCourseModel();
		this.studentModel.init();
		this.studentCourseModel.init();
		
		
		initializeColumns();
		filterDataWithTextFields();
		
		
		//disable buttons when object in model is null
		this.personalInfoButton.disableProperty().bind(this.personalInfoModel.personalInfoFxProperty().isNull());
		this.coursesButton.disableProperty().bind(this.studentCourseModel.studentFxProperty().isNull());
		this.editButton.disableProperty().bind(this.studentTableView.getSelectionModel().selectedItemProperty().isNull());
		this.deleteButton.disableProperty().bind(this.studentTableView.getSelectionModel().selectedItemProperty().isNull());
		
		//select student from table to more info
		this.studentTableView.getSelectionModel().selectedItemProperty()
				.addListener((observable, oldValue, newValue) -> {
					this.personalInfoModel.setStudentFx(newValue);
					this.personalInfoModel.setPersonalFromObject();
					
					this.studentModel.setStudentFx(oldValue);
					this.studentModel.setPersonalFromObject();
					
					this.studentCourseModel.setStudentFx(newValue);
				});
		
		this.studentModel.setStudentFx(new StudentFx());
		
		
		}
	
	public void initializeColumns() {
		//initialize columns
		this.peselColumn.setCellValueFactory(cd -> cd.getValue().getPersonalInfoFx().peselProperty());
		this.lastColumn.setCellValueFactory(cd -> cd.getValue().lastNameProperty());
		
		this.firstColumn.setCellValueFactory(cd -> cd.getValue().firstNameProperty());
		this.documentColumn.setCellValueFactory(cd -> cd.getValue().documentProperty());
		this.facultyColumn.setCellValueFactory(cd -> cd.getValue().facultyFxProperty());
		this.divisionColumn.setCellValueFactory(cd -> cd.getValue().divisionFxProperty());
		
	}
	
	public void filterDataWithTextFields() {
		//filter data with textFields
		this.sortedList = new SortedList<>(this.studentModel.getFilteredList());
		//filter data by name
		this.lastTextField.textProperty().addListener((observable, oldValue, newValue) -> {
			this.studentModel.filterByName(newValue);
		});
		//filter data by doc
		this.documentTextField.textProperty().addListener((observable, oldValue, newValue) -> {
			this.studentModel.filterByDoc(newValue);
		});
		//filter data by pesel
		this.peselTextField.textProperty().addListener((observable, oldValue, newValue) -> {
			this.studentModel.filterByPesel(newValue);
		});
		this.sortedList.comparatorProperty().bind(this.studentTableView.comparatorProperty());
		this.studentTableView.setItems(this.sortedList);
		
	}

	@FXML
	public void addButtonOnAction() throws IOException {
		
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/student/StudentAdd.fxml"));
		loader.setResources(ResourceBundle.getBundle("bundles.ApplicationResources"));
		Scene scene = new Scene(loader.load());
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();

	}

	@FXML
	public void editButtonOnAction() throws IOException {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/student/StudentAdd.fxml"));
		loader.setResources(ResourceBundle.getBundle("bundles.ApplicationResources"));
		Scene scene = new Scene(loader.load());
		StudentAddController controller = loader.getController();
		
		
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
		controller.bindings();
	} 

	@FXML
	public void deleteButtonOnAction() {}

	@FXML
	public void personalInfoButtonOnAction() throws IOException {

		Stage stage = new Stage();
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/other/PersonalInfo.fxml"));
		loader.setResources(ResourceBundle.getBundle("bundles.ApplicationResources"));
		Pane pane = loader.load();
		PersonalInfoController personalInfoController = (PersonalInfoController)loader.getController();
		if(this.personalInfoModel.getStudentFx() != null)
			personalInfoController.getPersonalInfoFromStudent(this.personalInfoModel.getStudentFx(), this.personalInfoModel.getPersonalInfoFx());
		else if(this.personalInfoModel.getTeacherFx() != null)
			personalInfoController.getPersonalInfoFromTeacher(this.personalInfoModel.getTeacherFx(), this.personalInfoModel.getPersonalInfoFx());
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
