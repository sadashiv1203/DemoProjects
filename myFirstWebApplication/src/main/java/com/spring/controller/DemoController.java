package com.spring.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class DemoController 
{
	
	@Autowired
	MyBean mybean;
	
	
	@ResponseBody  //if you are not using responsebody annotation then you will get 404 error
	// then it will consider "test" as page name
	@RequestMapping("/test")
	public String Test()
	{
		return "test";
	}
	
	@ResponseBody
	@RequestMapping("/data")
	public String Data()
	{
		return "Data";
	}
	
	@RequestMapping("/mrf")
	public String Mrf()
	{
		//return "/WEB-INF/jsp/mrfBat.jsp"; second technique
		return "mrfBat";// this is done using InternalResourceViewResolver class & inject prefix & suffix values using setter methods
	}
	
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest req, Model model)
	{
		//return "/WEB-INF/jsp/mrfBat.jsp"; second technique
		
		String userEnteredValue=req.getParameter("foodType");
		model.addAttribute("userValue",userEnteredValue);
		
		return "process-order";// this is done using InternalResourceViewResolver class & inject prefix & suffix values using setter methods
	}
	
	@RequestMapping("/testing1")
	public void test(HttpServletResponse response) throws IOException
	{
		response.getWriter().write("old website name:"+mybean.getWebsiteName());
		mybean.setWebsiteName("sadashiv website");
		response.getWriter().write("updated website name:"+mybean.getWebsiteName());
	}
	
	
	
	

}
