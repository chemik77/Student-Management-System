package pl.chemik77.utils.converters;

import pl.chemik77.database.models.Student;
import pl.chemik77.modelsFx.fx.StudentFx;

public class StudentConverter {
	
	public static StudentFx studentToStudentFx(Student student) {
		StudentFx studentFx = new StudentFx();
		studentFx.setStudentID(student.getId());
		studentFx.setDocument(student.getDocument());
		studentFx.setFirstName(student.getFirstName());
		studentFx.setLastName(student.getLastName());
		studentFx.setPersonalInfoFx(PersonalInfoConverter.personalInfoToPersonalInfoFx(student.getPersonalInfo()));
		studentFx.setDivisionFx(DivisionConverter.divisionToDivisionFx(student.getDivision()));
		studentFx.setFacultyFx(FacultyConverter.facultyToFacultyFx(student.getFaculty()));
		return studentFx;
	}
	
	public static Student studentFxToStudent(StudentFx studentFx) {
		Student student = new Student();
		student.setId(studentFx.getStudentID());
		student.setDocument(studentFx.getDocument());
		student.setFirstName(studentFx.getFirstName());
		student.setLastName(studentFx.getLastName());
		student.setPersonalInfo(PersonalInfoConverter.personalInfoFxToPersonalInfo(studentFx.getPersonalInfoFx()));
		student.setDivision(DivisionConverter.divisionFxToDivision(studentFx.getDivisionFx()));
		student.setFaculty(FacultyConverter.facultyFxToFaculty(studentFx.getFacultyFx()));
		return student;
	}
	
}
