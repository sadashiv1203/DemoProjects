package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		Restaurant resta1=(Restaurant) context.getBean("reastauratBean");
		Restaurant resta2=(Restaurant) context.getBean("reastauratBean");
		
		resta1.setwelcomeNote("one");
		resta1.greetCustomer();
		
		//resta2.setwelcomeNote("Two");  //if the bean scope is prototype then bean creates a different objects
		                                 //if the bean scope is singleton then bean can not create new instance same copy share by multiple times
		resta2.greetCustomer();
		

	}

}
