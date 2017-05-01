package pl.chemik77.modelsFx.fx;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import pl.chemik77.database.models.Division;

public class FacultyFx {
	
	private IntegerProperty facultyID = new SimpleIntegerProperty();
	private StringProperty nameFaculty = new SimpleStringProperty();
	private ObjectProperty<Division> division = new SimpleObjectProperty<>();
	

	public StringProperty nameFacultyProperty() {
		return this.nameFaculty;
	}
	
	public String getNameFaculty() {
		return this.nameFacultyProperty().get();
	}
	
	public void setNameFaculty(String nameFaculty) {
		this.nameFacultyProperty().set(nameFaculty);
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

	public IntegerProperty facultyIDProperty() {
		return this.facultyID;
	}
	

	public int getFacultyID() {
		return this.facultyIDProperty().get();
	}
	

	public void setFacultyID(int facultyID) {
		this.facultyIDProperty().set(facultyID);
	}
	
	
	
	
	
}
