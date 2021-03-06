package com.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.FlightDao;
import com.dao.FlightDaoImpl;
import com.dto.Flight;

/**
 * Servlet implementation class FlightMaintain
 */
public class FlightMaintain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightMaintain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Flight flight=new Flight(request.getParameter("flightCode"),request.getParameter("flightName"));
		FlightDao flightutil=new FlightDaoImpl();
		if (request.getParameter("type").equals("Add")) {
			int flightId=flightutil.AddFlight(flight);
			String message;
			if (flightId >0) {
				message="Location added Successfully!";
				request.setAttribute("message", message);
				request.getRequestDispatcher("/flights.jsp").forward(request, response);

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
