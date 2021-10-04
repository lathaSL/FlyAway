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
import com.dto.FlightDetails;

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
		String FlgtCode=request.getParameter("flightCode");
		String depLocCode=request.getParameter("depLocCode");
		String arrLocCode=request.getParameter("arrLocCode");
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
		
		
		FlightDetails flight=new FlightDetails(FlgtCode,depLocCode,arrLocCode,depTime, arrTime,price);
		FlightDetailsDao flightutil=new FlightDetailsDaoImpl();
		if (request.getParameter("type").equals("Add")) {
			int flightId=flightutil.AddFlightDetails(flight);
			if (flightId >0) {
				
				response.sendRedirect("flightdetails.jsp");
			}
			else {
				
				response.sendRedirect("err.jsp");
			}
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
