package pl.chemik77.utils;

import java.util.Date;

import pl.chemik77.database.dao.StudentDao;
import pl.chemik77.database.models.Student;

public class FillDatabase {
	
	public static void fillDatabase() {
		
		StudentDao studentDao = new StudentDao();
		Student student1 = new Student();
		student1.setFirstName("Michał");
		student1.setLastName("Kowalski");
		student1.setDocument("1086361");
		studentDao.createOrUpdate(student1);
		
		Student student2 = new Student();
		student2.setFirstName("Justyna");
		student2.setLastName("Adamiak");
		student2.setDocument("1075261");
		studentDao.createOrUpdate(student2);
		
		Student student3 = new Student();
		student3.setFirstName("Małgorzata");
		student3.setLastName("Klim");
		student3.setDocument("1082695");
		studentDao.createOrUpdate(student3);
		
		Student student4 = new Student();
		student4.setFirstName("Wojciech");
		student4.setLastName("Milewski");
		student4.setDocument("1086591");
		studentDao.createOrUpdate(student4);
		
	}
	
}
