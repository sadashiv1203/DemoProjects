package sorting.hashmap;

public class Equals_and_hashcode {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Emp emp=new Emp("sadashiv",1200000);
		Emp emp1=new Emp("asas",43443);
		
		Emp test=emp1;
		
		System.out.println(emp==emp1);//false
		
		System.out.println(test==emp1);//true
		
		//=================================================
		
		Integer i=127;
		Integer b=127;
		
		System.out.println(i==b);//true
		
		//==================================================
		
		String str1="";
		String str2=null;
		String str3= "Hello Java";
		
		System.out.println("Is empty"+str1.isEmpty());//true
		System.out.println("Is empty"+str2.isEmpty());//null pointer exception
		System.out.println("Is empty"+str3.isEmpty());//false
		
		//====================================================
		
		
		
		

	}

}
