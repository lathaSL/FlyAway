package com.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name ="userdetails")
public class UserDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userid")
	private int userid;
	
	@Column(name="fname")
	private String firstName;

	@Column(name="lname")	
	private String lastName;
	
	@Column(name="age")	
	private int age;
	
	@Column(name="addr")	
	private String address;
	
	@Column(name="city")	
	private String city;
	

	@Column(name="country")	
	private String country;
	

	@Column(name="perscnt")	
	private int persCnt;
	
	
	
	public int getUserid() {
		return userid;
	}



	public void setUserid(int userid) {
		this.userid = userid;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public int getPersCnt() {
		return persCnt;
	}



	public UserDetails(String firstName, String lastName, int age, String address, String city, String country,
			int persCnt) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.city = city;
		this.country = country;
		this.persCnt = persCnt;
	}



	public void setPersCnt(int persCnt) {
		this.persCnt = persCnt;
	}



	public UserDetails() {
		
	}	

}
