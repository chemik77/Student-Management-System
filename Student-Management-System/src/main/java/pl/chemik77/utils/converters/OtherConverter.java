package pl.chemik77.utils.converters;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class OtherConverter {
	
	public static LocalDate dateToLocalDate(Date date) {
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate;
	}
	
	public static Date localDateToDate(LocalDate localDate) {
		Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		return date;
	}
	
}
