package Controller;

import java.io.IOException;

public class TryCatchTest {
	
	public void check()
	{

		try {
			int i=10/0;
			System.out.println("try");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("catch");
		}
		
		finally {
			System.out.println("finally");
		}
		
		System.out.println("after finally");
	}
	
	public int TestX()
	{
		try {
			
			return 1;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
		finally {
			
			return 2;
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TryCatchTest obj=new TryCatchTest();
		//System.out.println(obj.TestX());
		obj.check();
 
	}

}
