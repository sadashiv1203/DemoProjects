package sorting.hashmap;

import java.util.ArrayList;

public class TestHashCode {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Human hm=new Human(1001010,"asasas");
		//hm.hashCode();// uniquly identify the object
		System.out.println("1: "+hm.hashCode());
		
		Human hm1=new Human(1001010,"asasas");
		//hm.hashCode();// uniquly identify the object
		System.out.println("2: "+hm1.hashCode());
		
		String str=new String("");
		str.hashCode();
		//hashcode method never point memory address & its managed by jvm
		
		
		String str1="fb";
		String str2="sd";
		
		
		System.out.println("str1:"+str1.hashCode());
		System.out.println("str2:"+str2.hashCode());
		
		//a good hashcode() should return a distinct integer for each object
		//two different objects can also have same the hashcode
		//if the objects are equal their hashcode will be same.
		
		
		ArrayList<String> cars = new ArrayList<String>(10);
		
		
		
		
		
		
		
		

	}

}
