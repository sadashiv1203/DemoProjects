package com.spring.controllers;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// spring will automatically initialize the class having a @ controller annotations & register 
// that class with the spring container

// Webapplication context is used to intialize the object of controller class.
//& it calls using the dispatcher servlet xml file.


@Controller
public class MomController 
{  
	@Autowired
	MyBean mybean;
	
	@ResponseBody //this is to write the response body to http protocol
	@RequestMapping("/sugar")
	public String giveSugar()
	{
		return "take Suger";
	}
	
	@RequestMapping("/testing1")
	public void test(MockHttpServletResponse response) throws UnsupportedEncodingException
	{
		response.getWriter().write("old website name:"+mybean.getWebsiteName());
		mybean.setWebsiteName("sadashiv website");
		response.getWriter().write("updated website name:"+mybean.getWebsiteName());
	}
	
	
	
    
}
