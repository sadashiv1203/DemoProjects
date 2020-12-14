/*package Controller;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;

@Documented
@Constraint(validatedBy=HobbyValidator.class)
@Target( { ElementType.field })
@Retention(RetensionPolicy.RUNTIME)
public @interface IsValidHobby 
{

	String message() default "Please provide a valid hobby"+
	                         "Accepted hobbies are-Music Football Cricket and Hockey (Choose Anyone)";
	
	                 Class<?>[] groups() default(){};
	                 
	                 Class<? extends Payload>[] payload() default(){};
	                 
}*/
