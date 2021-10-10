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

public class FlightSearchResult {

	
	FlightDetails fltDtls =new FlightDetails();
//	fltDtls.;
//	private FlightDetails flightDtlsId ;
////
//	private Flight flightName;
//	private Location depLocName;
//	private Location arrLocName;
//	private FlightDetails depTime;
	private Date arrTime;
	private double price;
	
	public FlightSearchResult() {
		
	}
		
//	public int getFlightDtlsId() {
//		return flightDtlsId;
//	}
//
//	public void setFlightDtlsId(int flightDtlsId) {
//		this.flightDtlsId = flightDtlsId;
//	}
//
//	public String getFlightName() {
//		return flightName;
//	}
//
//	public void setFlightName(String flightName) {
//		this.flightName = flightName;
//	}
//
//	public String getDepLocName() {
//		return depLocName;
//	}
//
//	public void setDepLocName(String depLocName) {
//		this.depLocName = depLocName;
//	}
//
//	public String getArrLocName() {
//		return arrLocName;
//	}
//
//	public void setArrLocName(String arrLocName) {
//		this.arrLocName = arrLocName;
//	}
//
//	public Date getDepTime() {
//		return depTime;
//	}
//
//	public void setDepTime(Date depTime) {
//		this.depTime = depTime;
//	}

	public Date getArrTime() {
		return arrTime;
	}

	public void setArrTime(Date arrTime) {
		this.arrTime = arrTime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
//
//	public  List<FlightSearchResult>  getFlightDetailsList (String flgtCode,String depLoc, String arrLoc,String depDate){
//		FlightDetailsDao flightDtls=new FlightDetailsDaoImpl();
//		return	flightDtls.getFlightDetailsList(flgtCode, depLoc,  arrLoc, depDate);
//	
//		
//	}

//	public FlightSearchResult(int flightDtlsId, String flightName, String depLocName, String arrLocName, Date depTime,
//			Date arrTime, double price) {
//		super();
//		this.flightDtlsId = flightDtlsId;
//		this.flightName = flightName;
//		this.depLocName = depLocName;
//		this.arrLocName = arrLocName;
//		this.depTime = depTime;
//		this.arrTime = arrTime;
//		this.price = price;
//	}

	
}
