package pl.chemik77.modelsFx.fx;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PersonalInfoFx {
	
	private IntegerProperty personalInfoID = new SimpleIntegerProperty();
	private StringProperty pesel = new SimpleStringProperty();
	private IntegerProperty sex = new SimpleIntegerProperty();
	private ObjectProperty<LocalDate> birth = new SimpleObjectProperty<>();
	private StringProperty phone = new SimpleStringProperty();
	private StringProperty email = new SimpleStringProperty();
	private StringProperty street = new SimpleStringProperty();
	private StringProperty house = new SimpleStringProperty();
	private StringProperty zip = new SimpleStringProperty();
	private StringProperty city = new SimpleStringProperty();
	private StringProperty photo = new SimpleStringProperty();
	
	
	public IntegerProperty personalInfoIDProperty() {
		return this.personalInfoID;
	}
	
	public int getPersonalInfoID() {
		return this.personalInfoIDProperty().get();
	}
	
	public void setPersonalInfoID(int personalInfoID) {
		this.personalInfoIDProperty().set(personalInfoID);
	}
	
	public StringProperty peselProperty() {
		return this.pesel;
	}
	
	public String getPesel() {
		return this.peselProperty().get();
	}
	
	public void setPesel(String pesel) {
		this.peselProperty().set(pesel);
	}
	
	public IntegerProperty sexProperty() {
		return this.sex;
	}
	
	public int getSex() {
		return this.sexProperty().get();
	}
	
	public void setSex(int sex) {
		this.sexProperty().set(sex);
	}
	
	public ObjectProperty<LocalDate> birthProperty() {
		return this.birth;
	}
	
	public LocalDate getBirth() {
		return this.birthProperty().get();
	}
	
	public void setBirth(LocalDate birth) {
		this.birthProperty().set(birth);
	}
	
	public StringProperty phoneProperty() {
		return this.phone;
	}
	
	public String getPhone() {
		return this.phoneProperty().get();
	}
	
	public void setPhone(String phone) {
		this.phoneProperty().set(phone);
	}
	
	public StringProperty emailProperty() {
		return this.email;
	}
	
	public String getEmail() {
		return this.emailProperty().get();
	}
	
	public void setEmail(String email) {
		this.emailProperty().set(email);
	}
	
	public StringProperty streetProperty() {
		return this.street;
	}
	
	public String getStreet() {
		return this.streetProperty().get();
	}
	
	public void setStreet(String street) {
		this.streetProperty().set(street);
	}
	
	public StringProperty houseProperty() {
		return this.house;
	}
	
	public String getHouse() {
		return this.houseProperty().get();
	}
	
	public void setHouse(String house) {
		this.houseProperty().set(house);
	}
	
	public StringProperty zipProperty() {
		return this.zip;
	}
	
	public String getZip() {
		return this.zipProperty().get();
	}
	
	public void setZip(String zip) {
		this.zipProperty().set(zip);
	}
	
	public StringProperty cityProperty() {
		return this.city;
	}
	
	public String getCity() {
		return this.cityProperty().get();
	}
	
	public void setCity(String city) {
		this.cityProperty().set(city);
	}
	
	public StringProperty photoProperty() {
		return this.photo;
	}
	
	public String getPhoto() {
		return this.photoProperty().get();
	}
	
	public void setPhoto(String photo) {
		this.photoProperty().set(photo);
	}
	
}
