package pl.chemik77.database.models;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

public class Course implements BaseModel {
	
	@DatabaseField(generatedId = true)
	private int courseID;
	
	@DatabaseField(columnName = "course_name", unique = true)
	private String nameCourse;
	
	@DatabaseField(columnName = "course_code", unique = true)
	private String codeCourse;

	@DatabaseField
	private int ects;
	
	@DatabaseField(columnName = "faculty_id", foreign = true)
	private Faculty faculty;
	
	@DatabaseField(columnName = "teacher_id", foreign = true)
	private Teacher teacher;
	
	@ForeignCollectionField
	ForeignCollection<StudentCourse> students;
	

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getNameCourse() {
		return nameCourse;
	}

	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}

	public String getCodeCourse() {
		return codeCourse;
	}

	public void setCodeCourse(String codeCourse) {
		this.codeCourse = codeCourse;
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
