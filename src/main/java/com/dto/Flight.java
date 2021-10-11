package com.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dao.FlightDao;
import com.dao.FlightDaoImpl;
@Entity
@Table (name ="flights")
public class Flight {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="flightid")
	private int flightId;
	
	@Column(name="flightCode")
	private String flightCode;
	
	@Column(name="flightName")
	private String flightName;
	public Flight() {
		
	}
	public Flight(String flightCode, String flightName) {
		super();
		this.flightCode = flightCode;
		this.flightName = flightName;
	}
	public Flight(int flightId, String flightCode, String flightName) {
		super();
		this.flightId = flightId;
		this.flightCode = flightCode;
		this.flightName = flightName;
	}

	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public  List<Flight>  getFlights() {
		FlightDao flight=new FlightDaoImpl();
			return	flight.getFlightList();
	}
	
	public Flight getFlight(int flightId) {
		FlightDao flight=new FlightDaoImpl();
		return	flight.getFlight(flightId);
}
	public  String getFlightName(int flightId) {
		FlightDao flight=new FlightDaoImpl();
			return	flight.getFlightName(flightId);
	}
	public  String getFlightCode(int flightId) {
		FlightDao flight=new FlightDaoImpl();
			return	flight.getFlightCode(flightId);
	}
	

}
