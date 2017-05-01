package pl.chemik77.modelsFx.fx;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class DivisionFx {
	
	private IntegerProperty divisionID = new SimpleIntegerProperty();
	private StringProperty nameDivision = new SimpleStringProperty();
	
	public IntegerProperty idProperty() {
		return this.divisionID;
	}
	
	public int getId() {
		return this.idProperty().get();
	}
	
	public void setId(int id) {
		this.idProperty().set(id);
	}
	
	public StringProperty nameDivisionProperty() {
		return this.nameDivision;
	}
	
	public String getNameDivision() {
		return this.nameDivisionProperty().get();
	}
	
	public void setNameDivision(String nameDivision) {
		this.nameDivisionProperty().set(nameDivision);
	}
	
	
}
