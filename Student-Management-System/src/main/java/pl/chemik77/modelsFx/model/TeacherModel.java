package pl.chemik77.modelsFx.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;

import pl.chemik77.database.dao.CourseDao;
import pl.chemik77.database.dao.PersonalInfoDao;
import pl.chemik77.database.dao.TeacherDao;
import pl.chemik77.database.models.Course;
import pl.chemik77.database.models.PersonalInfo;
import pl.chemik77.database.models.Teacher;
import pl.chemik77.modelsFx.fx.CourseFx;
import pl.chemik77.modelsFx.fx.DivisionFx;
import pl.chemik77.modelsFx.fx.PersonalInfoFx;
import pl.chemik77.modelsFx.fx.TeacherFx;
import pl.chemik77.utils.converters.CourseConverter;
import pl.chemik77.utils.converters.DivisionConverter;
import pl.chemik77.utils.converters.PersonalInfoConverter;
import pl.chemik77.utils.converters.TeacherConverter;

public class TeacherModel {
	
	private ObservableList<TeacherFx> teacherFxOL = FXCollections.observableArrayList();
	private FilteredList<TeacherFx> filteredList;
	
	private ObjectProperty<TeacherFx> teacherFx = new SimpleObjectProperty<>();
	private ObjectProperty<PersonalInfoFx> personalInfoFx = new SimpleObjectProperty<>(new PersonalInfoFx());
	
	private ObjectProperty<DivisionFx> divisionFx = new SimpleObjectProperty<>(new DivisionFx());
	
	private List<CourseFx> teacherCoursesFxList = new ArrayList<>();
	private ObservableList<CourseFx> teacherCoursesFxOL = FXCollections.observableArrayList();
	
	
	
	public void init() {
		TeacherDao teacherDao = new TeacherDao();
		List<Teacher> teachers = teacherDao.queryForAll(Teacher.class);
		this.teacherCoursesFxOL.clear();
		teachers.forEach(t-> {
			this.teacherFxOL.add(TeacherConverter.teacherToTeacherFx(t));
		});
		
		CourseDao courseDao = new CourseDao();
		List<Course> courses = courseDao.queryForAll(Course.class);
		this.teacherCoursesFxList.clear();
		courses.forEach(c-> {
			this.teacherCoursesFxList.add(CourseConverter.courseToCourseFx(c));
		});
		this.teacherCoursesFxOL.addAll(this.teacherCoursesFxList);
		
		this.filteredList = new FilteredList<>(this.teacherFxOL, p -> true);
	}
	
	public void filterTeacherWithTextField(String newValue) {
		
		this.filteredList.setPredicate(teacherFx -> {
			if(newValue == null || newValue.isEmpty())
				return true;
			String lowerCaseFilter = newValue.toLowerCase();
			if(teacherFx.getLastNameTeacher().toLowerCase().contains(lowerCaseFilter))
				return true;
			else if (teacherFx.getFirstNameTeacher().toLowerCase().contains(lowerCaseFilter))
				return true;
			return false;
		});
	}
	
	public void filterTeacherCourseList() {
		if(this.getTeacherFx() != null)
			this.filterPredicate(this.predicateTeacher());
		else 
			this.teacherCoursesFxOL.setAll(this.teacherCoursesFxList);
	}
	
	private Predicate<CourseFx> predicateTeacher() {
		return teacherFx -> teacherFx.getTeacherFx().getTeacherID() == this.getTeacherFx().getTeacherID();
	}
	
	private void filterPredicate(Predicate<CourseFx> predicate) {
		List<CourseFx> newList = this.teacherCoursesFxList.stream().filter(predicate).collect(Collectors.toList());
		this.teacherCoursesFxOL.setAll(newList);
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

	
	public ObservableList<CourseFx> getTeacherCoursesFxOL() {
		return teacherCoursesFxOL;
	}

	
	public void setTeacherCoursesFxOL(ObservableList<CourseFx> teacherCoursesFxOL) {
		this.teacherCoursesFxOL = teacherCoursesFxOL;
	}


	
	public List<CourseFx> getTeacherCoursesFxList() {
		return teacherCoursesFxList;
	}




	
	public void setTeacherCoursesFxList(List<CourseFx> teacherCoursesFxList) {
		this.teacherCoursesFxList = teacherCoursesFxList;
	}

	
	public FilteredList<TeacherFx> getFilteredList() {
		return filteredList;
	}

	
	public void setFilteredList(FilteredList<TeacherFx> filteredList) {
		this.filteredList = filteredList;
	}

	
	
}
