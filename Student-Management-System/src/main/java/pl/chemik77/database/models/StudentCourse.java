package pl.chemik77.database.models;

import com.j256.ormlite.field.DatabaseField;

public class StudentCourse implements BaseModel {
	
	@DatabaseField(generatedId = true)
	private int studentCourseID;
	
	@DatabaseField(columnName = "student_id", foreign = true)
	private Student student;
	
	@DatabaseField(columnName = "course_id", foreign = true)
	private Course course;
	
	@DatabaseField
	private double grade;


	public int getStudentCourseID() {
		return studentCourseID;
	}

	public void setStudentCourseID(int studentCourseID) {
		this.studentCourseID = studentCourseID;
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	
}
