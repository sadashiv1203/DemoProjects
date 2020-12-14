package spring.core.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//by using @Configuration annotations, we are completely remove xml file dependency. 


@Configuration
@ComponentScan(basePackages = "spring.core.annotations")
public class CollageConfig 
{

}
