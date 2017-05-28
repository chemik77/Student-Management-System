package pl.chemik77.modelsFx.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pl.chemik77.database.dao.PersonalInfoDao;
import pl.chemik77.database.dao.TeacherDao;
import pl.chemik77.database.models.PersonalInfo;
import pl.chemik77.database.models.Teacher;
import pl.chemik77.modelsFx.fx.DivisionFx;
import pl.chemik77.modelsFx.fx.PersonalInfoFx;
import pl.chemik77.modelsFx.fx.TeacherFx;
import pl.chemik77.utils.converters.DivisionConverter;
import pl.chemik77.utils.converters.PersonalInfoConverter;
import pl.chemik77.utils.converters.TeacherConverter;

public class TeacherModel {
	
	private ObservableList<TeacherFx> teacherFxOL = FXCollections.observableArrayList();
	
	private List<TeacherFx> teacherFxList = new ArrayList<>();
	
	private ObjectProperty<TeacherFx> teacherFx = new SimpleObjectProperty<>(new TeacherFx());
	private ObjectProperty<PersonalInfoFx> personalInfoFx = new SimpleObjectProperty<>(new PersonalInfoFx());
	
	private ObjectProperty<DivisionFx> divisionFx = new SimpleObjectProperty<>(new DivisionFx());
	
	private StringProperty nameTextField = new SimpleStringProperty();
	
	
	public void init() {
		TeacherDao dao = new TeacherDao();
		List<Teacher> teachers = dao.queryForAll(Teacher.class);
		this.teacherFxList.clear();
		teachers.forEach(t-> {
			this.teacherFxList.add(TeacherConverter.teacherToTeacherFx(t));
		});
		this.teacherFxOL.addAll(teacherFxList);
		
	}
	
	public void filterTeachersList() {
		if(this.nameTextField.get() != null) {
			this.filterPredicate(this.predicateTeacher());
			System.out.println("not null");
		} else {
			this.teacherFxOL.setAll(this.teacherFxList);
			System.out.println("null");
		}
	}
	

	private void filterPredicate(Predicate<TeacherFx> predicate) {
		List<TeacherFx> newList = this.teacherFxList.stream().filter(predicate).collect(Collectors.toList());
		this.teacherFxOL.setAll(newList);
	}

	private Predicate<TeacherFx> predicateTeacher() {
		return teacherFx -> teacherFx.getLastNameTeacher().substring(0, 1) == this.nameTextField.get();
	}

	public void addTeacherToDatabase() {
		TeacherDao teacherDao = new TeacherDao();
		PersonalInfoDao personalInfoDao = new PersonalInfoDao();
		Teacher teacher = new Teacher();
		PersonalInfo personalInfo = new PersonalInfo();
		
		personalInfo = PersonalInfoConverter.personalInfoFxToPersonalInfo(this.personalInfoFx.get());
		personalInfoDao.createOrUpdate(personalInfo);
		
		teacher.setDegree(this.getTeacherFx().getDegree());
		teacher.setLastNameTeacher(this.getTeacherFx().getLastNameTeacher());
		teacher.setFirstNameTeacher(this.getTeacherFx().getFirstNameTeacher());
		teacher.setPersonalInfo(personalInfo);
		teacher.setDivision(DivisionConverter.divisionFxToDivision(getDivisionFx()));
		
		teacherDao.createOrUpdate(teacher);
		
		this.init();
	}
	
	
	
	public ObjectProperty<TeacherFx> teacherFxProperty() {
		return this.teacherFx;
	}
	
	public TeacherFx getTeacherFx() {
		return this.teacherFxProperty().get();
	}
	
	public void setTeacherFx(TeacherFx teacherFx) {
		this.teacherFxProperty().set(teacherFx);
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

	public ObservableList<TeacherFx> getTeacherFxOL() {
		return teacherFxOL;
	}

	public void setTeacherFxOL(ObservableList<TeacherFx> teacherFxOL) {
		this.teacherFxOL = teacherFxOL;
	}

	
	public StringProperty nameTextFieldProperty() {
		return this.nameTextField;
	}
	

	
	public String getNameTextField() {
		return this.nameTextFieldProperty().get();
	}
	

	
	public void setNameTextField(String nameTextField) {
		this.nameTextFieldProperty().set(nameTextField);
	}
	

	
}
