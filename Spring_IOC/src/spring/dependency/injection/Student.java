package spring.dependency.injection;

public class Student 
{
	private String studentName;//dependencies of Student class called literals
		
	public Student(String studentName) 
	{
	   this.studentName = studentName;
	}

	void Display()
	{
		System.out.println("Student Name:"+studentName);
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
