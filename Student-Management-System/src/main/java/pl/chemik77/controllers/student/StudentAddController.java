package pl.chemik77.controllers.student;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import pl.chemik77.modelsFx.fx.DivisionFx;
import pl.chemik77.modelsFx.fx.FacultyFx;
import pl.chemik77.modelsFx.model.DivisionModel;
import pl.chemik77.modelsFx.model.FacultyModel;
import pl.chemik77.modelsFx.model.StudentModel;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ComboBox;

public class StudentAddController {

	@FXML 
	private TextField documentTextField;
	@FXML 
	private TextField firstNameTextField;
	@FXML 
	private TextField lastNameTextField;
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
	private ToggleGroup sexToggleGroup;
	@FXML 
	private RadioButton femaleRadioButton;
	@FXML 
	private RadioButton maleRadioButton;
	@FXML
	private TextField sexTextField;
	@FXML 
	private DatePicker birthDatePicker;
	@FXML 
	private ComboBox<DivisionFx> divisionComboBox;
	@FXML 
	private ComboBox<FacultyFx> facultyComboBox;
	
	private DivisionModel divisionModel;
	
	private FacultyModel facultyModel;
	
	private StudentModel studentModel;
	
	@FXML
	private void initialize() {
		this.divisionModel = new DivisionModel();
		this.facultyModel = new FacultyModel();
		this.studentModel = new StudentModel();
		this.divisionModel.init();
		this.facultyModel.init();
		this.divisionComboBox.setItems(this.divisionModel.getDivisionFxOL());
		this.facultyComboBox.setItems(this.facultyModel.getFacultyFxOL());
		
		this.studentModel.studentFxProperty().get().firstNameProperty().bind(this.firstNameTextField.textProperty());
		this.studentModel.studentFxProperty().get().lastNameProperty().bind(this.lastNameTextField.textProperty());
		this.studentModel.studentFxProperty().get().documentProperty().bind(this.documentTextField.textProperty());
		
		this.studentModel.personalInfoFxProperty().get().peselProperty().bind(this.peselTextField.textProperty());
		this.studentModel.personalInfoFxProperty().get().phoneProperty().bind(this.telephoneTextField.textProperty());
		this.studentModel.personalInfoFxProperty().get().emailProperty().bind(this.emailTextField.textProperty());
		this.studentModel.personalInfoFxProperty().get().streetProperty().bind(this.streetTextField.textProperty());
		this.studentModel.personalInfoFxProperty().get().zipProperty().bind(this.zipTextField.textProperty());
		this.studentModel.personalInfoFxProperty().get().cityProperty().bind(this.cityTextField.textProperty());
		this.studentModel.personalInfoFxProperty().get().houseProperty().bind(this.houseTextField.textProperty());
		this.studentModel.personalInfoFxProperty().get().photoProperty().bind(this.photoTextField.textProperty());
		this.studentModel.personalInfoFxProperty().get().sexProperty().bind(this.sexTextField.textProperty());
		this.studentModel.personalInfoFxProperty().get().birthProperty().bind(this.birthDatePicker.valueProperty());

		this.studentModel.divisionFxProperty().bind(this.divisionComboBox.valueProperty());
		this.studentModel.facultyFxProperty().bind(this.facultyComboBox.valueProperty());
		
	}
	
	
	@FXML 
	public void addButtonOnAction() {
		this.studentModel.addStudentToDatabase();
		Stage stage = (Stage) this.addButton.getScene().getWindow();
		stage.close();
	}
	
	@FXML 
	public void cancelButtonOnAction() {
		Stage stage = (Stage) this.cancelButton.getScene().getWindow();
		stage.close();
	}
	
	
}
