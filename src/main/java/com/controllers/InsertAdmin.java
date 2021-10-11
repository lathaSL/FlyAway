package com.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.dto.UserAdmin;

/**
 * Servlet implementation class InsertAdmin
 */
public class InsertAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		String role=request.getParameter("role");

		UserAdmin user=new UserAdmin (userName,pwd,role);
		UserDao dao = new UserDaoImpl();
		int userId=dao.insertUser(user) ;
		String message;
		if (userId >0) {
			message="User added Successfully!";
			request.setAttribute("message", message);
			request.getRequestDispatcher("/admin.jsp").forward(request, response);

		}
		else {
			message="Error occurred while adding user!!";
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
