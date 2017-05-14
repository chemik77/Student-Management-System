package pl.chemik77.utils.converters;

import pl.chemik77.database.models.Course;
import pl.chemik77.modelsFx.fx.CourseFx;

public class CourseConverter {
	
	public static CourseFx courseToCourseFx(Course course) {
		CourseFx courseFx = new CourseFx();
		courseFx.setCourseID(course.getCourseID());
		courseFx.setNameCourse(course.getNameCourse());
		courseFx.setCodeCourse(course.getCodeCourse());
		courseFx.setEcts(course.getEcts());
		courseFx.setFacultyFx(FacultyConverter.facultyToFacultyFx(course.getFaculty()));
		courseFx.setTeacherFx(TeacherConverter.teacherToTeacherFx(course.getTeacher()));
		return courseFx;
	}
	
	public static Course courseFxToCourse(CourseFx courseFx) {
		Course course = new Course();
		course.setCourseID(courseFx.getCourseID());
		course.setNameCourse(courseFx.getNameCourse());
		course.setCodeCourse(courseFx.getCodeCourse());
		course.setEcts(courseFx.getEcts());
		course.setFaculty(FacultyConverter.facultyFxToFaculty(courseFx.getFacultyFx()));
		course.setTeacher(TeacherConverter.teacherFxToTeacher(courseFx.getTeacherFx()));
		return course;
	}
}
