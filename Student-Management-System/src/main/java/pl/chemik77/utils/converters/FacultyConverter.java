package pl.chemik77.utils.converters;

import pl.chemik77.database.models.Faculty;
import pl.chemik77.modelsFx.fx.FacultyFx;

public class FacultyConverter {
	
	public static FacultyFx facultyToFacultyFx(Faculty faculty) {
		FacultyFx facultyFx = new FacultyFx();
		facultyFx.setFacultyID(faculty.getId());
		facultyFx.setNameFaculty(faculty.getNameFaculty());
		facultyFx.setDivisionFx(DivisionConverter.divisionToDivisionFx(faculty.getDivision()));
		return facultyFx;
	}
	
	public static Faculty facultyFxToFaculty(FacultyFx facultyFx) {
		Faculty faculty = new Faculty();
		faculty.setId(facultyFx.getFacultyID());
		faculty.setNameFaculty(facultyFx.getNameFaculty());
		faculty.setDivision(DivisionConverter.divisionFxToDivision(facultyFx.getDivisionFx()));
		return faculty;
	}
	
}
