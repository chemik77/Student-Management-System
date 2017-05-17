package pl.chemik77.controllers.other;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;
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
	
	private StudentModel studentModel;
	//private TeacherModel teacherModel;
	
	public void initialize() {
		this.studentModel = new StudentModel();
	}


	@FXML public void closeButtonOnAction() {
		Stage stage = (Stage) this.closeButton.getScene().getWindow();
		stage.close();
	}
	
}
