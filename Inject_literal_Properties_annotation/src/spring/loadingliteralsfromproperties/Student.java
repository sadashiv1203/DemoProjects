package spring.loadingliteralsfromproperties;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student 
{
 @Value("${student.name}")
 private   String name;
 private   String interestedCouse;
 private   String hobbie;
 //=======================================================================================
 //@Value("sadashiv") annotation is used to inject literals value & for this we must nned to tag
 //<context:annotation-config> </context:annotation-config>
 //@value notation abover setter method
 //when we are injectinng the dependencies at field level, setter method are not called
 //=======================================================================================
 // if @Required attribute are present & suppoes we are not provide the bean values then
 // we will get beanInitialization exception
 
 //======================================================================================
// @Value("sadashiv")
 //@Required
 //@Value("sadashiv")
/*public void setName(String name) {
	this.name = name;
	System.out.println("setter name");
}*/
 //@Value("java")
 @Required
 @Value("${student.interestedCourse}")
public void setInterestedCouse(String interestedCouse) {
	this.interestedCouse = interestedCouse;
	System.out.println("setter setInterestedCouse");
}
 //@Value("cricket")
 @Required
 @Value("cricket")
public void setHobbie(String hobbie) {
	this.hobbie = hobbie;
	System.out.println("setter hobbie");
}

public void displayStudentInfo()
{
	System.out.println("Student Name: "+name);
	System.out.println("Student interestedCouse: "+interestedCouse);
	System.out.println("Student hobbie: "+hobbie);
}
 
 
 
}
