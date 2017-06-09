package pl.chemik77.controllers.other;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import pl.chemik77.modelsFx.fx.PersonalInfoFx;
import pl.chemik77.modelsFx.fx.StudentFx;
import pl.chemik77.modelsFx.fx.TeacherFx;

public class PersonalInfoController {
	
	@FXML 
	private Label lastNameLabel;
	@FXML 
	private Label firstNameLabel;
	@FXML 
	private Label peselLabel;
	@FXML 
	private Label sexLabel;
	@FXML 
	private Label birthLabel;
	@FXML 
	private Label phoneLabel;
	@FXML 
	private Label emailLabel;
	@FXML 
	private Label streetLabel;
	@FXML 
	private Label zipLabel;
	@FXML 
	private Label houseLabel;
	@FXML 
	private Label cityLabel;
	@FXML 
	private Button closeButton;
	@FXML
	private ImageView photoImageView;
	
	
	@FXML
	public void initialize() {
		this.photoImageView.setImage(new Image(this.getClass().getResource("/img/Add-Male-User.png").toString()));
	}
	

	@FXML public void closeButtonOnAction() {
		Stage stage = (Stage) this.closeButton.getScene().getWindow();
		stage.close();
	}

	public void getPersonalInfoFromStudent(StudentFx studentFx, PersonalInfoFx personalInfoFx) {
		
		this.lastNameLabel.setText(studentFx.getLastName());
		this.firstNameLabel.setText(studentFx.getFirstName());
		
		this.peselLabel.setText(personalInfoFx.getPesel());
		this.sexLabel.setText(personalInfoFx.getSex());
		this.birthLabel.setText(personalInfoFx.getBirth().toString());
		this.phoneLabel.setText(personalInfoFx.getPhone());
		this.emailLabel.setText(personalInfoFx.getEmail());
		this.streetLabel.setText(personalInfoFx.getStreet());
		this.zipLabel.setText(personalInfoFx.getZip());
		this.houseLabel.setText(personalInfoFx.getHouse());
		this.cityLabel.setText(personalInfoFx.getCity());
		this.photoImageView.setImage(new Image(this.getClass().getResource(personalInfoFx.getPhoto()).toString()));
	}


	public void getPersonalInfoFromTeacher(TeacherFx teacherFx, PersonalInfoFx personalInfoFx) {

		this.lastNameLabel.setText(teacherFx.getLastNameTeacher());
		this.firstNameLabel.setText(teacherFx.getFirstNameTeacher());
		
		this.peselLabel.setText(personalInfoFx.getPesel());
		this.sexLabel.setText(personalInfoFx.getSex());
		this.birthLabel.setText(personalInfoFx.getBirth().toString());
		this.phoneLabel.setText(personalInfoFx.getPhone());
		this.emailLabel.setText(personalInfoFx.getEmail());
		this.streetLabel.setText(personalInfoFx.getStreet());
		this.zipLabel.setText(personalInfoFx.getZip());
		this.houseLabel.setText(personalInfoFx.getHouse());
		this.cityLabel.setText(personalInfoFx.getCity());
		this.photoImageView.setImage(new Image(this.getClass().getResource(personalInfoFx.getPhoto()).toString()));
		
	}
}
