package com.dao;

import java.util.Date;
import java.util.List;

import com.dto.Flight;
import com.dto.FlightDetails;
import com.dto.FlightSearchResult;
import com.dto.Location;

public interface FlightDetailsDao {
	public int AddFlightDetails(FlightDetails flightDtls);
	public boolean RemoveFlightDetails (FlightDetails flightDtls);
	public  List<FlightDetails>  getFlightDetailsList ();
	public  List<FlightDetails>  getFlightDetailsList (String FlgtCode,String depLoc, String arrLoc,String depDate);
	public  List<FlightDetails>  getFlightDetailsList (String flgtDtlsId);
	public  List<Flight>  getFlightCodesList ();
	public  List<Location>  getLocCodesList ();
	

}
