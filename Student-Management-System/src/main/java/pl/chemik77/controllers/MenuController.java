package pl.chemik77.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class MenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnEmployee;

    @FXML
    private Button btnCandidate;

    @FXML
    private Button btnStudent;
    
    private MainController mainController;

    @FXML
    void openCandidate() {
    	FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/LoginScreen.fxml"));
    	GridPane gridPane = null;
    	try {
    		
			gridPane = loader.load();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    	mainController.setScreen(gridPane);
    }

    @FXML
    void openStudent() {
    	FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/LoginScreen.fxml"));
    	GridPane gridPane = null;
    	try {
    		
			gridPane = loader.load();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    	mainController.setScreen(gridPane);
    }

    @FXML
    void openEmployee() {
    	FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/LoginScreen.fxml"));
    	GridPane gridPane = null;
    	try {
    		
			gridPane = loader.load();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    	mainController.setScreen(gridPane);
    }

    @FXML
    void initialize() {
        assert btnEmployee != null : "fx:id=\"btnEmployee\" was not injected: check your FXML file 'MenuScreen.fxml'.";
        assert btnCandidate != null : "fx:id=\"btnCandidate\" was not injected: check your FXML file 'MenuScreen.fxml'.";
        assert btnStudent != null : "fx:id=\"btnStudent\" was not injected: check your FXML file 'MenuScreen.fxml'.";

    }


	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}

    
    
}
