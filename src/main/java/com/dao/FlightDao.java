package com.dao;

import java.util.List;

import com.dto.Flight;

public interface FlightDao {
	public int AddFlight(Flight flight);
	public boolean RemoveFlight (Flight flight);
	public  List<Flight>  getFlightList ();
	public  String  getFlightName(int flightId);
	public  String  getFlightCode(int flightId);
	public  Flight  getFlight(int flightId);



}
