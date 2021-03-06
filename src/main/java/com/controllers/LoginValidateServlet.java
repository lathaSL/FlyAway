package com.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.dto.UserAdmin;
import com.dao.UserDaoImpl;

/**
 * Servlet implementation class LoginValidate
 */
public class LoginValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		UserAdmin user=new UserAdmin (userName,pwd,"admin");
		UserDao dao = new UserDaoImpl();
		boolean isValid=dao.validateUser(user) ;
		if (isValid) {
			HttpSession session=request.getSession();
			session.setAttribute	("adminname", user.getUserName());
			response.sendRedirect("admin.jsp");
		}
		else {
			String message="Invalid Credentials!!";
			request.setAttribute("message", message);
			request.getRequestDispatcher("/home.jsp").forward(request, response);
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
