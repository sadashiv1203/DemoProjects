package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		Restaurant resta=(Restaurant)context.getBean("reastauratBean");
		resta.prepareHotDrink();
	}

}
