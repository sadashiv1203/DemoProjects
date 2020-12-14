package com.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppPrototype 
{
	public static void main(String[] args) 
	{
		ApplicationContext contextObj=new ClassPathXmlApplicationContext("Beans.xml");
		
		PrototypeDemo obj1=contextObj.getBean("prototypeDemo",PrototypeDemo.class);
		PrototypeDemo obj2=contextObj.getBean("prototypeDemo",PrototypeDemo.class);
		
		if(obj1==obj2)
		{
			System.out.println("hashcode is same");
		}
		else
		{
			System.out.println("hashcode is different");// becouse both object is different
		}
		
	}

}
