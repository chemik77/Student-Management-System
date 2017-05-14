package pl.chemik77.utils.converters;

import pl.chemik77.database.models.StudentCourse;
import pl.chemik77.modelsFx.fx.StudentCourseFx;

public class StudentCourseConverter {

	public static StudentCourseFx studentCourseToStudentCourseFx(StudentCourse studentCourse) {
		StudentCourseFx studentCourseFx = new StudentCourseFx();
		studentCourseFx.setStudentCourseID(studentCourse.getStudentCourseID());
		studentCourseFx.setGrade(studentCourse.getGrade());
		studentCourseFx.setStudentFx(StudentConverter.studentToStudentFx(studentCourse.getStudent()));
		studentCourseFx.setCourseFx(CourseConverter.courseToCourseFx(studentCourse.getCourse()));
		return studentCourseFx;
	}
	
	public static StudentCourse studentCourseFxToStudentCourse(StudentCourseFx studentCourseFx) {
		StudentCourse studentCourse = new StudentCourse();
		studentCourse.setStudentCourseID(studentCourseFx.getStudentCourseID());
		studentCourse.setGrade(studentCourseFx.getGrade());
		studentCourse.setStudent(StudentConverter.studentFxToStudent(studentCourseFx.getStudentFx()));
		studentCourse.setCourse(CourseConverter.courseFxToCourse(studentCourseFx.getCourseFx()));
		return studentCourse;
	}
	
}
