package com.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dao.FlightDetailsDao;
import com.dao.FlightDetailsDaoImpl;
@Entity
@Table (name ="FlightDetails")
public class FlightDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="flightdtlsid")
	private int flightDtlsId;
	
	@Column(name="flightcode")
	private String flightCode;
	
	@Column(name="deploccode")
	private String depLocCode;
	
	@Column(name="arrloccode")
	private String arrLocCode;
	
	@Column(name="deptime")
	private Date depTime;
	
	@Column(name="arrtime")
	private Date arrTime;
	
	@Column(name="price")
	private double price;
	
	public FlightDetails() {
		
	}
	public FlightDetails(String flightCode, String depLocCode, String sttLocCode, Date depTime, Date arrTime,
			double price) {
		super();
		this.flightCode = flightCode;
		this.depLocCode = depLocCode;
		this.arrLocCode = sttLocCode;
		this.depTime = depTime;
		this.arrTime = arrTime;
		this.price = price;
	}

	
	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public String getDepLocCode() {
		return depLocCode;
	}

	public void setDepLocCode(String depLocCode) {
		this.depLocCode = depLocCode;
	}

	public String getSttLocCode() {
		return arrLocCode;
	}

	public void setSttLocCode(String sttLocCode) {
		this.arrLocCode = sttLocCode;
	}

	public Date getDepTime() {
		return depTime;
	}

	public void setDepTime(Date depTime) {
		this.depTime = depTime;
	}

	public Date getArrTime() {
		return arrTime;
	}

	public void setArrTime(Date arrTime) {
		this.arrTime = arrTime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public  List<FlightDetails>  getFlightDtls() {
		FlightDetailsDao flightDtls=new FlightDetailsDaoImpl();
			return	flightDtls.getFlightDetailsList();
	}
	public  List<Flight>  getFlightCodesList() {
		FlightDetailsDao flightDtls=new FlightDetailsDaoImpl();
			return	flightDtls.getFlightCodesList();
	}
	public  List<Location>  getLocCodesList() {
		FlightDetailsDao flightDtls=new FlightDetailsDaoImpl();
			return	flightDtls.getLocCodesList();
	}
}
