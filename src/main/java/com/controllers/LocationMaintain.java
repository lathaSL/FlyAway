package com.controllers;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.LocationDao;
import com.dao.LocationDaoImpl;
import com.dto.Location;

/**
 * Servlet implementation class LocationMaintain
 */
public class LocationMaintain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LocationMaintain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Location loc=new Location(request.getParameter("locCode"),request.getParameter("locName"));
		LocationDao locutil=new LocationDaoImpl();
		if (request.getParameter("type").equals("Add")) {
			int locId=locutil.AddLoc(loc);
			String message;
			if (locId >0) {
				message="Location added Successfully!";
				request.setAttribute("message", message);
				request.getRequestDispatcher("/locations.jsp").forward(request, response);
}
			else {
				message="Error occurred while adding location!!";
				request.setAttribute("message", message);
				request.getRequestDispatcher("/err.jsp").forward(request, response);
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
