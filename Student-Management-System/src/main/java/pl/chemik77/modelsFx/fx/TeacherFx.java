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
	private StringProperty lastNameTeacher = new SimpleStringProperty();
	private StringProperty firstNameTeacher = new SimpleStringProperty();
	private StringProperty degree = new SimpleStringProperty();
	private ObjectProperty<PersonalInfo> personalInfo = new SimpleObjectProperty<>();
	private ObjectProperty<Division> division = new SimpleObjectProperty<>();
	

	public IntegerProperty teacherIDProperty() {
		return this.teacherID;
	}
	

	public int getTeacherID() {
		return this.teacherIDProperty().get();
	}
	

	public void setTeacherID(int teacherID) {
		this.teacherIDProperty().set(teacherID);
	}
	

	public StringProperty lastNameTeacherProperty() {
		return this.lastNameTeacher;
	}
	


	public String getLastNameTeacher() {
		return this.lastNameTeacherProperty().get();
	}
	


	public void setLastNameTeacher(String lastNameTeacher) {
		this.lastNameTeacherProperty().set(lastNameTeacher);
	}
	


	public StringProperty firstNameTeacherProperty() {
		return this.firstNameTeacher;
	}
	


	public String getFirstNameTeacher() {
		return this.firstNameTeacherProperty().get();
	}
	


	public void setFirstNameTeacher(String firstNameTeacher) {
		this.firstNameTeacherProperty().set(firstNameTeacher);
	}
	


	public StringProperty degreeProperty() {
		return this.degree;
	}
	


	public String getDegree() {
		return this.degreeProperty().get();
	}
	


	public void setDegree(String degree) {
		this.degreeProperty().set(degree);
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
	

	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfoProperty().set(personalInfo);
	}

	
}
