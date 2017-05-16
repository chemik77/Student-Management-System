package pl.chemik77.utils.converters;

import java.time.LocalDate;

import pl.chemik77.database.models.PersonalInfo;
import pl.chemik77.modelsFx.fx.PersonalInfoFx;

public class PersonalInfoConverter {
	
	public static PersonalInfoFx personalInfoToPersonalInfoFx(PersonalInfo personalInfo) {
		PersonalInfoFx personalInfoFx = new PersonalInfoFx();
		personalInfoFx.setPersonalInfoID(personalInfo.getId());
		personalInfoFx.setPesel(personalInfo.getPesel());
		personalInfoFx.setSex(personalInfo.getSex());
		personalInfoFx.setBirth(LocalDate.now());
		personalInfoFx.setPhone(personalInfo.getPhone());
		personalInfoFx.setEmail(personalInfo.getEmail());
		personalInfoFx.setStreet(personalInfo.getStreet());
		personalInfoFx.setHouse(personalInfo.getHouse());
		personalInfoFx.setZip(personalInfo.getZip());
		personalInfoFx.setCity(personalInfo.getCity());
		personalInfoFx.setPhoto(personalInfo.getPhoto());
		return personalInfoFx;
	}
	
	public static PersonalInfo personalInfoFxToPersonalInfo(PersonalInfoFx personalInfoFx) {
		PersonalInfo personalInfo = new PersonalInfo();
		personalInfo.setId(personalInfoFx.getPersonalInfoID());
		personalInfo.setPesel(personalInfoFx.getPesel());
		personalInfo.setSex(personalInfoFx.getSex());
		personalInfo.setBirth(OtherConverter.localDateToDate(personalInfoFx.getBirth()));
		personalInfo.setPhone(personalInfoFx.getPhone());
		personalInfo.setEmail(personalInfoFx.getEmail());
		personalInfo.setStreet(personalInfoFx.getStreet());
		personalInfo.setHouse(personalInfoFx.getHouse());
		personalInfo.setZip(personalInfoFx.getZip());
		personalInfo.setCity(personalInfoFx.getCity());
		personalInfo.setPhoto(personalInfoFx.getPhoto());
		return personalInfo;
	}
	
}
