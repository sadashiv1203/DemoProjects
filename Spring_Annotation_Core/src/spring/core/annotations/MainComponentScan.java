package spring.core.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainComponentScan {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		/*ApplicationContext con=new  AnnotationConfigApplicationContext(CollageConfig.class);
		Collage coll=con.getBean("collageBean",Collage.class);
		System.out.println("collage object is created");
		coll.Test();*/
		
		ApplicationContext con=new  AnnotationConfigApplicationContext(HumanConfig.class);
		Human coll=con.getBean("colBean",Human.class);
		//here humanBean method name is same present in  HumanConfig configuration class &
		// it is handlled by @Bean annotation
		System.out.println("Human object is created");
		coll.test();
		((AnnotationConfigApplicationContext)con).close();
		

	}

}
