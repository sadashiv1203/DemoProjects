package Controller;

interface AA
{
	String abc="xyz";
}

interface BB
{
	String abc="PQR";
}

class TestDemo implements AA,BB
{
	public void CheckValueOfabc()
	{
		//System.out.println(abc);
	}
}

class C extends TestDemo
{
	public void Test()
	{
		System.out.println("Value of ABC:-"+abc);
	}
}
public class InterfaceInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
