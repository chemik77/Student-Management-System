package pl.chemik77.database.dbUtils;

import java.io.IOException;
import java.sql.SQLException;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import pl.chemik77.database.models.Student;

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
	
	private static void createTable() {
		try {
			TableUtils.createTableIfNotExists(connectionSource, Student.class);
		} catch (SQLException e) {
			LOGGER.warn(e.getMessage());
		}
	}
	
	private static void dropTable() {
		try {
			TableUtils.dropTable(connectionSource, Student.class, true);
		} catch (SQLException e) {
			LOGGER.warn(e.getMessage());
		}
	}
	
	public static void initDatabase() {
		createConnectionSource();
		dropTable();
		createTable();
		closeConnectionSource();
	}
}
