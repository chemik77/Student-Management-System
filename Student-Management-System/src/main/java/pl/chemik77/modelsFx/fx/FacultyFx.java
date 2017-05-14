package pl.chemik77.modelsFx.fx;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class FacultyFx {
	
	private IntegerProperty facultyID = new SimpleIntegerProperty();
	private StringProperty nameFaculty = new SimpleStringProperty();
	private ObjectProperty<DivisionFx> divisionFx = new SimpleObjectProperty<>();
	

	public StringProperty nameFacultyProperty() {
		return this.nameFaculty;
	}
	
	public String getNameFaculty() {
		return this.nameFacultyProperty().get();
	}
	
	public void setNameFaculty(String nameFaculty) {
		this.nameFacultyProperty().set(nameFaculty);
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

	public ObjectProperty<DivisionFx> divisionFxProperty() {
		return this.divisionFx;
	}
	

	public DivisionFx getDivisionFx() {
		return this.divisionFxProperty().get();
	}
	

	public void setDivisionFx(DivisionFx divisionFx) {
		this.divisionFxProperty().set(divisionFx);
	}
	
	
	
	
	
	
}
