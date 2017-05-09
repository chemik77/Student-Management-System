package pl.chemik77.database.models;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

public class Teacher implements BaseModel {

	@DatabaseField(generatedId = true)
	private int teacherID;
	
	@DatabaseField(columnName = "last_name")
	private String lastNameTeacher;
	
	@DatabaseField(columnName = "first_name")
	private String firstNameTeacher;
	
	@DatabaseField
	private String degree;
	
	@DatabaseField(columnName = "personal_information", foreign = true)
	private PersonalInfo personalInfo;
	
	@DatabaseField(columnName = "division_id", foreign = true)
	private Division division;
	
	@ForeignCollectionField
	ForeignCollection<Course> courses;
	
	public int getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}

	public String getLastNameTeacher() {
		return lastNameTeacher;
	}

	public void setLastNameTeacher(String lastNameTeacher) {
		this.lastNameTeacher = lastNameTeacher;
	}

	public String getFirstNameTeacher() {
		return firstNameTeacher;
	}

	public void setFirstNameTeacher(String firstNameTeacher) {
		this.firstNameTeacher = firstNameTeacher;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
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

	@Override
	public String toString() {
		return (this.degree + " " + this.firstNameTeacher + " " + this.lastNameTeacher);
	}
	
}
