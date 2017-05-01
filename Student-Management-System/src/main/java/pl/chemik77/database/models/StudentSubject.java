package pl.chemik77.database.models;

import com.j256.ormlite.field.DatabaseField;

public class StudentSubject implements BaseModel {
	
	@DatabaseField(generatedId = true)
	private int studentSubjectID;
	
	@DatabaseField(columnName = "student_id", foreign = true)
	private Student student;
	
	@DatabaseField(columnName = "subject_id", foreign = true)
	private Subject subject;

	public int getId() {
		return studentSubjectID;
	}

	public void setId(int id) {
		this.studentSubjectID = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	
}
