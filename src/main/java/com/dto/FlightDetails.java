package com.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import javax.persistence.ForeignKey;


import com.dao.FlightDetailsDao;
import com.dao.FlightDetailsDaoImpl;
@Entity
@Table (name ="FlightDetails")
public class FlightDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="flightdtlsid")
	private int flightDtlsId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="flightid")
	@Where(clause= "flightid=flightid")
	private Flight flight;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="deplocid", foreignKey=@ForeignKey(name="deploc_id_foreign"))
	@Where(clause= "deplocid=locid")
	private Location deploc;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="arrlocid", foreignKey=@ForeignKey(name="arrloc_id_foreign"))
	@Where(clause= "arrlocid=locid")

	
	private Location arrloc;
	
	@Column(name="deptime")
	private Date depTime;
	
	@Column(name="arrtime")
	private Date arrTime;
	
	@Column(name="price")
	private double price;
	
	public FlightDetails() {
		
	}
	
	
	public int getFlightDtlsId() {
		return flightDtlsId;
	}


	public void setFlightDtlsId(int flightDtlsId) {
		this.flightDtlsId = flightDtlsId;
	}


	public Flight getFlight() {
		return flight;
	}


	public void setFlight(Flight flight) {
		this.flight = flight;
	}


	public Location getDeploc() {
		return deploc;
	}


	public void setDeploc(Location deploc) {
		this.deploc = deploc;
	}


	public Location getArrloc() {
		return arrloc;
	}


	public void setArrloc(Location arrloc) {
		this.arrloc = arrloc;
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


	public void setPrice(double price) {
		this.price = price;
	}


	public FlightDetails(int flightDtlsId, Flight flight, Location deploc, Location arrloc, Date depTime, Date arrTime,
			double price) {
		super();
		this.flightDtlsId = flightDtlsId;
		this.flight = flight;
		this.deploc = deploc;
		this.arrloc = arrloc;
		this.depTime = depTime;
		this.arrTime = arrTime;
		this.price = price;
	}

	public FlightDetails(Flight flight, Location deploc, Location arrloc, Date depTime, Date arrTime,
			double price) {
		super();
		this.flight = flight;
		this.deploc = deploc;
		this.arrloc = arrloc;
		this.depTime = depTime;
		this.arrTime = arrTime;
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
	
	public  List<FlightDetails>  getFlightDetailsList(String flightDtlsId) {
		FlightDetailsDao flightDtls=new FlightDetailsDaoImpl();
			return	flightDtls.getFlightDetailsList(flightDtlsId);
	}
	public  List<Location>  getLocCodesList() {
		FlightDetailsDao flightDtls=new FlightDetailsDaoImpl();
			return	flightDtls.getLocCodesList();
	}
	
	public  List<FlightDetails>  getFlightDetailsList (String flgtId,String depLocId, String arrLocId,String depDate){
		FlightDetailsDao flightDtls=new FlightDetailsDaoImpl();
		return	flightDtls.getFlightDetailsList(flgtId, depLocId,  arrLocId, depDate);
	
		
	}
	
}
