package com.controllers;

import java.io.IOException;

import javax.persistence.Column;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.dao.UserDetailsDao;
import com.dao.UserDetailsDaoImpl;
import com.dto.UserAdmin;
import com.dto.UserDetails;

/**
 * Servlet implementation class InsertAdmin
 */
public class UserDetailsMaintain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserDetailsMaintain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String firstName=request.getParameter("fname");
		 String lname=request.getParameter("lname");
		 int age=Integer.parseInt(request.getParameter("age"));
		 String addr=request.getParameter("addr");
		 String city=request.getParameter("city");
		 String country=request.getParameter("coun");
		 int persCnt=Integer.parseInt(request.getParameter("count"));

		UserDetails userdtls=new UserDetails(firstName,lname,age,addr,city,country,persCnt);
		UserDetailsDao dao = new UserDetailsDaoImpl();
		int userId=dao.addUser(userdtls) ;
		if (userId >0) {
			HttpSession session=request.getSession();
			session.setAttribute	("fname", firstName);
			session.setAttribute	("count", request.getParameter("count"));

			response.sendRedirect("bookticket.jsp");
		}
		else {
			String message="Error occurred while adding user details!!";
			request.setAttribute("message", message);
			request.getRequestDispatcher("/err.jsp").forward(request, response);
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
