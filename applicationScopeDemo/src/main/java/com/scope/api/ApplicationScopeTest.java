package com.scope.api;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class ApplicationScopeTest 
{
    private int no=0;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public ApplicationScopeTest() 
	{
		System.out.println("ApplicationScopeTest called.....");
	}
    
    
}
