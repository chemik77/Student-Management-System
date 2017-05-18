package pl.chemik77.modelsFx.model;

import java.util.List;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pl.chemik77.database.dao.PersonalInfoDao;
import pl.chemik77.database.dao.StudentDao;
import pl.chemik77.database.models.PersonalInfo;
import pl.chemik77.database.models.Student;
import pl.chemik77.modelsFx.fx.DivisionFx;
import pl.chemik77.modelsFx.fx.FacultyFx;
import pl.chemik77.modelsFx.fx.PersonalInfoFx;
import pl.chemik77.modelsFx.fx.StudentFx;
import pl.chemik77.utils.converters.DivisionConverter;
import pl.chemik77.utils.converters.FacultyConverter;
import pl.chemik77.utils.converters.PersonalInfoConverter;
import pl.chemik77.utils.converters.StudentConverter;

public class StudentModel {
	
	private ObservableList<StudentFx> studentFxOL = FXCollections.observableArrayList();
	
	private ObjectProperty<StudentFx> studentFx = new SimpleObjectProperty<>(new StudentFx());
	private ObjectProperty<PersonalInfoFx> personalInfoFx = new SimpleObjectProperty<>(new PersonalInfoFx());
	
	private ObjectProperty<DivisionFx> divisionFx = new SimpleObjectProperty<>(new DivisionFx());
	private ObjectProperty<FacultyFx> facultyFx = new SimpleObjectProperty<>(new FacultyFx());
	
	
	public void init() {
		StudentDao studentDao = new StudentDao();
		List<Student> students = studentDao.queryForAll(Student.class);
		this.studentFxOL.clear();
		students.forEach(s-> {
			this.studentFxOL.add(StudentConverter.studentToStudentFx(s));
		});
		
	}
	
	
	public void addStudentToDatabase() {
		StudentDao studentDao = new StudentDao();
		PersonalInfoDao personalInfoDao = new PersonalInfoDao();
		Student student = new Student();
		PersonalInfo personal = new PersonalInfo();
		
		personal = PersonalInfoConverter.personalInfoFxToPersonalInfo(personalInfoFx.get());
		personalInfoDao.createOrUpdate(personal);
		
		student.setFirstName(this.getStudentFx().getFirstName());
		student.setLastName(this.getStudentFx().getLastName());
		student.setDocument(this.getStudentFx().getDocument());
		student.setPersonalInfo(personal);
		student.setDivision(DivisionConverter.divisionFxToDivision(this.divisionFx.get()));
		student.setFaculty(FacultyConverter.facultyFxToFaculty(this.facultyFx.get()));
		
		studentDao.createOrUpdate(student);
		
		this.init();
	}


	
	public ObservableList<StudentFx> getStudentFxOL() {
		return studentFxOL;
	}

	public void setStudentFxOL(ObservableList<StudentFx> studentFxOL) {
		this.studentFxOL = studentFxOL;
	}

	public ObjectProperty<StudentFx> studentFxProperty() {
		return this.studentFx;
	}
	

	public StudentFx getStudentFx() {
		return this.studentFxProperty().get();
	}
	

	public void setStudentFx(StudentFx studentFx) {
		this.studentFxProperty().set(studentFx);
	}

	public ObjectProperty<PersonalInfoFx> personalInfoFxProperty() {
		return this.personalInfoFx;
	}
	

	public PersonalInfoFx getPersonalInfoFx() {
		return this.personalInfoFxProperty().get();
	}
	

	public void setPersonalInfoFx(PersonalInfoFx personalInfoFx) {
		this.personalInfoFxProperty().set(personalInfoFx);
	}
	

	public ObjectProperty<DivisionFx> divisionFxProperty() {
		return this.divisionFx;
	}
	

	public DivisionFx getDivisionFx() {
		return this.divisionFxProperty().get();
	}
	

	public void setDivisionFx(DivisionFx divisionFx) {
		this.divisionFxProperty().set(divisionFx);
	}
	

	public ObjectProperty<FacultyFx> facultyFxProperty() {
		return this.facultyFx;
	}
	

	public FacultyFx getFacultyFx() {
		return this.facultyFxProperty().get();
	}
	

	public void setFacultyFx(FacultyFx facultyFx) {
		this.facultyFxProperty().set(facultyFx);
	}
	
	
}
