package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.FlightDetailsDao;
import com.dao.FlightDetailsDaoImpl;
import com.dto.FlightDetails;

/**
 * Servlet implementation class FlightSearchServlet
 */
@WebServlet("/searchres")
public class FlightSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightSearchServlet() {
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
		String  depTime=request.getParameter("datepicker");
//		try {
//			depTime = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("datepicker"));
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
////		
//		
//		FlightDetailsDao flightutil=new FlightDetailsDaoImpl();
//			List <Object> fltdtls=flightutil.getFlightDetailsList(FlgtCode,depLocCode,arrLocCode,depTime);
//			if (!fltdtls.isEmpty()) {
//				PrintWriter out=response.getWriter();
//				for (Object object : fltdtls) {
//					
//					
//					
//				}
//				
//				response.sendRedirect("addflightdtls.jsp");
//			}
//			else {
//				
//				response.sendRedirect("err.jsp");
//			}
//		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
