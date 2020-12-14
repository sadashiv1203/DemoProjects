package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String address=req.getParameter("address");
		
		boolean b=false;
		
		if(name.equals(""))
		{
			b=false;
			out.println("name is required");
		}
		
		if(email.equals(""))
		{
			b=false;
			out.println("email is required");
		}
		
		if(address.equals(""))
		{
			b=false;
			out.println("address is required");
		}
		else
		{
			b=true;
		}
		
		
		
		if(b==true)
			
		{
			System.out.println("Validation Servlet");
			RequestDispatcher rd=req.getRequestDispatcher("next");
			System.out.println("Validation Next");
			rd.forward(req, resp);
			System.out.println("Success");
		}
		
		
		
		
		
		
	}

}
