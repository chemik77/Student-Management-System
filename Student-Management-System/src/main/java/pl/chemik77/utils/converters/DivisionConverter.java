package pl.chemik77.utils.converters;

import pl.chemik77.database.models.Division;
import pl.chemik77.modelsFx.fx.DivisionFx;

public class DivisionConverter {
	
	public static DivisionFx divisionToDivisionFx(Division division) {
		DivisionFx divisionFx = new DivisionFx();
		divisionFx.setId(division.getId());
		divisionFx.setNameDivision(division.getNameDivision());
		return divisionFx;
	}
	
	public static Division divisionFxToDivision(DivisionFx divisionFx) {
		Division division = new Division();
		division.setId(divisionFx.getId());
		division.setNameDivision(divisionFx.getNameDivision());
		return division;
	}
}
