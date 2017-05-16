package pl.chemik77.modelsFx.model;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pl.chemik77.database.dao.FacultyDao;
import pl.chemik77.database.models.Faculty;
import pl.chemik77.modelsFx.fx.FacultyFx;
import pl.chemik77.utils.converters.FacultyConverter;

public class FacultyModel {
	
	private ObservableList<FacultyFx> facultyFxOL = FXCollections.observableArrayList();

	public void init() {
		FacultyDao dao = new FacultyDao();
		List<Faculty> faculties = dao.queryForAll(Faculty.class);
		faculties.forEach(f-> {
			this.facultyFxOL.add(FacultyConverter.facultyToFacultyFx(f));
		});
	}
	
	
	public ObservableList<FacultyFx> getFacultyFxOL() {
		return facultyFxOL;
	}

	public void setFacultyFxOL(ObservableList<FacultyFx> facultyFxOL) {
		this.facultyFxOL = facultyFxOL;
	}
	
	
}
