package pl.chemik77.database.models;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

public class Course implements BaseModel {
	
	@DatabaseField(generatedId = true)
	private int courseID;
	
	@DatabaseField(columnName = "course_name", unique = true)
	private String nameCourse;

	@DatabaseField
	private int grade;
	
	@DatabaseField
	private int ects;
	
	@DatabaseField(columnName = "faculty_id", foreign = true)
	private Faculty faculty;
	
	@DatabaseField(columnName = "teacher_id", foreign = true)
	private Teacher teacher;
	
	@ForeignCollectionField
	ForeignCollection<StudentCourse> students;
	

	public int getId() {
		return courseID;
	}

	public void setId(int id) {
		this.courseID = id;
	}

	public String getNamecourse() {
		return nameCourse;
	}

	public void setNamecourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getEcts() {
		return ects;
	}

	public void setEcts(int ects) {
		this.ects = ects;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public ForeignCollection<StudentCourse> getStudents() {
		return students;
	}

	public void setStudents(ForeignCollection<StudentCourse> students) {
		this.students = students;
	}
	
}
