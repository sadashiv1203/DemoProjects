package spring.loadingliteralsfromproperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con=new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("Beans.xml file loaded");
		Student student=con.getBean("student",Student.class);
		student.displayStudentInfo();
		
		
		
		
	}

}
