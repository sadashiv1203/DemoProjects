package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		System.out.println("========================================");
		Restaurant resta1=(Restaurant) context.getBean("reastauratBean");
		Restaurant resta2=(Restaurant) context.getBean("reastauratBean");
		
		resta1.setwelcomeNote("one");
		resta1.greetCustomer();
		
		//resta2.setwelcomeNote("Two");  //The singleton bean is always initialized at application startup
		                                 //if you want lazy instatiation of bean means until getbean method is not called the bean object is not created
		                                 //that time use lazy-init parameter to bean as true
		                                 //when you read the springconfig using BeanFactory Interface that time its lazy loading is initialized
		resta2.greetCustomer();

	}

}
