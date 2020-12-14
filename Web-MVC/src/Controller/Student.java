package Controller;
import java.util.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Student {
	//@Future
	//@Min
	//@NotNull
    //@NotEmpty
	@Pattern(regexp="(^0.9)*")
	private String studentName;
	@Size(min=2,max=5,message="dsdssfsfdsfdsfdsf")
	private String studentHobby;
	@Max(2222)
	private long studentMobile;
	@Past
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	
	
	public String getStudentName()
	{
	    return studentName;
	  
	}
	public void setStudentName(String studentName)
	{
	    this.studentName=studentName;
	}
	
	public String getStudentHobby()
	{
	    return studentHobby;
	}
	public void setStudentHobby(String studentHobby)
	{
	    this.studentHobby=studentHobby;
	}
	
	public long getStudentMobile()
	{
	    return studentMobile;
	}
	public void setStudentMobile(long studentMobile)
	{
	    this.studentMobile=studentMobile;
	}
	
	public Date getStudentDOB()
	{
	    return studentDOB;
	}
	public void setStudentDOB(Date studentDOB)
	{
	    this.studentDOB=studentDOB;
	}
	
	public ArrayList<String> getStudentSkills()
	{
	    return studentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills)
	{
	    this.studentSkills=studentSkills;
	}

}
