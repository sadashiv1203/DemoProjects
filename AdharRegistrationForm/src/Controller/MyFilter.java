package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Init...............");
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		//PrintWriter out=resp.getWriter(); 
		
		//out.print("filter is invoked before"); 
		System.out.println("filter is invoked before");
	          
		chain.doFilter(req, resp);//sends request to next resource  
	          
	    //out.print("filter is invoked after");
		System.out.println("filter is invoked after");
		
	}

	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy...............");
		
	}

}
