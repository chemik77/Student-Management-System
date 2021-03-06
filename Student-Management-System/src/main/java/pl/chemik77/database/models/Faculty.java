package pl.chemik77.database.models;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

public class Faculty implements BaseModel {

	@DatabaseField(generatedId = true)
	private int facultyID;
	
	@DatabaseField(columnName = "faculty_name", unique = true)
	private String nameFaculty;
	
	@DatabaseField(columnName = "division_id", foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
	private Division division;
	
	@ForeignCollectionField
	ForeignCollection<Course> courses;
	
	@ForeignCollectionField
	ForeignCollection<Student> students;

	public int getId() {
		return facultyID;
	}

	public void setId(int id) {
		this.facultyID = id;
	}

	public String getNameFaculty() {
		return nameFaculty;
	}

	public void setNameFaculty(String nameFaculty) {
		this.nameFaculty = nameFaculty;
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

	public ForeignCollection<Student> getStudents() {
		return students;
	}

	public void setStudents(ForeignCollection<Student> students) {
		this.students = students;
	}
	
	@Override
	public String toString() {
		return this.nameFaculty;
	}
}
