package spring.core.annotations;

import org.springframework.stereotype.Component;

// <!--  <bean id="collageBean" class="spring.core.annotations.Collage"></bean>-->
// @Component annotation does same work above
// <context:component-scan base-package="spring.core.annotations"></context:component-scan>
// must be there

//@Component("collageBean")
@Component()
public class Collage 
{

	 public void Test()
	 {
		 System.out.println("Testing");
	 }
}
