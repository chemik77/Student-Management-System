package pl.chemik77.modelsFx.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import pl.chemik77.modelsFx.fx.PersonalInfoFx;
import pl.chemik77.modelsFx.fx.StudentFx;

public class PersonalInfoModel {
	
	private ObjectProperty<StudentFx> studentFx = new SimpleObjectProperty<>();
	private ObjectProperty<PersonalInfoFx> personalInfoFx = new SimpleObjectProperty<>();
	
	
	public void setPersonalFromStudent() {
		if(this.getStudentFx() != null)
			this.setPersonalInfoFx(this.getStudentFx().getPersonalInfoFx());
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


	
	
}
