package pl.chemik77.modelsFx.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import pl.chemik77.database.dao.StudentCourseDao;
import pl.chemik77.database.models.StudentCourse;
import pl.chemik77.modelsFx.fx.CourseFx;
import pl.chemik77.modelsFx.fx.StudentCourseFx;
import pl.chemik77.modelsFx.fx.StudentFx;
import pl.chemik77.utils.converters.StudentCourseConverter;

public class StudentCourseModel {
	
	private ObservableList<StudentCourseFx> studentCourseFxOL = FXCollections.observableArrayList();
	private List<StudentCourseFx> studentCourseFxL = new ArrayList<>();
	
	
	private ObjectProperty<StudentFx> studentFx = new SimpleObjectProperty<>();
	private ObjectProperty<CourseFx> courseFx = new SimpleObjectProperty<>();
	
	
	public void init() {
		StudentCourseDao studentCourseDao = new StudentCourseDao();
		List<StudentCourse> studentCourses = studentCourseDao.queryForAll(StudentCourse.class);
		studentCourses.forEach(sc -> {
			this.studentCourseFxL.add(StudentCourseConverter.studentCourseToStudentCourseFx(sc));
		});
	}
	
	public void filterCourseList() {
		if(this.getStudentFx() != null) {
			this.filterPredicate(this.predicateStudent());
		} else {
			this.studentCourseFxOL.setAll(this.studentCourseFxL);
		}
	}

	public void filterStudentList() {
		if(this.getCourseFx() != null) {
			this.filterPredicate(this.predicateCourse());
		} else {
			this.studentCourseFxOL.setAll(this.studentCourseFxL);
		}
	}
	

	private Predicate<StudentCourseFx> predicateStudent() {
		return studentCourseFx -> studentCourseFx.getStudentFx().getStudentID() == this.getStudentFx().getStudentID();
	}

	
	private Predicate<StudentCourseFx> predicateCourse() {
		return studentCourseFx -> studentCourseFx.getCourseFx().getCourseID() == this.getCourseFx().getCourseID();
	}
	
	
	private void filterPredicate(Predicate<StudentCourseFx> predicate) {
		List<StudentCourseFx> newList = this.studentCourseFxL.stream().filter(predicate).collect(Collectors.toList());
		this.studentCourseFxOL.setAll(newList);
	}
	
	
	
	public ObservableList<StudentCourseFx> getStudentCourseFxOL() {
		return studentCourseFxOL;
	}

	public void setStudentCourseFxOL(ObservableList<StudentCourseFx> studentCourseFxOL) {
		this.studentCourseFxOL = studentCourseFxOL;
	}

	
	public ObjectProperty<CourseFx> courseFxProperty() {
		return this.courseFx;
	}
	

	
	public CourseFx getCourseFx() {
		return this.courseFxProperty().get();
	}
	

	
	public void setCourseFx(CourseFx courseFx) {
		this.courseFxProperty().set(courseFx);
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
	
	
	
}
