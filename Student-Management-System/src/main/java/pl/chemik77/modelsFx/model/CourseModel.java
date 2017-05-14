package pl.chemik77.modelsFx.model;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pl.chemik77.database.dao.CourseDao;
import pl.chemik77.database.models.Course;
import pl.chemik77.modelsFx.fx.CourseFx;
import pl.chemik77.utils.converters.CourseConverter;

public class CourseModel {
	
	ObservableList<CourseFx> courseFxOL = FXCollections.observableArrayList();

	public void init() {
		CourseDao courseDao = new CourseDao();
		List<Course> courses = courseDao.queryForAll(Course.class);
		courses.forEach(course-> {
			this.courseFxOL.add(CourseConverter.courseToCourseFx(course));
		});
	}
	
	
	public ObservableList<CourseFx> getCourseFxOL() {
		return courseFxOL;
	}

	public void setCourseFxOL(ObservableList<CourseFx> courseFxOL) {
		this.courseFxOL = courseFxOL;
	}
	
}
