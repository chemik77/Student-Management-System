package pl.chemik77.modelsFx.model;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pl.chemik77.database.dao.StudentCourseDao;
import pl.chemik77.database.models.StudentCourse;
import pl.chemik77.modelsFx.fx.StudentCourseFx;
import pl.chemik77.utils.converters.StudentCourseConverter;

public class StudentCourseModel {
	
	ObservableList<StudentCourseFx> studentCourseFxOL = FXCollections.observableArrayList();
	
	public void init() {
		StudentCourseDao studentCourseDao = new StudentCourseDao();
		List<StudentCourse> studentCourses = studentCourseDao.queryForAll(StudentCourse.class);
		studentCourses.forEach(sc -> {
			this.studentCourseFxOL.add(StudentCourseConverter.studentCourseToStudentCourseFx(sc));
		});
	}

	public ObservableList<StudentCourseFx> getStudentCourseFxOL() {
		return studentCourseFxOL;
	}

	public void setStudentCourseFxOL(ObservableList<StudentCourseFx> studentCourseFxOL) {
		this.studentCourseFxOL = studentCourseFxOL;
	}
	
}
