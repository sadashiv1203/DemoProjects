package spring.core.annotations;

import org.springframework.stereotype.Component;

@Component
public class ServiceImplement implements Service 
{

    
	public void servicing() 
	{
		System.out.println("override service implementation.......");
		
	}

}
