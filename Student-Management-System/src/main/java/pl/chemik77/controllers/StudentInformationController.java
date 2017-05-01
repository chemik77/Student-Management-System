package pl.chemik77.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import pl.chemik77.utils.FxmlUtils;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.DatePicker;

public class StudentInformationController {

	@FXML TextField documentTextField;
	@FXML TextField firstNameTextField;
	@FXML TextField lastNameTextField;
	@FXML TextField peselTextField;
	@FXML TextField telephoneTextField;
	@FXML TextField emailTextField;
	@FXML TextField streetTextField;
	@FXML TextField zipTextField;
	@FXML TextField cityTextField;
	@FXML TextField houseTextField;
	@FXML ImageView photoImageView;
	@FXML Button photoButton;
	@FXML RadioButton maleRadioButton;
	@FXML ToggleGroup sexToggleGroup;
	@FXML RadioButton femaleRadioButton;
	@FXML DatePicker birthDatePicker;
	@FXML Button backButton;
	@FXML Button addButton;
	@FXML Button editButton;
	@FXML Button deleteButton;
	@FXML public void photoOnAction() {}
	
	@FXML public void addButtonOnAction() {}
	@FXML public void editButtonOnAction() {}
	@FXML public void deleteButtonOnAction() {}
	
	public void initialize() {
		
	}
	
	@FXML 
	public void backButtonOnAction(ActionEvent event) {
		Pane root = null;
		FxmlUtils.loadStage(root, "/fxml/Menu.fxml", "menu.studentInformation");
		FxmlUtils.hidePreviousWindow(event);
		
	}
	
}
