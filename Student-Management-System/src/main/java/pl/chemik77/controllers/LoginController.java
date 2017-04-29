package pl.chemik77.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
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
		
		Pane root = null;
		root = (Pane) FxmlUtils.getPane("/fxml/Menu.fxml");
		Stage stage = new Stage();
		stage.setTitle("Menu");
		stage.setScene(new Scene(root));
		stage.show();
		
		((Node) event.getSource()).getScene().getWindow().hide();
	}
}
