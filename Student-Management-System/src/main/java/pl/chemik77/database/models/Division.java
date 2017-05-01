package pl.chemik77.database.models;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

public class Division implements BaseModel {
	
	@DatabaseField(generatedId = true)
	private int divisionID;
	
	@DatabaseField(columnName = "division_name", unique = true)
	private String nameDivision;
	
	@ForeignCollectionField
	ForeignCollection<Teacher> teachers;
	
	@ForeignCollectionField
	ForeignCollection<Faculty> faculties;
	
	@ForeignCollectionField
	ForeignCollection<Student> students;

	public int getId() {
		return divisionID;
	}

	public void setId(int id) {
		this.divisionID = id;
	}

	public String getNameDivision() {
		return nameDivision;
	}

	public void setNameDivision(String nameDivision) {
		this.nameDivision = nameDivision;
	}

	public ForeignCollection<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(ForeignCollection<Teacher> teachers) {
		this.teachers = teachers;
	}

	public ForeignCollection<Faculty> getFaculties() {
		return faculties;
	}

	public void setFaculties(ForeignCollection<Faculty> faculties) {
		this.faculties = faculties;
	}

	public ForeignCollection<Student> getStudents() {
		return students;
	}

	public void setStudents(ForeignCollection<Student> students) {
		this.students = students;
	}
	
}
