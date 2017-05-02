package pl.chemik77.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import pl.chemik77.utils.FxmlUtils;
import javafx.event.Event;
import javafx.scene.control.Tab;

public class TopMenuTabController {

	@FXML Tab mainTab;
	@FXML Tab studentsTab;
	@FXML Tab coursesTab;
	@FXML Tab teachersTab;

	@FXML public void mainTabOnSelection(Event event) {
		Pane pane = FxmlUtils.getPane("/fxml/main/MainTab.fxml");
		this.mainTab.setContent(pane);
	}

	@FXML public void studentsTabOnSelection(Event event) {
		Pane pane = FxmlUtils.getPane("/fxml/student/StudentView.fxml");
		this.studentsTab.setContent(pane);
	}

	@FXML public void coursesTabOnSelection(Event event) {
		Pane pane = FxmlUtils.getPane("/fxml/course/CourseView.fxml");
		this.coursesTab.setContent(pane);
	}

	@FXML public void teachersTabOnSelection(Event event) {
		Pane pane = FxmlUtils.getPane("/fxml/teacher/TeacherView.fxml");
		this.teachersTab.setContent(pane);
	}

	
	
}
