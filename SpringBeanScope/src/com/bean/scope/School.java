package com.bean.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="singleton")
public abstract class School {
	
	@Autowired
	private Student student;
	
	//@Lookup  
	/*Student createStudentObject()
			{
				return null;
			}*/
	
	
	
	@Lookup
	 abstract Student createStudentObject();// in this case also its works
	
	/*
	 Student createStudentObject()
			{
				return context.getBean(Student.class); // gets called behind the scene
			}
	  
	 */
			

	/* public Student getStudent() {
		return student;
	}*/
	
	 public Student getStudent() 
	 {
		 Student student=createStudentObject();
		 return student;
	 }

	public void setStudent(Student student) {
		this.student = student;
	}

	public School() {
			System.out.println("singleton School object created.......");
	}
}
