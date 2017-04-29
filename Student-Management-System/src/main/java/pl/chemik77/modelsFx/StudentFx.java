package pl.chemik77.modelsFx;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class StudentFx {

	private IntegerProperty id = new SimpleIntegerProperty();
	private StringProperty document = new SimpleStringProperty();
	private StringProperty first = new SimpleStringProperty();
	private StringProperty last = new SimpleStringProperty();
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
	
	public int getId() {
		return id.get();
	}
	public IntegerProperty idProperty() {
		return id;
	}
	public void setId(int id) {
		this.id.set(id);
	}
	public String getDocument() {
		return document.get();
	}
	public StringProperty documentProperty() {
		return document;
	}
	public void setDocument(StringProperty document) {
		this.document = document;
	}
	public String getFirst() {
		return first.get();
	}
	public StringProperty firstProperty() {
		return first;
	}
	public void setFirst(String first) {
		this.first.set(first);;
	}
	public String getLast() {
		return last.get();
	}
	public StringProperty lastProperty() {
		return last;
	}
	public void setLast(String last) {
		this.last.set(last);
	}
	public String getPesel() {
		return pesel.get();
	}
	public StringProperty peselProperty() {
		return pesel;
	}
	public void setPesel(String pesel) {
		this.pesel.set(pesel);
	}
	public int getSex() {
		return sex.get();
	}
	public IntegerProperty sexProperty() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex.set(sex);
	}
	public LocalDate getBirth() {
		return birth.get();
	}
	public ObjectProperty<LocalDate> birthProperty() {
		return birth;
	}
	public void setBirth(LocalDate birth) {
		this.birth.set(birth);;
	}
	public String getPhone() {
		return phone.get();
	}
	public StringProperty phoneProperty() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone.set(phone);;
	}
	public String getEmail() {
		return email.get();
	}
	public StringProperty emailProperty() {
		return email;
	}
	public void setEmail(String email) {
		this.email.set(email);;
	}
	public String getStreet() {
		return street.get();
	}
	public StringProperty streetProperty() {
		return street;
	}
	public void setStreet(String street) {
		this.street.set(street);;
	}
	public String getHouse() {
		return house.get();
	}
	public StringProperty houseProperty() {
		return house;
	}
	public void setHouse(String house) {
		this.house.set(house);;
	}
	public String getZip() {
		return zip.get();
	}
	public StringProperty zipProperty() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip.set(zip);;
	}
	public String getCity() {
		return city.get();
	}
	public StringProperty cityProperty() {
		return city;
	}
	public void setCity(String city) {
		this.city.set(city);;
	}
	public String getPhoto() {
		return photo.get();
	}
	public StringProperty photoProperty() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo.set(photo);;
	}
	
	
}
