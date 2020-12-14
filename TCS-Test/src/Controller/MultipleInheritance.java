package Controller;

interface A
{
	int a=3;
	public void add();
	
}

interface B
{
	int a=4;
	public void add();
	public void mul();
}

class C implements B,A
{
	public void add()
	{
		System.out.println("C class");
	}
	public void mul()
	{
		System.out.println("mul Class");
	}
}

public class MultipleInheritance {
	
	public static void main(String args[])
	{
		C c=new C();
		c.add();
		c.mul();
	}

}
