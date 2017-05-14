package pl.chemik77.modelsFx.fx;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;

public class StudentCourseFx {
	
	private IntegerProperty studentCourseID = new SimpleIntegerProperty();
	private ObjectProperty<StudentFx> studentFx = new SimpleObjectProperty<>();
	private ObjectProperty<CourseFx> courseFx = new SimpleObjectProperty<>();
	private DoubleProperty grade = new SimpleDoubleProperty();
	
	public IntegerProperty studentCourseIDProperty() {
		return this.studentCourseID;
	}
	
	public int getStudentCourseID() {
		return this.studentCourseIDProperty().get();
	}
	
	public void setStudentCourseID(int studentCourseID) {
		this.studentCourseIDProperty().set(studentCourseID);
	}
	
	
	public DoubleProperty gradeProperty() {
		return this.grade;
	}
	
	public double getGrade() {
		return this.gradeProperty().get();
	}
	
	public void setGrade(double grade) {
		this.gradeProperty().set(grade);
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
	

	public ObjectProperty<CourseFx> courseFxProperty() {
		return this.courseFx;
	}
	

	public CourseFx getCourseFx() {
		return this.courseFxProperty().get();
	}
	

	public void setCourseFx(CourseFx courseFx) {
		this.courseFxProperty().set(courseFx);
	}
	
	
}
