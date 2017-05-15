package pl.chemik77.utils;

import java.util.Date;

import pl.chemik77.database.dao.CourseDao;
import pl.chemik77.database.dao.DivisionDao;
import pl.chemik77.database.dao.FacultyDao;
import pl.chemik77.database.dao.PersonalInfoDao;
import pl.chemik77.database.dao.StudentCourseDao;
import pl.chemik77.database.dao.StudentDao;
import pl.chemik77.database.dao.TeacherDao;
import pl.chemik77.database.models.Course;
import pl.chemik77.database.models.Division;
import pl.chemik77.database.models.Faculty;
import pl.chemik77.database.models.PersonalInfo;
import pl.chemik77.database.models.Student;
import pl.chemik77.database.models.StudentCourse;
import pl.chemik77.database.models.Teacher;

public class FillDatabase {
	
	public static void fillDatabase() {
		
		StudentDao studentDao = new StudentDao();
		PersonalInfoDao personalInfoDao = new PersonalInfoDao();
		DivisionDao divisionDao = new DivisionDao();
		FacultyDao facultyDao = new FacultyDao();
		
		Student student1 = new Student();
		student1.setFirstName("Michał");
		student1.setLastName("Kowalski");
		student1.setDocument("1086361");
		
		PersonalInfo personal1 = new PersonalInfo();
		personal1.setPesel("86051623114");
		personal1.setSex(2);
		personal1.setBirth(new Date());
		personal1.setPhone("506 547 799");
		personal1.setEmail("kowalski535@gmail.com");
		personal1.setStreet("Olszańska");
		personal1.setHouse("12/1");
		personal1.setZip("52-353");
		personal1.setCity("Wrocław");
		personal1.setPhoto("/img/student/kowalski_michal.jpg");
		personalInfoDao.createOrUpdate(personal1);
		
		Division division1 = new Division();
		division1.setNameDivision("Wydział Chemiczny");
		divisionDao.createOrUpdate(division1);
		
		Faculty faculty1 = new Faculty();
		faculty1.setNameFaculty("Inżynieria Chemiczna");
		faculty1.setDivision(division1);
		facultyDao.createOrUpdate(faculty1);
		
		student1.setPersonalInfo(personal1);
		student1.setDivision(division1);
		student1.setFaculty(faculty1);
		studentDao.createOrUpdate(student1);
		
		
		TeacherDao teacherDao = new TeacherDao();
		
		Teacher teacher1 = new Teacher();
		teacher1.setLastNameTeacher("Walaszek");
		teacher1.setFirstNameTeacher("Maria");
		teacher1.setDegree("Prof.");
		
		PersonalInfo personal2 = new PersonalInfo();
		personal2.setPesel("71012510002");
		personal2.setSex(1);
		personal2.setBirth(new Date());
		personal2.setPhone("712 322 521");
		personal2.setEmail("walaszekmaria@pwr.edu.pl");
		personal2.setStreet("Piłsudskiego");
		personal2.setHouse("24/10");
		personal2.setZip("50-050");
		personal2.setCity("Wrocław");
		personal2.setPhoto("/img/teacher/walaszek_maria.jpg");
		personalInfoDao.createOrUpdate(personal2);
		
		Division division2 = new Division();
		division2.setNameDivision("Wydział Matematyki");
		divisionDao.createOrUpdate(division2);
		
		teacher1.setPersonalInfo(personal2);
		teacher1.setDivision(division2);
		teacherDao.createOrUpdate(teacher1);
		
		
		CourseDao courseDao = new CourseDao();
		
		Course course1 = new Course();
		course1.setNameCourse("Analiza matematyczna I Wykład");
		course1.setCodeCourse("AM101W");
		course1.setEcts(3);
		
		Faculty faculty2 = new Faculty();
		faculty2.setNameFaculty("Matematyka Stosowana");
		faculty2.setDivision(division2);
		facultyDao.createOrUpdate(faculty2);
		
		course1.setFaculty(faculty2);
		course1.setTeacher(teacher1);
		courseDao.createOrUpdate(course1);
		
		StudentCourseDao scDao = new StudentCourseDao();
		
		StudentCourse sc1 = new StudentCourse();
		sc1.setStudent(student1);
		sc1.setCourse(course1);
		sc1.setGrade(4.0);
		scDao.createOrUpdate(sc1);
		
		//-------------------------------------
//		Student student2 = new Student();
//		student2.setFirstName("Justyna");
//		student2.setLastName("Adamiak");
//		student2.setDocument("1075261");
//		studentDao.createOrUpdate(student2);
//		
//		Student student3 = new Student();
//		student3.setFirstName("Małgorzata");
//		student3.setLastName("Klim");
//		student3.setDocument("1082695");
//		studentDao.createOrUpdate(student3);
//		
//		Student student4 = new Student();
//		student4.setFirstName("Wojciech");
//		student4.setLastName("Milewski");
//		student4.setDocument("1086591");
//		studentDao.createOrUpdate(student4);
		
	}
	
}
