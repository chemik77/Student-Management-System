package pl.chemik77.database.models;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "students")
public class Student implements BaseModel{
	
	@DatabaseField(generatedId = true)
	private int studentID;
	
	@DatabaseField(columnName = "document", unique = true)
	private String document;
	
	@DatabaseField(columnName = "first_name")
	private String firstName;
	
	@DatabaseField(columnName = "last_name")
	private String lastName;
	
	@DatabaseField(columnName = "personal_information_id", foreign = true)
	private PersonalInfo personalInfo;
	
	@DatabaseField(columnName = "division_id", foreign = true)
	private Division division;
	
	@DatabaseField(columnName = "faculty_id", foreign = true)
	private Faculty faculty;
	
	@ForeignCollectionField
	ForeignCollection<StudentSubject> subjects;
	
	public Student(){}

	public int getId() {
		return studentID;
	}

	public void setId(int id) {
		this.studentID = id;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return this.firstName + " " + this.lastName;
	}

	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}

	public ForeignCollection<StudentSubject> getSubjects() {
		return subjects;
	}

	public void setSubjects(ForeignCollection<StudentSubject> subjects) {
		this.subjects = subjects;
	}

}
