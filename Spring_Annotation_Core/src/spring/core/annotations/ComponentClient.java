package spring.core.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con=new AnnotationConfigApplicationContext(ComponentDemoConfig.class);
		ComponentDemo comp=con.getBean("componentDemo",ComponentDemo.class);
		comp.test();
		

	}

}
