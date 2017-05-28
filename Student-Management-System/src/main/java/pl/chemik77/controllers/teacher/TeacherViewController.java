package pl.chemik77.controllers.teacher;

import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import pl.chemik77.modelsFx.fx.CourseFx;
import pl.chemik77.modelsFx.fx.DivisionFx;
import pl.chemik77.modelsFx.fx.TeacherFx;
import pl.chemik77.modelsFx.model.CourseModel;
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

	
	
	@FXML
	public void initialize() {
		this.teacherModel = new TeacherModel();
		this.teacherModel.init();
		
		this.teacherTableView.setItems(this.teacherModel.getTeacherFxOL());
		this.teacherNameColumn.setCellValueFactory(cd-> cd.getValue().fullNameTeacherProperty());
		this.divisionColumn.setCellValueFactory(cd-> cd.getValue().divisionFxProperty());
		
		//nasłuchiwanie zaznaczonego elem w TableView i wysyłanie do model
		this.teacherTableView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
			this.teacherModel.setTeacherFx(newValue);
			this.changeDivisionLabel();
		});
		
		this.teacherTextField.textProperty().addListener((observable, oldValue, newValue) -> {
			this.teacherModel.setNameTextField(newValue);
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
		StackPane stackPane = null;
		stackPane = (StackPane) FxmlUtils.getPane("/fxml/other/PersonalInfo.fxml");
		Scene scene = new Scene(stackPane);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
	}
	@FXML
	public void coursesButtonOnAction() {
		
	}
	
	@FXML
	public void teacherTextFieldKeyTyped() {
		this.teacherModel.filterTeachersList();
	}
	
	public void changeDivisionLabel() {
		this.divisionLabel.setText(this.teacherModel.getTeacherFx().getDivisionFx().getNameDivision());
	}



	
}
