package sorting.hashmap;

interface oper
{
	static void print()
	{
		System.out.println("Static Method Executed");
	}
}

public class Example_interview implements oper
{
	
	public void print()
	{
		System.out.println("Override Method Executed");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Example_interview s=new Example_interview();
		oper.print();
		oper.print();

	}
}



