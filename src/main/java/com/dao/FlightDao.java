package com.dao;

import java.util.List;

import com.dto.Flight;

public interface FlightDao {
	public int AddFlight(Flight flight);
	public boolean RemoveFlight (Flight flight);
	public  List<Flight>  getFlightList ();

}
