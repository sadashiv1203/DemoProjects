package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Registration Servlet");
        PrintWriter out=resp.getWriter();
		
       System.out.println("Registration Servlet");
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String address=req.getParameter("address");
		
		out.println("<pre>");
		out.println("Name"+name);
		out.println("Email"+email);
		out.println("Address"+address);
		out.println("Success:)");
		out.println("</pre>");
		
		
		
	}

}
