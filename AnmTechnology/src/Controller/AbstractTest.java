package Controller;


abstract class Demo
{
	public  void Test2()
	{
		System.out.println("Demo Test2");
	}
}

class TestDemo extends Demo
{
	/*public void Test2()
	{
		System.out.println("TestDemo");
	}*/
}


public class AbstractTest {
	
	public static void main(String args[])
	{
		Demo d=new TestDemo();
		d.Test2();
	}

}
