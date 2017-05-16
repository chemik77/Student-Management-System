package pl.chemik77.utils.converters;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class OtherConverter {
	
	public static LocalDate dateToLocalDate(Date date) {
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		//LocalDate localDate = new java.sql.Date(date.getTime()).toLocalDate();
		return localDate;
	}
	
	public static Date localDateToDate(LocalDate localDate) {
		Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		//Date date = java.sql.Date.valueOf(localDate);
		return date;
	}
	
}
