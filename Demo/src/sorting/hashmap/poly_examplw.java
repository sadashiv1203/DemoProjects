package sorting.hashmap;

class A
{
	public void MethodA()
	{
		System.out.println("Method A");
	}
}

class B extends A
{
	public void MethodA()
	{
		System.out.println("Method B");
	}
}

public class poly_examplw {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 A a=new B();  
		 a.MethodA();  //output Method B
		 
		 A a1=new A(); //output Method A
		 a1.MethodA();
		 
	//	 B b=new A(); //con not convert A to B
	//	 b.MethodA();
		

	}

}
