package pl.chemik77.modelsFx.fx;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class StudentFx {

	private IntegerProperty studentID = new SimpleIntegerProperty();
	private StringProperty document = new SimpleStringProperty();
	private StringProperty firstName = new SimpleStringProperty();
	private StringProperty lastName = new SimpleStringProperty();
	private ObjectProperty<PersonalInfoFx> personalInfoFx = new SimpleObjectProperty<>();
	private ObjectProperty<DivisionFx> divisionFx = new SimpleObjectProperty<>();
	private ObjectProperty<FacultyFx> facultyFx = new SimpleObjectProperty<>();
	
	
	public IntegerProperty studentIDProperty() {
		return this.studentID;
	}
	
	public int getStudentID() {
		return this.studentIDProperty().get();
	}
	
	public void setStudentID(int studentID) {
		this.studentIDProperty().set(studentID);
	}
	
	public StringProperty documentProperty() {
		return this.document;
	}
	
	public String getDocument() {
		return this.documentProperty().get();
	}
	
	public void setDocument(String document) {
		this.documentProperty().set(document);
	}
	
	public StringProperty firstNameProperty() {
		return this.firstName;
	}
	
	public String getFirstName() {
		return this.firstNameProperty().get();
	}
	
	public void setFirstName(String first) {
		this.firstNameProperty().set(first);
	}
	
	public StringProperty lastNameProperty() {
		return this.lastName;
	}
	
	public String getLastName() {
		return this.lastNameProperty().get();
	}
	
	public void setLastName(String last) {
		this.lastNameProperty().set(last);
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
	
	public ObjectProperty<FacultyFx> facultyFxProperty() {
		return this.facultyFx;
	}
	
	public FacultyFx getFacultyFx() {
		return this.facultyFxProperty().get();
	}
	
	public void setFacultyFx(FacultyFx facultyFx) {
		this.facultyFxProperty().set(facultyFx);
	}
	
	


	
}
