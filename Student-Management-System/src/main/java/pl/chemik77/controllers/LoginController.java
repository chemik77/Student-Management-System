package pl.chemik77.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import pl.chemik77.utils.FxmlUtils;

public class LoginController {
	
	@FXML
	private TextField userTextField;
	
	@FXML
	private PasswordField passwordField;
	
	@FXML
	private Button loginButton;
	
	public void initialize() {
		
	}
	
	@FXML
	public void loginButtonOnAction(ActionEvent event) {
		
		logIn(event);
		
	}

	private void logIn(ActionEvent event) {
		
		Pane root = null;
		FxmlUtils.loadStage(root, "/fxml/MainWindow.fxml", "main.title");
		FxmlUtils.hidePreviousWindow(event);
		
	}
	
	
}
