package pl.chemik77.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import pl.chemik77.utils.FxmlUtils;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class ListOfStudentsController {

	@FXML ComboBox<String> searchComboBox;
	@FXML TextField searchTextField;
	@FXML Button searchButton;
	@FXML Button backButton;
	@FXML public void searchButtonOnAction() {}
	
	public void initialize() {
		
	}

	@FXML 
	public void backButtonOnAction(ActionEvent event) {
		Pane root = null;
		FxmlUtils.loadStage(root, "/fxml/Menu.fxml", "menu.studentInformation");
		FxmlUtils.hidePreviousWindow(event);
	}
	
}
