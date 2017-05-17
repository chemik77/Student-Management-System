package pl.chemik77.modelsFx.model;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pl.chemik77.database.dao.DivisionDao;
import pl.chemik77.database.models.Division;
import pl.chemik77.modelsFx.fx.DivisionFx;
import pl.chemik77.utils.converters.DivisionConverter;

public class DivisionModel {
	
	private ObservableList<DivisionFx> divisionFxOL = FXCollections.observableArrayList();

	public void init() {
		DivisionDao dao = new DivisionDao();
		List<Division> divisions = dao.queryForAll(Division.class);
		this.divisionFxOL.clear();
		divisions.forEach(d-> {
			this.divisionFxOL.add(DivisionConverter.divisionToDivisionFx(d));
		});
		
	}
	
	
	public ObservableList<DivisionFx> getDivisionFxOL() {
		return divisionFxOL;
	}

	public void setDivisionFxOL(ObservableList<DivisionFx> divisionFxOL) {
		this.divisionFxOL = divisionFxOL;
	}
	
	
}
