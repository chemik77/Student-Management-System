package pl.chemik77.modelsFx.model;

import java.util.List;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;

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
	
	private static StudentModel instance = null;
	
	private ObservableList<StudentFx> studentFxOL = FXCollections.observableArrayList();
	private FilteredList<StudentFx> filteredList;
	
	private ObjectProperty<StudentFx> studentFx = new SimpleObjectProperty<>(new StudentFx());
	private ObjectProperty<PersonalInfoFx> personalInfoFx = new SimpleObjectProperty<>(new PersonalInfoFx());
	
	private ObjectProperty<DivisionFx> divisionFx = new SimpleObjectProperty<>(new DivisionFx());
	private ObjectProperty<FacultyFx> facultyFx = new SimpleObjectProperty<>(new FacultyFx());
	
	private StudentModel() {}
	
	//Singleton create one object of this class and pass its refrences to the other controllers
	public static StudentModel getInstance() {
		if(instance == null) {
			instance = new StudentModel();
		}
		return instance;
	}
	
	public void init() {
		
		//fill ObsList with students
		StudentDao studentDao = new StudentDao();
		List<Student> students = studentDao.queryForAll(Student.class);
		this.studentFxOL.clear();
		students.forEach(s-> {
			this.studentFxOL.add(StudentConverter.studentToStudentFx(s));
		});
		
		//fill FList with students
		this.filteredList = new FilteredList<>(this.studentFxOL, p -> true);
		
	}
	
	public void setPersonalFromObject() {
		if(this.getStudentFx() != null)
			this.setPersonalInfoFx(this.getStudentFx().getPersonalInfoFx());
	}
	
	public void filterByName(String newValue) {
		this.filteredList.setPredicate(studentFx -> {
			if(newValue == null || newValue.isEmpty())
				return true;
			
			String lowerCaseFilter = newValue.toLowerCase();
			
			if(studentFx.getLastName().toLowerCase().contains(lowerCaseFilter))
				return true;
			return false;
		});
		
	}
	
	public void filterByDoc(String newValue) {
		this.filteredList.setPredicate(studentFx -> {
			if(newValue == null || newValue.isEmpty())
				return true;
			
			String lowerCaseFilter = newValue.toLowerCase();
			
			if(studentFx.getDocument().toLowerCase().contains(lowerCaseFilter))
				return true;
			return false;
		});
	}
	
	public void filterByPesel(String newValue) {
		this.filteredList.setPredicate(studentFx -> {
			if(newValue == null || newValue.isEmpty())
				return true;
			
			String lowerCaseFilter = newValue.toLowerCase();
			
			if(studentFx.getPersonalInfoFx().getPesel().toLowerCase().contains(lowerCaseFilter))
				return true;
			return false;
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


	
	public FilteredList<StudentFx> getFilteredList() {
		return filteredList;
	}


	
	public void setFilteredList(FilteredList<StudentFx> filteredList) {
		this.filteredList = filteredList;
	}
	
	
}
