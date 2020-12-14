package spring.core.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "spring.core.annotations")
@PropertySource("classpath:collage-info.properties")
public class ComponentDemoConfig 
{
     
}
