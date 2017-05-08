package pl.chemik77.database.models;

import java.util.Date;

import com.j256.ormlite.field.DatabaseField;

public class PersonalInfo implements BaseModel {
	
	@DatabaseField(generatedId = true)
	private int personalInfoID;
	
	@DatabaseField(columnName = "pesel", unique = true)
	private String pesel;
	
	@DatabaseField(columnName = "sex")
	private char sex;
	
	@DatabaseField(columnName = "date_birth")
	private Date birth;
	
	@DatabaseField(columnName = "phone_number")
	private String phone;
	
	@DatabaseField(columnName = "email")
	private String email;
	
	@DatabaseField(columnName = "street")
	private String street;
	
	@DatabaseField(columnName = "house_number")
	private String house;
	
	@DatabaseField(columnName = "zip_code")
	private String zip;
	
	@DatabaseField(columnName = "city")
	private String city;
	
	@DatabaseField(columnName = "photo_url")
	private String photo;

	public int getId() {
		return personalInfoID;
	}

	public void setId(int id) {
		this.personalInfoID = id;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
}
