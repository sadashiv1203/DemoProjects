package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class StudentRegistrationServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
	String Username=null;
	String Password=null;
	String Driver=null;
	String Url=null;
	@Override
	public void init(ServletConfig config) throws ServletException 
	{
		Username=config.getInitParameter("Username");
		Password=config.getInitParameter("Password");
		
		ServletContext servletcontext=config.getServletContext();
		
		Driver=servletcontext.getInitParameter("Driver");
		Url=servletcontext.getInitParameter("Url");
		
		
	}
	
	
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
    {
    	
    	PrintWriter out=res.getWriter();
    	out.println("<pre>");
    	out.println("Username"+Username);
    	out.println("Password:"+Password);
    	out.println("Driver"+Driver);
    	out.println("Url:"+Url);
    	out.println("</pre>");
    	
    }
    
    
    @Override
    public void destroy() {
    	Username=null;
    	Password=null;
    	Driver=null;
    	Url=null;
    	
    }

}
