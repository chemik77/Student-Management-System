package pl.chemik77.controllers.other;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import pl.chemik77.modelsFx.fx.PersonalInfoFx;
import pl.chemik77.modelsFx.fx.StudentFx;
import pl.chemik77.modelsFx.fx.TeacherFx;

public class PersonalInfoController {
	
	@FXML Label lastNameLabel;
	@FXML Label firstNameLabel;
	@FXML Label peselLabel;
	@FXML Label sexLabel;
	@FXML Label birthLabel;
	@FXML Label phoneLabel;
	@FXML Label emailLabel;
	@FXML Label streetLabel;
	@FXML Label zipLabel;
	@FXML Label houseLabel;
	@FXML Label cityLabel;
	@FXML Button closeButton;
	
	
	
	@FXML
	public void initialize() {
		
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
		
		
	}
}
