package spring.core.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ComponentDemo 
{
	   private Heart heart;
	   
	   @Autowired
	   @Qualifier("serviceImplement")
	   private Service service;
	   
	   @Value("${collage.Name}")
	   private String collageName;
	   
	   /*public Human(Heart heart) 
	   {
		this.heart = heart;
	   }
	   */
	   
	 /*  @Autowired
	   public void setService(Service service) 
	   {
		this.service = service;
	   }*/

	   public void test()
	   {
		   
		   System.out.println("Its testing.....");
		   heart.heartPumping();
		   System.out.println("my collage name is: "+collageName);
		   service.servicing();
	   }

	   @Autowired
	   public void setHeart(Heart heart) 
	   {
		this.heart = heart;
	   }
}
