package pl.chemik77.database.models;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

public class Faculty implements BaseModel {

	@DatabaseField(generatedId = true)
	private int id;
	
	@DatabaseField(columnName = "faculty_name", unique = true)
	private String nameFaculty;
	
	@DatabaseField(columnName = "division_id", foreign = true)
	private Division division;
	
	@ForeignCollectionField
	ForeignCollection<Subject> subjects;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public ForeignCollection<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(ForeignCollection<Subject> subjects) {
		this.subjects = subjects;
	}
	
}
