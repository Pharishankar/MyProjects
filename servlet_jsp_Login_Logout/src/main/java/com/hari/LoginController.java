package com.hari;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginController extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		System.out.println("Login doPost method..");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String un=request.getParameter("uname");
		String pwd=request.getParameter("pass");
		
		
		if (un.equals("hari") && pwd.equals("shankar")) {
			pw.println("Welcome,"+un);
			HttpSession session=request.getSession(true);//reuse existing..
															//session if exist create one 
			session.setAttribute("user",un);
			session.setMaxInactiveInterval(30);//30 seconds..
			response.sendRedirect("index.jsp");
		}else{
			RequestDispatcher rd=request.getRequestDispatcher("login1.html");
			pw.println("<h2><i>Enter user name and password is wrong</i></h2>");
			rd.include(request, response);
		}//if
		
	}//method

	
}//class
