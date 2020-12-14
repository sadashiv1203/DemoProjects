package com.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentSchoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext contextObj=new ClassPathXmlApplicationContext("Beans.xml");
		//after this statement only singleton classes are gets initialised......
		
		// but if from singleton class prototype object gets injected then 
		//in that case prototype object gets initialised
		
		Student obj2=contextObj.getBean("student",Student.class);// in prototype scope , objects gets initialsed 
		// when getBean method calls
		
		School obj3=contextObj.getBean("school",School.class);
		School obj4=contextObj.getBean("school",School.class);
		
		System.out.println("obj3:"+obj3);
		System.out.println("obj4:"+obj4);
		
		System.out.println("Student Obj3:"+obj3.getStudent());// even student object prototype return same hash code
		System.out.println("Student Obj4:"+obj4.getStudent());
		
		//singleton School object created.......
		//prototype Student object created.......
		//prototype Student object created.......
		//obj3:com.bean.scope.School@63a12c68
		//obj4:com.bean.scope.School@63a12c68
		//Student Obj3:com.bean.scope.Student@28f3b248
		//Student Obj4:com.bean.scope.Student@28f3b248
		
		//=============================================================================
		// after adding the proxy type proxyMode = ScopedProxyMode.TARGET_CLASS using CG lib
		
		//obj3:com.bean.scope.School@642a7222
		//obj4:com.bean.scope.School@642a7222
		//prototype Student object created.......
		//Student Obj3:com.bean.scope.Student@2eea88a1
		//prototype Student object created.......
		//Student Obj4:com.bean.scope.Student@7ac296f6
		
		
		
		
		
		

	}

}
