package spring.core.annotations;

public class Human 
{
   private Heart heart;
   private Service service;
   
   /*public Human(Heart heart) 
   {
	this.heart = heart;
   }
   */
   
   public void setService(Service service) 
   {
	this.service = service;
   }

   public void test()
   {
	   
	   System.out.println("Its testing.....");
	   heart.heartPumping();
	   service.servicing();
   }

   public void setHeart(Heart heart) 
   {
	this.heart = heart;
   }
   
   
  
}
