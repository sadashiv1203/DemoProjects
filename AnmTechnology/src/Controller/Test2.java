package Controller;

public class Test2 {
	
	public int display()
	{
		try {
			int a=10/3;
			return a;
		} catch (Exception e) 
		{
			// TODO: handle exception
		}
		finally 
		{
			return 78;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Test2 t=new Test2();
		int ans=t.display();
		System.out.println(ans);*/
		try 
		{
			int i=10/0;
		} 
		/*catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("catch block...........");
		}*/
		finally 
		{
			System.out.println("Finally..........");
		}
		
	}

}
