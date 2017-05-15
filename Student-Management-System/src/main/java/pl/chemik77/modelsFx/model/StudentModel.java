package pl.chemik77.modelsFx.model;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pl.chemik77.database.dao.StudentDao;
import pl.chemik77.database.models.Student;
import pl.chemik77.modelsFx.fx.StudentFx;
import pl.chemik77.utils.converters.StudentConverter;

public class StudentModel {
	
	ObservableList<StudentFx> studentFxOL = FXCollections.observableArrayList();
	
	public void init() {
		StudentDao studentDao = new StudentDao();
		List<Student> students = studentDao.queryForAll(Student.class);
		students.forEach(s-> {
			this.studentFxOL.add(StudentConverter.studentToStudentFx(s));
		});
	}

	
	public ObservableList<StudentFx> getStudentFxOL() {
		return studentFxOL;
	}

	public void setStudentFxOL(ObservableList<StudentFx> studentFxOL) {
		this.studentFxOL = studentFxOL;
	}
}
