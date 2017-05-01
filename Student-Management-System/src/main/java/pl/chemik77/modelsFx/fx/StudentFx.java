package pl.chemik77.modelsFx.fx;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import pl.chemik77.database.models.Division;
import pl.chemik77.database.models.Faculty;
import pl.chemik77.database.models.PersonalInfo;

public class StudentFx {

	private IntegerProperty studentID = new SimpleIntegerProperty();
	private StringProperty document = new SimpleStringProperty();
	private StringProperty first = new SimpleStringProperty();
	private StringProperty last = new SimpleStringProperty();
	private ObjectProperty<PersonalInfo> personalInfo = new SimpleObjectProperty<>();
	private ObjectProperty<Division> division = new SimpleObjectProperty<>();
	private ObjectProperty<Faculty> faculty = new SimpleObjectProperty<>();
	

	public String getDocument() {
		return document.get();
	}
	public StringProperty documentProperty() {
		return document;
	}
	public void setDocument(StringProperty document) {
		this.document = document;
	}
	public String getFirst() {
		return first.get();
	}
	public StringProperty firstProperty() {
		return first;
	}
	public void setFirst(String first) {
		this.first.set(first);;
	}
	public String getLast() {
		return last.get();
	}
	public StringProperty lastProperty() {
		return last;
	}
	public void setLast(String last) {
		this.last.set(last);
	}
	
	public final ObjectProperty<Division> divisionProperty() {
		return this.division;
	}
	
	public final Division getDivision() {
		return this.divisionProperty().get();
	}
	
	public final void setDivision(Division division) {
		this.divisionProperty().set(division);
	}
	
	public final ObjectProperty<Faculty> facultyProperty() {
		return this.faculty;
	}
	
	public final Faculty getFaculty() {
		return this.facultyProperty().get();
	}
	
	public final void setFaculty(Faculty faculty) {
		this.facultyProperty().set(faculty);
	}
	public IntegerProperty studentIDProperty() {
		return this.studentID;
	}
	
	public int getStudentID() {
		return this.studentIDProperty().get();
	}
	
	public void setStudentID(int studentID) {
		this.studentIDProperty().set(studentID);
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
