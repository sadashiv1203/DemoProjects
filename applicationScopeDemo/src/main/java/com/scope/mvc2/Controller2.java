package com.scope.mvc2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scope.api.ApplicationScopeTest;
import com.scope.api.SingletonTest;

@Controller
@RequestMapping("/app2")
public class Controller2 
{
	@Autowired
	private ApplicationScopeTest appScopeTest;
	
	private SingletonTest singletonTest;
	
	@ResponseBody
	@RequestMapping("/changeDefaultValue")
	public String test()
	{
		appScopeTest.setNo(5);
		
		return "appScopeTest"+appScopeTest.getNo()+" singletonTest:"+singletonTest.getNo();
	}
	
	

}
