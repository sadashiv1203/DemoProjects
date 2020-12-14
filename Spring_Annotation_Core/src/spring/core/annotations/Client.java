package spring.core.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con=new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("container object is created");
		//Collage coll=con.getBean("collageBean",Collage.class);
		Collage coll=con.getBean("collage",Collage.class);// if you are not provided the name of the 
		// component then it will take by deafult class name with small letter
		System.out.println("collage object is created");

	}

}
