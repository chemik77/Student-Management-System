package pl.chemik77.controllers.teacher;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import pl.chemik77.modelsFx.fx.DivisionFx;
import pl.chemik77.modelsFx.model.DivisionModel;
import pl.chemik77.modelsFx.model.TeacherModel;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ComboBox;

public class TeacherAddController {

	@FXML 
	private TextField lastNameTextField;
	@FXML 
	private TextField firstNameTextField;
	@FXML 
	private TextField degreeTextField;
	@FXML 
	private TextField peselTextField;
	@FXML 
	private TextField telephoneTextField;
	@FXML 
	private TextField emailTextField;
	@FXML 
	private TextField streetTextField;
	@FXML 
	private TextField zipTextField;
	@FXML 
	private TextField cityTextField;
	@FXML 
	private TextField houseTextField;
	@FXML 
	private ImageView photoImageView;
	@FXML 
	private TextField photoTextField;
	@FXML 
	private Button cancelButton;
	@FXML 
	private Button addButton;
	@FXML 
	private RadioButton maleRadioButton;
	@FXML 
	private ToggleGroup sexToggleGroup;
	@FXML 
	private RadioButton femaleRadioButton;
	@FXML 
	private DatePicker birthDatePicker;
	@FXML 
	private ComboBox<DivisionFx> divisionComboBox;
	@FXML 
	private TextField sexTextField;
	
	private DivisionModel divisionModel;
	
	private TeacherModel teacherModel;
	
	@FXML
	private void initialize() {
		this.divisionModel = new DivisionModel();
		this.teacherModel = new TeacherModel();
		this.divisionModel.init();
		this.divisionComboBox.setItems(this.divisionModel.getDivisionFxOL());
		
		this.teacherModel.teacherFxProperty().get().lastNameTeacherProperty().bind(this.lastNameTextField.textProperty());
		this.teacherModel.teacherFxProperty().get().firstNameTeacherProperty().bind(this.firstNameTextField.textProperty());
		this.teacherModel.teacherFxProperty().get().degreeProperty().bind(this.degreeTextField.textProperty());
		
		this.teacherModel.personalInfoFxProperty().get().peselProperty().bind(this.peselTextField.textProperty());
		this.teacherModel.personalInfoFxProperty().get().phoneProperty().bind(this.telephoneTextField.textProperty());
		this.teacherModel.personalInfoFxProperty().get().emailProperty().bind(this.emailTextField.textProperty());
		this.teacherModel.personalInfoFxProperty().get().streetProperty().bind(this.streetTextField.textProperty());
		this.teacherModel.personalInfoFxProperty().get().zipProperty().bind(this.zipTextField.textProperty());
		this.teacherModel.personalInfoFxProperty().get().cityProperty().bind(this.cityTextField.textProperty());
		this.teacherModel.personalInfoFxProperty().get().houseProperty().bind(this.houseTextField.textProperty());
		this.teacherModel.personalInfoFxProperty().get().photoProperty().bind(this.photoTextField.textProperty());
		this.teacherModel.personalInfoFxProperty().get().sexProperty().bind(this.sexTextField.textProperty());
		this.teacherModel.personalInfoFxProperty().get().birthProperty().bind(this.birthDatePicker.valueProperty());

		this.teacherModel.divisionFxProperty().bind(this.divisionComboBox.valueProperty());	
	}
	
	
	
	@FXML 
	public void addButtonOnAction() {
		this.teacherModel.addTeacherToDatabase();
		Stage stage = (Stage) this.addButton.getScene().getWindow();
		stage.close();
	}
	
	@FXML 
	public void cancelButtonOnAction() {
		Stage stage = (Stage) this.cancelButton.getScene().getWindow();
		stage.close();
	}
	
}
