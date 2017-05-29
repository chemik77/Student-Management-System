package pl.chemik77.controllers.teacher;

import java.io.IOException;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import pl.chemik77.modelsFx.fx.CourseFx;
import pl.chemik77.modelsFx.fx.DivisionFx;
import pl.chemik77.modelsFx.fx.TeacherFx;
import pl.chemik77.modelsFx.model.CourseModel;
import pl.chemik77.modelsFx.model.PersonalInfoModel;
import pl.chemik77.modelsFx.model.TeacherModel;
import pl.chemik77.utils.FxmlUtils;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class TeacherViewController {

	@FXML 
	private TextField teacherTextField;
	@FXML 
	private Label divisionLabel;
	@FXML 
	private TableView<TeacherFx> teacherTableView;
	@FXML 
	private TableColumn<TeacherFx, String> teacherNameColumn;
	@FXML 
	private TableColumn<TeacherFx, DivisionFx> divisionColumn;
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
	
	private TeacherModel teacherModel;

	private PersonalInfoModel personalInfoModel;

	private SortedList<TeacherFx> sortedList;
	
	@FXML
	public void initialize() {
		this.teacherModel = new TeacherModel();
		this.personalInfoModel = new PersonalInfoModel();
		this.teacherModel.init();
		//initialize columns
		this.teacherNameColumn.setCellValueFactory(cd-> cd.getValue().fullNameTeacherProperty());
		this.divisionColumn.setCellValueFactory(cd-> cd.getValue().divisionFxProperty());
		//filter data with textField
		this.sortedList = new SortedList<>(this.teacherModel.getFilteredList());
		this.teacherTextField.textProperty().addListener((observable, oldValue, newValue) -> {
			this.teacherModel.filterTeacherWithTextField(newValue);
		});
		this.sortedList.comparatorProperty().bind(this.teacherTableView.comparatorProperty());
		this.teacherTableView.setItems(this.sortedList);
		//disable buttons when object in model is null
		this.personalInfoButton.disableProperty().bind(this.personalInfoModel.personalInfoFxProperty().isNull());
		this.coursesButton.disableProperty().bind(this.teacherModel.teacherFxProperty().isNull());
		//select object from table to more info
		this.teacherTableView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
			this.personalInfoModel.setTeacherFx(newValue);
			this.personalInfoModel.setPersonalFromObject();
			this.teacherModel.setTeacherFx(newValue);
			this.changeDivisionLabel();
		});
		

		
	}
	

	@FXML 
	public void addButtonOnAction() {
		BorderPane borderPane = null;
		borderPane = (BorderPane) FxmlUtils.getPane("/fxml/teacher/TeacherAdd.fxml");
		Scene scene = new Scene(borderPane);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
	}
	@FXML 
	public void editButtonOnAction() {}
	@FXML 
	public void deleteButtonOnAction() {}

	@FXML
	public void personalInfoButtonOnAction() {
		
		Stage stage = new Stage();
		Pane pane = this.personalInfoModel.connectController();
		Scene scene = new Scene(pane);
		
		stage.setScene(scene);
		stage.show();
	}
	@FXML
	public void coursesButtonOnAction() throws IOException {
		
		this.teacherModel.filterTeacherCourseList();
		Stage stage = new Stage();
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/teacher/TeacherCourses.fxml"));
		loader.setResources(ResourceBundle.getBundle("bundles.ApplicationResources"));
		Pane pane = loader.load();
		TeacherCoursesController teacherCoursesController = (TeacherCoursesController)loader.getController();
		teacherCoursesController.getCourses(this.teacherModel.getTeacherFx(), this.teacherModel.getTeacherCoursesFxOL());
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void teacherTextFieldKeyTyped() {
	}
	
	public void changeDivisionLabel() {
		this.divisionLabel.setText(this.teacherModel.getTeacherFx().getDivisionFx().getNameDivision());
	}

	

	
}
