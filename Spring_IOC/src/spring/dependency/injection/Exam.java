package spring.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam 
{
	
	public static void main(String[] args) 
	{
		//Student student=new Student();
		// student.studentName="ssadd"; once its private can not access
		// student.setStudentName("sdsdsds");// injecting value to my student class values
		
		ApplicationContext con=new ClassPathXmlApplicationContext("Beans.xml");
		//Student stu=con.getBean("student",Student.class);
		//stu.Display();
		
		
		Student sadashiv=con.getBean("sadashiv",Student.class);
		sadashiv.Display();
		
		
	}

}
