package pl.chemik77.database.models;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

public class Subject implements BaseModel {
	
	@DatabaseField(generatedId = true)
	private int subjectID;
	
	@DatabaseField(columnName = "subject_name", unique = true)
	private String nameSubject;

	@DatabaseField
	private int grade;
	
	@DatabaseField
	private int ects;
	
	@DatabaseField(columnName = "faculty_id", foreign = true)
	private Faculty faculty;
	
	@DatabaseField(columnName = "teacher_id", foreign = true)
	private Teacher teacher;
	
	@ForeignCollectionField
	ForeignCollection<StudentSubject> students;
	

	public int getId() {
		return subjectID;
	}

	public void setId(int id) {
		this.subjectID = id;
	}

	public String getNameSubject() {
		return nameSubject;
	}

	public void setNameSubject(String nameSubject) {
		this.nameSubject = nameSubject;
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

	public ForeignCollection<StudentSubject> getStudents() {
		return students;
	}

	public void setStudents(ForeignCollection<StudentSubject> students) {
		this.students = students;
	}
	
}
