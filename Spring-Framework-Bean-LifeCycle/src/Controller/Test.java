package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		((AbstractApplicationContext)context).registerShutdownHook();
		Restaurant resta=(Restaurant)context.getBean("reastauratBean");
		resta.greetCustomer();

	}

}
