package Controller;

class A
{
	public static void Test1()
	{
		System.out.println("Test1---A");
	}
	
	public static void Test2()
	{
		Test1();
	}
}

class B extends A
{
	public static void Test1()
	{
		System.out.println("Test1----B");
	}
}

public class StaticMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b=new B();
		b.Test1();   // O/P:-Test1----B
		b.Test2();   // O/p:-Test1----A
		
		A a=new B();
		a.Test1();  //  O/p:-Test1---A
		
		
		
		

	}

}
