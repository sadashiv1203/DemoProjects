package spring.life.cycle;

import org.springframework.web.bind.annotation.PostMapping;

public class StudentDao 
{
	private String driver;
	private String url;
	private String userName;
	private String password;
	
	// application context firts initializes the object , once initialize the object it injects the deoendencies
	//after the injection is done, it calls the postConstruct method
	
	
	//@PostConstruct
	
	//PreDestroy----it calls before the cleanup of object, and it calls when application context 
	// close method calls
	
	// when we are using standalone appliaction, creating & destroying the object ae manually
	//in the web app, you don't need to create and destroy the container object.This will automatically done. we will
	
	//init-method & destroy-method are used in xml based approach
	
	//what is registerShutdownHook():- this is alternate for close method.
	// will execute once the main thread ends. so once all your codes gets executed, it will be called and 
	// and close your container. So it won't give us any exception irrrespective of the line no we are calling it.
	
	
	//default-init-method & default-destroy-method are used in xml based approach for common approach
	
	// InitializingBean interface is used to call init methode i.e afterPropertiesSet()
	
	// DesposableBean interface is used to call destroy methode i.e destoy()
	
	
	public void selectAllRows() 
	{
		
	}
	
	
	// why to close the database connection?
	
	

}
