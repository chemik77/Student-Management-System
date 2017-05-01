package pl.chemik77.modelsFx.fx;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import pl.chemik77.database.models.Student;
import pl.chemik77.database.models.Subject;

public class StudentSubjectFx {
	
	private IntegerProperty studentSubjectID = new SimpleIntegerProperty();
	private ObjectProperty<Student> student = new SimpleObjectProperty<>();
	private ObjectProperty<Subject> subject = new SimpleObjectProperty<>();
	
	public IntegerProperty studentSubjectIDProperty() {
		return this.studentSubjectID;
	}
	
	public int getStudentSubjectID() {
		return this.studentSubjectIDProperty().get();
	}
	
	public void setStudentSubjectID(int studentSubjectID) {
		this.studentSubjectIDProperty().set(studentSubjectID);
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
	
	public ObjectProperty<Subject> subjectProperty() {
		return this.subject;
	}
	
	public Subject getSubject() {
		return this.subjectProperty().get();
	}
	
	public void setSubject(Subject subject) {
		this.subjectProperty().set(subject);
	}
	
	
}
