package pl.chemik77.modelsFx.fx;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import pl.chemik77.database.models.Student;
import pl.chemik77.database.models.Course;

public class StudentCourseFx {
	
	private IntegerProperty studentCourseID = new SimpleIntegerProperty();
	private ObjectProperty<Student> student = new SimpleObjectProperty<>();
	private ObjectProperty<Course> course = new SimpleObjectProperty<>();
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
	
	public ObjectProperty<Student> studentProperty() {
		return this.student;
	}
	
	public Student getStudent() {
		return this.studentProperty().get();
	}
	
	public void setStudent(Student student) {
		this.studentProperty().set(student);
	}
	
	public ObjectProperty<Course> courseProperty() {
		return this.course;
	}
	
	public Course getCourse() {
		return this.courseProperty().get();
	}
	
	public void setCourse(Course course) {
		this.courseProperty().set(course);
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
	
}
