package com.scope.mvc2;



import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.jsf.el.WebApplicationContextFacesELResolver;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationIntialiser2 implements WebApplicationInitializer {

	public void onStartup(ServletContext arg0) throws ServletException 
	{
		AnnotationConfigWebApplicationContext webApplocationContext=new AnnotationConfigWebApplicationContext();
		webApplocationContext.register(AppConfig2.class);
		
		
		DispatcherServlet dispatcher2=new DispatcherServlet(webApplocationContext);
		
		ServletRegistration.Dynamic myCustomDispatcherServle2=arg0.addServlet("myDispatcherServlet2", dispatcher2);
		
		myCustomDispatcherServle2.setLoadOnStartup(1);
		
		myCustomDispatcherServle2.addMapping("/appliaction2/");
		
		
	}

}
