package pl.chemik77.modelsFx.fx;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TeacherFx {
	
	private IntegerProperty teacherID = new SimpleIntegerProperty();
	private StringProperty lastNameTeacher = new SimpleStringProperty();
	private StringProperty firstNameTeacher = new SimpleStringProperty();
	private StringProperty degree = new SimpleStringProperty();
	private ObjectProperty<PersonalInfoFx> personalInfoFx = new SimpleObjectProperty<>();
	private ObjectProperty<DivisionFx> divisionFx = new SimpleObjectProperty<>();
	

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


	public ObjectProperty<PersonalInfoFx> personalInfoFxProperty() {
		return this.personalInfoFx;
	}
	


	public PersonalInfoFx getPersonalInfoFx() {
		return this.personalInfoFxProperty().get();
	}
	


	public void setPersonalInfoFx(PersonalInfoFx personalInfoFx) {
		this.personalInfoFxProperty().set(personalInfoFx);
	}
	


	public ObjectProperty<DivisionFx> divisionFxProperty() {
		return this.divisionFx;
	}
	


	public DivisionFx getDivisionFx() {
		return this.divisionFxProperty().get();
	}
	


	public void setDivisionFx(DivisionFx divisionFx) {
		this.divisionFxProperty().set(divisionFx);
	}
	
	
	public String toString() {
		return (this.degree.get() + " " + this.lastNameTeacher.get() + " " + this.firstNameTeacher.get());
	}
	
}
