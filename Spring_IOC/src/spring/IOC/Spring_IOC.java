package spring.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring_IOC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// config file contains classes
		// IOC container ==read the config file  & will create object 
		
		// IOC of two types 
		// BeanFactory(I)---legacy 
		// ApplicationContext(I)----with new features / more advanced 
		
		// ClasspathXmlAppliocationContext class is implemented by ApplicationContext interface.
		
		ApplicationContext con=new ClassPathXmlApplicationContext("Beans.xml");
		//Airtel air= (Airtel)con.getBean("airtel");
		//air.calling();
		//air.data();
		
		//Airtel air= con.getBean("airtel",Airtel.class);
		Sim sim=con.getBean("sim",Sim.class);// its the feature of spring wheere no need to rework on code changes ...use application context file.
		sim.calling();
		sim.data();
		
		// Features if IOC
		
		//creating the objects
		// managing our objects
		// helping our application to the configurable
		// managing dependencies
		
		
		
		
		
		
		
		
		

	}

}
