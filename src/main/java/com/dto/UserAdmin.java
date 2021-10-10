package com.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name ="useradmin")
public class UserAdmin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userid")
	private int userid;
	
	@Column(name="LoginName")
	private String userName;

	@Column(name="Password")	
	private String pwd;
	
	@Column(name="Role")	
	private String userType;
	
	public UserAdmin() {
		
	}
	public String getUserName() {
		return userName;
		
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUserType() {
		return userType;
		
	}
	public void setuserType(String userType) {
		this.userType = userType;
	}
	public UserAdmin(String userName, String pwd, String userType) {
		super();
		this.userName = userName;
		this.pwd = pwd;
		this.userType = userType;
	}
	

}
