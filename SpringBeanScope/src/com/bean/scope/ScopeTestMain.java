package com.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext contextObj1=new ClassPathXmlApplicationContext("Beans.xml");
		ScopeTest obj1=contextObj1.getBean("scopeTest",ScopeTest.class);
		ScopeTest obj2=contextObj1.getBean("scopeTest",ScopeTest.class);
		
		System.out.println(obj1.hashCode()+"  "+obj1.hashCode());
		
		ApplicationContext contextObj3=new ClassPathXmlApplicationContext("Beans.xml");
		ScopeTest obj5=contextObj3.getBean("scopeTest",ScopeTest.class);
		ScopeTest obj6=contextObj3.getBean("scopeTest",ScopeTest.class);
		
		System.out.println(obj5.hashCode()+"  "+obj6.hashCode());
		
		ApplicationContext contextObj2=new ClassPathXmlApplicationContext("Beans2.xml");
		ScopeTest obj3=contextObj2.getBean("scopeTest",ScopeTest.class);
		ScopeTest obj4=contextObj2.getBean("scopeTest",ScopeTest.class);
		
		System.out.println(obj3.hashCode()+"  "+obj4.hashCode());
		
		//singleton class scope is limited to the application context object reference
		
		
		
		

	}

}
