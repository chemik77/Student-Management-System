package pl.chemik77.database.models;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

public class Teacher implements BaseModel {

	@DatabaseField(generatedId = true)
	private int id;
	
	@DatabaseField(columnName = "teacher_name")
	private String nameTeacher;
	
	@DatabaseField
	private String phone;
	
	@DatabaseField
	private String email;
	
	@DatabaseField(columnName = "division_id", foreign = true)
	private Division division;
	
	@ForeignCollectionField
	ForeignCollection<Subject> subjects;
	
	@ForeignCollectionField
	ForeignCollection<Group> groups;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameTeacher() {
		return nameTeacher;
	}

	public void setNameTeacher(String nameTeacher) {
		this.nameTeacher = nameTeacher;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}

	public ForeignCollection<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(ForeignCollection<Subject> subjects) {
		this.subjects = subjects;
	}

	public ForeignCollection<Group> getGroups() {
		return groups;
	}

	public void setGroups(ForeignCollection<Group> groups) {
		this.groups = groups;
	}
	
}
