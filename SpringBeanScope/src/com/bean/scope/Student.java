package com.bean.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
@Scope(value="prototype")
public class Student 
{
	
	private String name;
	
	public Student() {
		System.out.println("prototype Student object created.......");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
