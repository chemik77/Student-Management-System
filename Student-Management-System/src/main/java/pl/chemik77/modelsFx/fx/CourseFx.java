package pl.chemik77.modelsFx.fx;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CourseFx {
	
	private IntegerProperty courseID = new SimpleIntegerProperty();
	private StringProperty nameCourse = new SimpleStringProperty();
	private StringProperty codeCourse = new SimpleStringProperty();
	
	private IntegerProperty ects = new SimpleIntegerProperty();
	private ObjectProperty<FacultyFx> facultyFx = new SimpleObjectProperty<>();
	private ObjectProperty<TeacherFx> teacherFx = new SimpleObjectProperty<>();
	

	public IntegerProperty courseIDProperty() {
		return this.courseID;
	}
	

	public int getCourseID() {
		return this.courseIDProperty().get();
	}
	

	public void setCourseID(final int courseID) {
		this.courseIDProperty().set(courseID);
	}
	

	public StringProperty codeCourseProperty() {
		return this.codeCourse;
	}
	

	public String getCodeCourse() {
		return this.codeCourseProperty().get();
	}
	

	public void setCodeCourse(final String codeCourse) {
		this.codeCourseProperty().set(codeCourse);
	}
	
	
	public StringProperty nameCourseProperty() {
		return this.nameCourse;
	}
	
	public String getNameCourse() {
		return this.nameCourseProperty().get();
	}
	
	public void setNameCourse(String nameCourse) {
		this.nameCourseProperty().set(nameCourse);
	}

	public IntegerProperty ectsProperty() {
		return this.ects;
	}
	
	public int getEcts() {
		return this.ectsProperty().get();
	}
	
	public void setEcts(int ects) {
		this.ectsProperty().set(ects);
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
