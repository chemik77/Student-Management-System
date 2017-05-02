package pl.chemik77.database.models;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

public class Teacher implements BaseModel {

	@DatabaseField(generatedId = true)
	private int teacherID;
	
	@DatabaseField(columnName = "teacher_name")
	private String nameTeacher;
	
	@DatabaseField(columnName = "personal_information", foreign = true)
	private PersonalInfo personalInfo;
	
	@DatabaseField(columnName = "division_id", foreign = true)
	private Division division;
	
	@ForeignCollectionField
	ForeignCollection<Course> courses;
	
	public int getId() {
		return teacherID;
	}

	public void setId(int id) {
		this.teacherID = id;
	}

	public String getNameTeacher() {
		return nameTeacher;
	}

	public void setNameTeacher(String nameTeacher) {
		this.nameTeacher = nameTeacher;
	}

	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}

	public ForeignCollection<Course> getCourses() {
		return courses;
	}

	public void setCourses(ForeignCollection<Course> courses) {
		this.courses = courses;
	}

	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}
	
}
