package com.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminMaintainServlet
 */
public class AdminMaintainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminMaintainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getParameter("maintainType").equals("addAdmin")) {
			
			response.sendRedirect("/FlyAway/addadmin.jsp");
		}
		else if (request.getParameter("maintainType").equals("locMaintain")) {
			response.sendRedirect("/FlyAway/locations.jsp");
		}
		else if (request.getParameter("maintainType").equals("airMaintain")) {
			response.sendRedirect("/FlyAway/addflightdtls.jsp");
			}
		
		else if (request.getParameter("maintainType").equals("flightMaintain")) {
			
			response.sendRedirect("/FlyAway/flights.jsp");

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
