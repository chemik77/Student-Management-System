package pl.chemik77.utils.converters;

import pl.chemik77.database.models.Teacher;
import pl.chemik77.modelsFx.fx.TeacherFx;

public class TeacherConverter {
	
	public static TeacherFx teacherToTeacherFx(Teacher teacher) {
		TeacherFx teacherFx = new TeacherFx();
		teacherFx.setTeacherID(teacher.getTeacherID());
		teacherFx.setLastNameTeacher(teacher.getLastNameTeacher());
		teacherFx.setFirstNameTeacher(teacher.getFirstNameTeacher());
		teacherFx.setDegree(teacher.getDegree());
		teacherFx.setPersonalInfoFx(PersonalInfoConverter.personalInfoToPersonalInfoFx(teacher.getPersonalInfo()));
		teacherFx.setDivisionFx(DivisionConverter.divisionToDivisionFx(teacher.getDivision()));
		return teacherFx;
	}
	
	public static Teacher teacherFxToTeacher(TeacherFx teacherFx) {
		Teacher teacher = new Teacher();
		teacher.setTeacherID(teacherFx.getTeacherID());
		teacher.setLastNameTeacher(teacherFx.getLastNameTeacher());
		teacher.setFirstNameTeacher(teacherFx.getFirstNameTeacher());
		teacher.setDegree(teacherFx.getDegree());
		teacher.setPersonalInfo(PersonalInfoConverter.personalInfoFxToPersonalInfo(teacherFx.getPersonalInfoFx()));
		teacher.setDivision(DivisionConverter.divisionFxToDivision(teacherFx.getDivisionFx()));
		return teacher;
	}
	
}
