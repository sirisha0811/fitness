package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Appointment {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotBlank
	@NotNull
	@Pattern(regexp ="^[a-zA-Z\s]+$")
	private String name;
	
	@NotNull
	@NotBlank
	@Pattern(regexp = "[0-9 ]+")
	private Integer age;
	
	@Email
	@NotNull
	@NotBlank
	@Size(max = 30)
	private String email;
	
	@NotNull
	@NotBlank
	@Pattern(regexp = "[0-9 ]+")
	@Size(max = 12)
	private String mobileNo;
	
	@NotNull
	@NotBlank
	@Size(max = 50)
	private String addressLine1 ;
	
	@Size(max = 50)
	private String addressLine2 ;
	
	@NotBlank
	@NotNull
	@Size(max = 25)
	@Pattern(regexp ="^[a-zA-Z\s]+$")
	private String city ;
	
	@NotBlank
	@NotNull
	@Size(max = 25)
	@Pattern(regexp ="^[a-zA-Z\s]+$")
	private String state;
	
	@NotBlank
	@NotNull
	@Pattern(regexp ="^[a-zA-Z\s]+$")
	private String country ;
	
	@NotBlank
	@NotNull
	@Pattern(regexp = "[0-9 ]+")
	@Size(max = 7)
	private Integer pincode;
	
	@Pattern(regexp = "^(?:male|female)$")
	private String trainerPreference;
	
	@Pattern(regexp = "^(?:Yes|No)$")
	private String physiotherapistrequirement;
	
	@Pattern(regexp = "^(?:yes|no)$")
	private String selectpackage ;
	
	@Pattern(regexp = "[0-9 ]+")
	private Integer weeks;
	
	@Pattern(regexp = "[0-9 ]+")
	private Integer amount;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getTrainerPreference() {
		return trainerPreference;
	}
	public void setTrainerPreference(String trainerPreference) {
		this.trainerPreference = trainerPreference;
	}
	public String getPhysiotherapistrequirement() {
		return physiotherapistrequirement;
	}
	public void setPhysiotherapistrequirement(String physiotherapistrequirement) {
		this.physiotherapistrequirement = physiotherapistrequirement;
	}
	public String getSelectpackage() {
		return selectpackage;
	}
	public void setSelectpackage(String selectpackage) {
		this.selectpackage = selectpackage;
	}
	public Integer getWeeks() {
		return weeks;
	}
	public void setWeeks(Integer weeks) {
		this.weeks = weeks;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	

	
	
}
