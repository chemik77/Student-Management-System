package pl.chemik77.database.dbUtils;

import java.io.IOException;
import java.sql.SQLException;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import pl.chemik77.database.models.Division;
import pl.chemik77.database.models.Faculty;
import pl.chemik77.database.models.PersonalInfo;
import pl.chemik77.database.models.Student;
import pl.chemik77.database.models.StudentCourse;
import pl.chemik77.database.models.Course;
import pl.chemik77.database.models.Teacher;

public class DbManager {
	
	private static final String DATABASE_URL = "jdbc:h2:./StudentInformationSystemDB";
	private static ConnectionSource connectionSource;
	private static final Logger LOGGER = LoggerFactory.getLogger(DbManager.class);
	
	private static void createConnectionSource() {
		try {
			connectionSource = new JdbcConnectionSource(DATABASE_URL, "admin", "admin");
		} catch (SQLException e) {
			LOGGER.warn(e.getMessage());
		}
	}
	
	public static ConnectionSource getConnectionSource() {
		if(connectionSource == null)
			createConnectionSource();
		return connectionSource;
	}
	
	public static void closeConnectionSource() {
		if(connectionSource != null)
			try {
				connectionSource.close();
			} catch (IOException e) {
				LOGGER.warn(e.getMessage());
			}
	}
	
	private static void createTables() {
		try {
			TableUtils.createTableIfNotExists(connectionSource, Student.class);
			TableUtils.createTableIfNotExists(connectionSource, Division.class);
			TableUtils.createTableIfNotExists(connectionSource, Faculty.class);
			TableUtils.createTableIfNotExists(connectionSource, Course.class);
			TableUtils.createTableIfNotExists(connectionSource, Teacher.class);
			TableUtils.createTableIfNotExists(connectionSource, StudentCourse.class);
			TableUtils.createTableIfNotExists(connectionSource, PersonalInfo.class);
		} catch (SQLException e) {
			LOGGER.warn(e.getMessage());
		}
	}
	
	private static void dropTables() {
		try {
			TableUtils.dropTable(connectionSource, Student.class, true);
			TableUtils.dropTable(connectionSource, Division.class, true);
			TableUtils.dropTable(connectionSource, Faculty.class, true);
			TableUtils.dropTable(connectionSource, Course.class, true);
			TableUtils.dropTable(connectionSource, Teacher.class, true);
			TableUtils.dropTable(connectionSource, StudentCourse.class, true);
			TableUtils.dropTable(connectionSource, PersonalInfo.class, true);
		} catch (SQLException e) {
			LOGGER.warn(e.getMessage());
		}
	}
	
	public static void initDatabase() {
		createConnectionSource();
		dropTables();
		createTables();
		closeConnectionSource();
	}
}
