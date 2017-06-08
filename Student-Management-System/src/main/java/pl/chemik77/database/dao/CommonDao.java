package pl.chemik77.database.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;

import pl.chemik77.database.dbUtils.DbManager;
import pl.chemik77.database.models.BaseModel;

public class CommonDao {
	private static final Logger LOGGER = LoggerFactory.getLogger(CommonDao.class);
	protected final ConnectionSource connectionSource;
	
	public CommonDao() {
		this.connectionSource = DbManager.getConnectionSource();
	}
	
	//closeDbConnection
	private void closeDbConnection() {
		try {
			this.connectionSource.close();
		} catch (IOException e) {
			LOGGER.warn(e.getMessage());
		}
	}
	
	//createOrUpdate
	@SuppressWarnings("unchecked")
	public <T extends BaseModel, I> void createOrUpdate(BaseModel baseModel) {
		try {
			Dao<T ,I> dao = (Dao<T, I>) getDao(baseModel.getClass());
			dao.createOrUpdate((T)baseModel);
		} catch (SQLException e) {
			LOGGER.warn(e.getMessage());
		} finally {
			this.closeDbConnection();
		}
	}
	
	//queryForAll
	public <T extends BaseModel, I> List<T> queryForAll(Class<T> cls) {
		try {
			return getDao(cls).queryForAll();
		} catch (SQLException e) {
			LOGGER.warn(e.getMessage());
			return null;
		} finally {
			this.closeDbConnection();
		}
	}
	
	//getDao
	private <T extends BaseModel, I> Dao<T, I> getDao(Class<T> cls) {
		try {
			return DaoManager.createDao(this.connectionSource, cls);
		} catch (SQLException e) {
			LOGGER.warn(e.getMessage());
			return null;
		} finally {
			this.closeDbConnection();
		}
	}
}
