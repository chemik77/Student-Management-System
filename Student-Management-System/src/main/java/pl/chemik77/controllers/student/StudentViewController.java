package pl.chemik77.controllers.student;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import pl.chemik77.modelsFx.fx.DivisionFx;
import pl.chemik77.modelsFx.fx.FacultyFx;
import pl.chemik77.modelsFx.fx.StudentFx;
import pl.chemik77.modelsFx.model.PersonalInfoModel;
import pl.chemik77.modelsFx.model.StudentModel;
import pl.chemik77.utils.FxmlUtils;

public class StudentViewController {

	@FXML
	private TextField lastTextField;
	@FXML
	private TextField documentTextField;
	@FXML
	private TextField peselTextField;
	@FXML
	private TableView<StudentFx> studentTableView;
	@FXML
	private TableColumn<StudentFx, String> lastColumn;
	@FXML
	private TableColumn<StudentFx, String> firstColumn;
	@FXML
	private TableColumn<StudentFx, String> documentColumn;
	@FXML
	private TableColumn<StudentFx, FacultyFx> facultyColumn;
	@FXML
	private TableColumn<StudentFx, DivisionFx> divisionColumn;
	@FXML
	private Button addButton;
	@FXML
	private Button editButton;
	@FXML
	private Button deleteButton;
	@FXML
	private Button personalInfoButton;
	@FXML
	private Button coursesButton;

	private StudentModel studentModel;

	private PersonalInfoModel personalInfoModel;


	@FXML
	public void initialize() {
		this.studentModel = new StudentModel();
		this.personalInfoModel = new PersonalInfoModel();

		this.studentModel.init();

		this.studentTableView.setItems(this.studentModel.getStudentFxOL());
		this.lastColumn.setCellValueFactory(cd -> cd.getValue().lastNameProperty());
		this.firstColumn.setCellValueFactory(cd -> cd.getValue().firstNameProperty());
		this.documentColumn.setCellValueFactory(cd -> cd.getValue().documentProperty());
		this.facultyColumn.setCellValueFactory(cd -> cd.getValue().facultyFxProperty());
		this.divisionColumn.setCellValueFactory(cd -> cd.getValue().divisionFxProperty());

		// this.studentTableView.getSelectionModel().selectedItemProperty().addListener((observable,
		// oldValue, newValue) -> {
		// this.studentModel.setStudentFx(newValue);
		// });

		this.personalInfoButton.disableProperty().bind(this.personalInfoModel.studentFxProperty().isNull());
		this.studentTableView.getSelectionModel().selectedItemProperty()
				.addListener((observable, oldValue, newValue) -> {
					this.personalInfoModel.setStudentFx(newValue);
				});

	}

	@FXML
	public void addButtonOnAction() {

		BorderPane borderPane = null;
		borderPane = (BorderPane) FxmlUtils.getPane("/fxml/student/StudentAdd.fxml");
		Scene scene = new Scene(borderPane);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();

	}

	@FXML
	public void editButtonOnAction() {
	}

	@FXML
	public void deleteButtonOnAction() {
	}

	@FXML
	public void personalInfoButtonOnAction() {

		StackPane stackPane = null;
		stackPane = (StackPane) FxmlUtils.getPane("/fxml/other/PersonalInfo.fxml");
		Scene scene = new Scene(stackPane);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();

	}

	@FXML
	public void coursesButtonOnAction() {
	}
}
