package com.controllers;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.FlightDetailsDao;
import com.dao.FlightDetailsDaoImpl;
import com.dto.Flight;
import com.dto.FlightDetails;
import com.dto.Location;

/**
 * Servlet implementation class FlightDetailsMaintain
 */
public class FlightDetailsMaintain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightDetailsMaintain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flgtId=request.getParameter("flightId");
		Flight flight=new Flight();
		flight=flight.getFlight(Integer.parseInt(flgtId));
				
		String depLocId=request.getParameter("depLocId");
		Location deploc=new Location();
		deploc=deploc.getLocation(Integer.parseInt(depLocId));
		
		String arrLocId=request.getParameter("arrLocId");
		Location arrloc=new Location();
			arrloc=arrloc.getLocation(Integer.parseInt(arrLocId));

		
		Date depTime=null;
		try {
			depTime = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").parse(request.getParameter("depTime"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date arrTime=null;
		try {
			arrTime = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").parse(request.getParameter("arrTime"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double price=Double.parseDouble(request.getParameter("price"));
		
		
		
		
		FlightDetails flightdtls=new FlightDetails(flight,deploc,arrloc,depTime, arrTime,price);
		FlightDetailsDao flightutil=new FlightDetailsDaoImpl();
		if (request.getParameter("type").equals("Add")) {
			int flightId=flightutil.AddFlightDetails(flightdtls);
			String message;
			if (flightId >0) {
				message="Location added Successfully!";
				request.setAttribute("message", message);
				request.getRequestDispatcher("/addflightdtls.jsp").forward(request, response);

			}
			else {
				message="Error occurred while adding Flight Details!!";
				request.setAttribute("message", message);
				request.getRequestDispatcher("/err.jsp").forward(request, response);}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
