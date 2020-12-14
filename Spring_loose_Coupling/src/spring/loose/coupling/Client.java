package spring.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student stu=new Student();
		//stu.cheating();
		
		ApplicationContext con=new ClassPathXmlApplicationContext("Beans.xml");
		Student stu=con.getBean("stu",Student.class);
		stu.cheating();
		
		
		// here loose coupling is did by using interface with runtime polymorphism
		
		
		
		// in above two object along with two different MathCheat objects are created.
		//so, here its performance gets increased.application is heavy waight
		
		

	}
	

}
