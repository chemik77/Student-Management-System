package pl.chemik77.controllers.other;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import pl.chemik77.modelsFx.fx.StudentFx;
import pl.chemik77.modelsFx.model.PersonalInfoModel;

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
	
	private PersonalInfoModel personalInfoModel;
	
	
	@FXML
	public void initialize() {
		this.personalInfoModel = new PersonalInfoModel();
		
		//this.emailLabel.textProperty().bind(this.personalInfoModel.getPersonalInfoFx().emailProperty());
		
	}


	@FXML public void closeButtonOnAction() {
		Stage stage = (Stage) this.closeButton.getScene().getWindow();
		stage.close();
	}

	public void getPersonalInfo(StudentFx studentFx) {
		this.emailLabel.setText(studentFx.getLastName());
	}
}
