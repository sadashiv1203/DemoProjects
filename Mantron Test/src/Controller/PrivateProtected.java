package Controller;

class DemoClass
{
	private class Abc
	{
		public void Show()
		{
			System.out.println("Hello");
		}
	}
	
	public void CheckMethod()
	{
		Abc a = new Abc();
		a.Show();
		System.out.println("CheckMethod");
	}
}

protected class Demo2
{
	public void Test22()
	{
		System.out.println("Test22");
	}
}

public class PrivateProtected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoClass().CheckMethod();
		
	}

}
