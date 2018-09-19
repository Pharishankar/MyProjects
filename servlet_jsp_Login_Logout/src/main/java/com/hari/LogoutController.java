package  com.hari;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController extends HttpServlet
{
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		
		System.out.println("Logout doPost method...");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("thanq you!!, Your session was destroyed successfully!!");
		HttpSession session=request.getSession(false);
		response.sendRedirect("login1.html");
		// session.setAttribute("user", null);
		
		session.removeAttribute("user");
		session.getMaxInactiveInterval();

	}
	
	
}
