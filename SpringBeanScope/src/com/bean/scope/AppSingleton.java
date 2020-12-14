package com.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSingleton 
{
	public static void main(String[] args) 
	{
		ApplicationContext contextObj=new ClassPathXmlApplicationContext("Beans.xml");
		SingletoneDemo obj1=contextObj.getBean("singletoneDemo",SingletoneDemo.class);
		SingletoneDemo obj2=contextObj.getBean("singletoneDemo",SingletoneDemo.class);
		
		System.out.println(obj1+"  "+obj2);// get same hashcode for both the objects
		
		
	}
	
	
}
