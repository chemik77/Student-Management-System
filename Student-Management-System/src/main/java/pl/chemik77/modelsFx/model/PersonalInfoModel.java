package pl.chemik77.modelsFx.model;

import java.io.IOException;
import java.util.ResourceBundle;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import pl.chemik77.controllers.other.PersonalInfoController;
import pl.chemik77.modelsFx.fx.PersonalInfoFx;
import pl.chemik77.modelsFx.fx.StudentFx;
import pl.chemik77.modelsFx.fx.TeacherFx;

public class PersonalInfoModel {
	
	private ObjectProperty<StudentFx> studentFx = new SimpleObjectProperty<>();
	private ObjectProperty<TeacherFx> teacherFx = new SimpleObjectProperty<>();
	private ObjectProperty<PersonalInfoFx> personalInfoFx = new SimpleObjectProperty<>();
	
	public PersonalInfoModel() {
	}
	
	public void init() {
		
		
	}
	
	public Pane connectController() {
		try {
			FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/other/PersonalInfo.fxml"));
			loader.setResources(ResourceBundle.getBundle("bundles.ApplicationResources"));
			Pane pane = loader.load();
			PersonalInfoController personalInfoController = (PersonalInfoController)loader.getController();
			if(this.getStudentFx() != null)
				personalInfoController.getPersonalInfoFromStudent(this.getStudentFx(), this.getPersonalInfoFx());
			else if(this.getTeacherFx() != null)
				personalInfoController.getPersonalInfoFromTeacher(this.getTeacherFx(), this.getPersonalInfoFx());
			return pane;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	
	public void setPersonalFromObject() {
		if(this.getStudentFx() != null)
			this.setPersonalInfoFx(this.getStudentFx().getPersonalInfoFx());
		else if(this.getTeacherFx() != null)
			this.setPersonalInfoFx(this.getTeacherFx().getPersonalInfoFx());
		
	}
	
	public ObjectProperty<StudentFx> studentFxProperty() {
		return this.studentFx;
	}
	
	public StudentFx getStudentFx() {
		return this.studentFxProperty().get();
	}
	
	public void setStudentFx(StudentFx studentFx) {
		this.studentFxProperty().set(studentFx);
	}
	
	public ObjectProperty<PersonalInfoFx> personalInfoFxProperty() {
		return this.personalInfoFx;
	}
	
	public PersonalInfoFx getPersonalInfoFx() {
		return this.personalInfoFxProperty().get();
	}
	
	public void setPersonalInfoFx(PersonalInfoFx personalInfoFx) {
		this.personalInfoFxProperty().set(personalInfoFx);
	}

	
	public ObjectProperty<TeacherFx> teacherFxProperty() {
		return this.teacherFx;
	}
	
	
	public TeacherFx getTeacherFx() {
		return this.teacherFxProperty().get();
	}
	
	
	public void setTeacherFx(TeacherFx teacherFx) {
		this.teacherFxProperty().set(teacherFx);
	}
	

	
}
