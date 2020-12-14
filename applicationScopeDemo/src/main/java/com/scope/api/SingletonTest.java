package com.scope.api;

import org.springframework.stereotype.Component;

@Component
public class SingletonTest {
	
	public SingletonTest() {
	  System.out.println("SingletonTest called.....");
	}

	private int no=0;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	

}
