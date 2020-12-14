package com.scope.mvc1;



import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.jsf.el.WebApplicationContextFacesELResolver;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationIntialiser1 implements WebApplicationInitializer {

	public void onStartup(ServletContext arg0) throws ServletException 
	{
		AnnotationConfigWebApplicationContext webApplocationContext=new AnnotationConfigWebApplicationContext();
		webApplocationContext.register(AppConfig1.class);
		
		
		DispatcherServlet dispatcher1=new DispatcherServlet(webApplocationContext);
		
		ServletRegistration.Dynamic myCustomDispatcherServle=arg0.addServlet("myDispatcherServlet1", dispatcher1);
		
		myCustomDispatcherServle.setLoadOnStartup(1);
		
		myCustomDispatcherServle.addMapping("/appliaction1/");
		
		
	}

}
