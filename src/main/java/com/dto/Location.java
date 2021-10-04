package com.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dao.LocationDao;
import com.dao.LocationDaoImpl;
@Entity
@Table (name ="locations")
public class Location {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="locid")
	private int locId;
	
	@Column(name="locCode")
	private String locCode;
	
	@Column(name="locName")
	private String locName;
	public Location() {
		
	}
	public Location(String locCode, String locName) {
		super();
		this.locCode = locCode;
		this.locName = locName;
	}

	public String getLocCode() {
		return locCode;
	}

	public void setLocCode(String locCode) {
		this.locCode = locCode;
	}

	public String getLocName() {
		return locName;
	}

	public void setLocName(String locName) {
		this.locName = locName;
	}
	public  List<Location>  getLocations() {
		LocationDao loc=new LocationDaoImpl();
			return	loc.getLocList();
	}

}
