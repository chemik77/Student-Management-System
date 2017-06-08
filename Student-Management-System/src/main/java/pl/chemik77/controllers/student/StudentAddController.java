package pl.chemik77.controllers.student;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
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
		this.studentModel.init();
		

		//fill ComboBox with objects
		this.divisionComboBox.setItems(this.divisionModel.getDivisionFxOL());
		this.facultyComboBox.setItems(this.facultyModel.getFacultyFxOL());
		
		bindings();
		validation();
	}



	private void validation() {
		//all fileds must be fill with values to active addButton
		this.addButton.disableProperty().bind(this.firstNameTextField.textProperty().isEmpty()
				.or(this.lastNameTextField.textProperty().isEmpty())
				.or(this.documentTextField.textProperty().isEmpty())
				.or(this.peselTextField.textProperty().isEmpty())
				.or(this.telephoneTextField.textProperty().isEmpty())
				.or(this.emailTextField.textProperty().isEmpty())
				.or(this.streetTextField.textProperty().isEmpty())
				.or(this.zipTextField.textProperty().isEmpty())
				.or(this.cityTextField.textProperty().isEmpty())
				.or(this.houseTextField.textProperty().isEmpty())
				.or(this.photoTextField.textProperty().isEmpty())
				.or(this.birthDatePicker.valueProperty().isNull())
				.or(this.sexToggleGroup.selectedToggleProperty().isNull())
				.or(this.divisionComboBox.valueProperty().isNull())
				.or(this.facultyComboBox.valueProperty().isNull()));
	}



	public void bindings() {
		
		//bind textFields with object in model
		this.firstNameTextField.textProperty().bindBidirectional(this.studentModel.studentFxProperty().get().firstNameProperty());
		this.lastNameTextField.textProperty().bindBidirectional(this.studentModel.studentFxProperty().get().lastNameProperty());
		this.documentTextField.textProperty().bindBidirectional(this.studentModel.studentFxProperty().get().documentProperty());
		
		this.peselTextField.textProperty().bindBidirectional(this.studentModel.personalInfoFxProperty().get().peselProperty());
		this.telephoneTextField.textProperty().bindBidirectional(this.studentModel.personalInfoFxProperty().get().phoneProperty());
		this.emailTextField.textProperty().bindBidirectional(this.studentModel.personalInfoFxProperty().get().emailProperty());
		this.streetTextField.textProperty().bindBidirectional(this.studentModel.personalInfoFxProperty().get().streetProperty());
		this.zipTextField.textProperty().bindBidirectional(this.studentModel.personalInfoFxProperty().get().zipProperty());
		this.cityTextField.textProperty().bindBidirectional(this.studentModel.personalInfoFxProperty().get().cityProperty());
		this.houseTextField.textProperty().bindBidirectional(this.studentModel.personalInfoFxProperty().get().houseProperty());
		this.photoTextField.textProperty().bindBidirectional(this.studentModel.personalInfoFxProperty().get().photoProperty());
		this.birthDatePicker.valueProperty().bindBidirectional(this.studentModel.personalInfoFxProperty().get().birthProperty());	
		this.sexToggleGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
			setSex(newValue);
		});
		
		//bind ComboBox with object in model
		this.studentModel.divisionFxProperty().bind(this.divisionComboBox.valueProperty());
		this.studentModel.facultyFxProperty().bind(this.facultyComboBox.valueProperty());
	}

	
	@FXML 
	public void addButtonOnAction() {
		this.studentModel.addStudentToDatabase();
		clearFields();
		
	}
	

	@FXML 
	public void cancelButtonOnAction() {
		Stage stage = (Stage) this.cancelButton.getScene().getWindow();
		stage.close();
	}
	

	private void setSex(Toggle newValue) {
		if(newValue.equals(femaleRadioButton))
			this.studentModel.personalInfoFxProperty().get().sexProperty().set("F");
		else if(newValue.equals(maleRadioButton))
			this.studentModel.personalInfoFxProperty().get().sexProperty().set("M");
	}


	private void clearFields() {
		this.firstNameTextField.clear();
		this.lastNameTextField.clear();
		this.documentTextField.clear();
		this.peselTextField.clear();
		this.telephoneTextField.clear();
		this.emailTextField.clear();
		this.streetTextField.clear();
		this.zipTextField.clear();
		this.cityTextField.clear();
		this.houseTextField.clear();
		this.photoTextField.clear();
		this.divisionComboBox.getSelectionModel().clearSelection();
		this.facultyComboBox.getSelectionModel().clearSelection();
		this.birthDatePicker.getEditor().clear();
		this.sexToggleGroup.selectToggle(null);
	}


	
	public StudentModel getStudentModel() {
		return studentModel;
	}



	
	public void setStudentModel(StudentModel studentModel) {
		this.studentModel = studentModel;
	}
	
}
