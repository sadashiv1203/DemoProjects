package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class RegFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		String fno=request.getParameter("fno");
		
		if(fno.equals("1"))
		{
			String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			String mname=request.getParameter("mname");
			
			session.setAttribute("fname", fname);
			session.setAttribute("lname", lname);
			session.setAttribute("mname", mname);
			
			response.sendRedirect("./Form2.html");
			
		}
		
		if(fno.equals("2"))
		{
			String contact=request.getParameter("contact");
			String email=request.getParameter("email");
			String address=request.getParameter("address");
			
			session.setAttribute("contact", contact);
			session.setAttribute("email", email);
			session.setAttribute("address", address);
			
			response.sendRedirect("./Form3.html");
			
		}
		
		if(fno.equals("3"))
		{
			
			String Qual=request.getParameter("qual");
			String per=request.getParameter("per");
			
			String fname=(String)session.getAttribute("fname");
			String lname=(String)session.getAttribute("lname");
			String mname=(String)session.getAttribute("mname");
			String contact=(String)session.getAttribute("contact");
			String email=(String)session.getAttribute("email");
			String address=(String)session.getAttribute("address");
			
			out.println("<pre>");
			out.println("Fname:-"+fname);
			out.println("Lname:-"+lname);
			out.println("Mname:-"+mname);
			out.println("Contact:-"+contact);
			out.println("Email:-"+email);
			out.println("Address:-"+address);
			out.println("Qualification:-"+Qual);
			out.println("Per:-"+per);
			out.println("</pre>");
			
			
		}
		
	}

	
}
