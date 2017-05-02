package pl.chemik77.modelsFx.fx;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import pl.chemik77.database.models.Faculty;
import pl.chemik77.database.models.Teacher;

public class CourseFx {
	
	private IntegerProperty courseID = new SimpleIntegerProperty();
	private StringProperty nameCourse = new SimpleStringProperty();
	private IntegerProperty grade = new SimpleIntegerProperty();
	private IntegerProperty ects = new SimpleIntegerProperty();
	private ObjectProperty<Faculty> faculty = new SimpleObjectProperty<>();
	private ObjectProperty<Teacher> teacher = new SimpleObjectProperty<>();
	
	public IntegerProperty idProperty() {
		return this.courseID;
	}
	
	public int getId() {
		return this.idProperty().get();
	}
	
	public void setId(int id) {
		this.idProperty().set(id);
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
	
	public IntegerProperty gradeProperty() {
		return this.grade;
	}
	
	public int getGrade() {
		return this.gradeProperty().get();
	}
	
	public void setGrade(int grade) {
		this.gradeProperty().set(grade);
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
	
	public ObjectProperty<Faculty> facultyProperty() {
		return this.faculty;
	}
	
	public Faculty getFaculty() {
		return this.facultyProperty().get();
	}
	
	public void setFaculty(Faculty faculty) {
		this.facultyProperty().set(faculty);
	}
	
	public ObjectProperty<Teacher> teacherProperty() {
		return this.teacher;
	}
	
	public Teacher getTeacher() {
		return this.teacherProperty().get();
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacherProperty().set(teacher);
	}
	
	
}