package exception.handling;

import java.nio.file.attribute.AclEntry;

public class Demo 
{
   
	
	//Error :  caused by the enviornment on which application is running
	//           happen at runtime
	//          errors are type of unchecked type
	//           impossible to recover from error
	
	
	// Exception:  caused by appliaction
	//              can happen at compile time & runtime
	//             it can be checked & unchecked exception
	//             possible to recover from exception
	
	public static void main(String[] args) 
	{
		try
		{
			 int i=10/0;
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Arithmetic exception 1");
		}
		
		try
		{
			try
			{
				 System.out.println("222222");
			}
			catch(ArithmeticException ex)
			{
				System.out.println("Arithmetic exception 2");
			}
			
			try
			{
				 System.out.println("33333");
			}
			catch(ArithmeticException ex)
			{
				System.out.println("Arithmetic exception 3");
			}
			 
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Arithmetic exception 4");
		}
		
		try 
		{
			
		}
		//catch
		catch(Exception ex)
		{
			
		}
	}
	
	
	
	
	
}
