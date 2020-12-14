package spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human 
{
	//@Autowired
	//@Qualifier("humanHeart")
	private Heart heart;
	// when above the annonation using on dependency field the setter method will not called.
	// if you are using @Autowired & @Qualifier on the field do not use setter method.
	// & if you are not using @Autowired & @Qualifier then should be present setter method.
	
	// its is simply check the qualifier object in xml file & it inject whene it requires
	
	//========================================================================================
	// <bean id="human" class="spring.autowired.Human" autowire="constructor">
	// when you are injecting object using constructor autowire, 
	// the constuctore should be there & here also setter injection called.
	
	// autowire don't use when there are many dependencies becouse 
	//it make lot of conflict & not easy to debug
	
	//========================================================================================
	
	public Human(Heart heart) {
		
		this.heart = heart;
	}
	
	//For now just assume spring is not using your constroctor which is 
	//Human(new Heart()) instead its using the 
	//deafault Human() constructon to create Human class object.
	
	public Human() {
		// TODO Auto-generated constructor stub
	}
	
	//now spring is able to create the Human by using the deafult constructor.
	//but it is not able to inject our dependency heart.So we are getting output as "object null"
	
	
	// <bean  id="heartObject" class="spring.autowired.Heart"></bean> 
	// after adding above line in Beans.xml , issue gets resolved
	
	//here setter method not called
	
	
	//=========================================================================================
	
	
	
	// when you are using autowire concept, should be propertyName is same as object reference id
	//<bean  id="heart" class="spring.autowired.Heart"></bean> 
	//<bean id="human" class="spring.autowired.Human" autowire="byName">
	// here no need to inject the heart object by using setter property.
	// here spring explicitely setter method called
	
	//========================================================================================
	
	//<bean id="human" class="spring.autowired.Human" autowire="byType">
	//when you are using byType autowire the class name & dependency name should be mathch
	// here also setter injection called
	// type of the variable & the type of the bean matched.
	
	//========================================================================================
	
	
	@Autowired
	@Qualifier("humanHeart")
	public void setHeart(Heart heart) {
		System.out.println("Setter method called....");
		this.heart = heart;
	}
	
	// here first it try to resolves with "byType"
	// if byType fails then it goes with "byName"
	//------------------------------------------------------------------
	
	//<bean  id="heart" class="spring.autowired.Heart"></bean>  
	//<bean  id="octopusHeart" class="spring.autowired.Heart"></bean> 
	
	// if the two beans are setted then there shuld be id name mathch with dependency so, by Nme 
	//type will automatically called else will get exception if id not matched
	
	//------------------------------------------------------------------------------------
	//for primitive & string type autowired is not supporting.it supports objects only
	
	//------------------------------------------------------------------------------------
	
	// using @Qualifier annotation we can ask spring to inject user defined object
	//============================================================================
	

	public void startPumping()
	{
		if(heart != null)
		{
		heart.pump();
		}
		else
		{
			System.out.println("object null");
		}
	}

}
