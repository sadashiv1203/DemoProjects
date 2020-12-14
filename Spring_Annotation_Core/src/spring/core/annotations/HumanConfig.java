package spring.core.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HumanConfig 
{
	@Bean
	public Heart heartBean()
	{
		return new Heart();
	}
	
	@Bean
	public Service getService()
	{
		return new ServiceImplement();
	}
	
	
	//using name , we can provide multiple alias names
	@Bean(name={"colBean","colBean2"})
	 public Human humanBean()// human 
	 {
		// Human human=new Human(heartBean());// constructor injection
		Human human=new Human();
		human.setHeart(heartBean());// this is called setter injection
		human.setService(getService());
		 return human;
	 }

}
