package pl.chemik77.modelsFx.fx;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import pl.chemik77.database.models.Division;
import pl.chemik77.database.models.PersonalInfo;

public class TeacherFx {
	
	private IntegerProperty teacherID = new SimpleIntegerProperty();
	private StringProperty nameTeacher = new SimpleStringProperty();
	private ObjectProperty<PersonalInfo> personalInfo = new SimpleObjectProperty<>();
	private ObjectProperty<Division> division = new SimpleObjectProperty<>();
	

	public IntegerProperty teacherIDProperty() {
		return this.teacherID;
	}
	

	public int getTeacherID() {
		return this.teacherIDProperty().get();
	}
	

	public void setTeacherID(final int teacherID) {
		this.teacherIDProperty().set(teacherID);
	}
	
	
	public StringProperty nameTeacherProperty() {
		return this.nameTeacher;
	}
	
	public String getNameTeacher() {
		return this.nameTeacherProperty().get();
	}
	
	public void setNameTeacher(String nameTeacher) {
		this.nameTeacherProperty().set(nameTeacher);
	}

	public ObjectProperty<Division> divisionProperty() {
		return this.division;
	}
	
	public Division getDivision() {
		return this.divisionProperty().get();
	}
	
	public void setDivision(Division division) {
		this.divisionProperty().set(division);
	}


	public ObjectProperty<PersonalInfo> personalInfoProperty() {
		return this.personalInfo;
	}
	

	public PersonalInfo getPersonalInfo() {
		return this.personalInfoProperty().get();
	}
	

	public void setPersonalInfo(final PersonalInfo personalInfo) {
		this.personalInfoProperty().set(personalInfo);
	}
	
	
	
}
