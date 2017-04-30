package pl.chemik77.database.models;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

public class Group implements BaseModel {
	
	@DatabaseField(generatedId = true)
	private int id;
	
	@DatabaseField(columnName = "group_name")
	private String nameGroup;
	
	@DatabaseField(columnName = "subject_id", foreign = true)
	private Subject subject;
	
	@DatabaseField(columnName = "teacher_id", foreign = true)
	private Teacher teacher;
	
	@ForeignCollectionField
	ForeignCollection<Student> students;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameGroup() {
		return nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public ForeignCollection<Student> getStudents() {
		return students;
	}

	public void setStudents(ForeignCollection<Student> students) {
		this.students = students;
	}
	
}
