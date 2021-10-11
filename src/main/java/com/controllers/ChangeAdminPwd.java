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
 * Servlet implementation class ChangeAdminPwd
 */
public class ChangeAdminPwd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeAdminPwd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();

		String userName=(String)session.getAttribute("adminname");
		String pwd=request.getParameter("pwd");
		String newPwd=request.getParameter("newpwd");

		UserAdmin user=new UserAdmin (userName,pwd,"admin");
		UserDao dao = new UserDaoImpl();
		
		boolean isValid=dao.changePwd(user,newPwd);
		if (isValid) {
			
			session.setAttribute	("uname", user.getUserName());
			request.setAttribute("message", "Password Changed Successfully!!");
			request.getRequestDispatcher("/admin.jsp").forward(request, response);
//			response.sendRedirect("admin.jsp");
		}
		else {
			request.setAttribute("message", "Error in password reset!!");
			request.getRequestDispatcher("/err.jsp").forward(request, response);
//			response.sendRedirect("err.jsp");
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
