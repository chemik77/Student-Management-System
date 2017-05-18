package pl.chemik77.controllers.other;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import pl.chemik77.modelsFx.fx.StudentFx;
import pl.chemik77.modelsFx.model.PersonalInfoModel;
import pl.chemik77.modelsFx.model.StudentModel;
import pl.chemik77.modelsFx.model.TeacherModel;
import javafx.scene.control.Button;

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
	//private TeacherModel teacherModel;
	
	
	@FXML
	public void initialize() {
		this.personalInfoModel = new PersonalInfoModel();
		//this.lastNameLabel.textProperty().bind(this.personalInfoModel.getStudentFx().lastNameProperty());
		
	}


	@FXML public void closeButtonOnAction() {
		Stage stage = (Stage) this.closeButton.getScene().getWindow();
		stage.close();
	}


	
	
}
