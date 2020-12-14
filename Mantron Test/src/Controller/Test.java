package Controller;
import java.util.*;

class Student
{
	String name=null;
	Student(String name)
	{
		this.name=name;
	}
}

public class Test 
{
	//HashMap<int,Integer>hm=new HashMap<int,Integer>(); error
	String name=null;
	/*static
	{
		System.out.println("jasgja");
	}
	
	static
	{
		System.out.println("fdsfdsf");
	}*/
	
	public static void callM(Integer i)
	{
		System.out.println("b:"+i);
		//i=i+1;
		return;
	}
	
	public static void callM2(Test i)
	{
		i.name="xyz";
		System.out.println("B:"+i.name);
		return;
	}
	
	
	public static void changeValue(String a)
	{
		a="X";
	}
	
	
	public static void main(String args[])
	{
		
	
	/*HashMap hm=new HashMap();
    hm.put(1,12);
    System.out.println(hm);    //o/p=> {1=12}*/
		
	/*Set s=new Set();
	s.put(1,1);
	System.out.println(s.get(1));  o/p=>Error: Set s can not Instantiated*/
		
	//HashMap<int,Integer> hm=new HashMap<int,Integer>(); // Error:insert "Dimension" to complete TypeArgument
		
	/*ArrayList<String> al=new ArrayList<String>();
	al.add("1");
	al.add("2");
	al.add(3,"3");  O/p=> Error because upcoming index is 2 becouse index start from 0;if it is 2 then it is working
	System.out.println(al);*/
		
	/*ArrayList<Object> al=new ArrayList<Object>();
	al.add("1");
	al.add(new HashMap<String,String>());
	al.add("3");     
	System.out.println(al);  //O/p=> [1,{},3]*/
		
	/*ArrayList<Object> al=new ArrayList<Integer>();
	al.add(1);
	al.add(2);
	System.out.println(al);// O/p=>Can not convert ArrayList<Integer> to ArrayList<Object>*/
		
	/*ArrayList<Object> al=new ArrayList<Object>();
	al.add(2);
	ArrayList al2=al;
	System.out.println(al2); O/p=>[2]*/
		
	
	/*Test t=new Test("ABC");
	t.name="PQR";
	System.out.println(t.name); O/p=>The constructor Test(String) is undefined */
		
	/*StringBuilder sb=new StringBuilder();
	sb.append(1);
	sb.append("One");
	sb.append(new Integer(1));
	System.out.println(sb);
	char c="C"; */ // O/p=>cannot convert from String to char
		
	/*System.out.println("A");
	int i=100%2;
	System.out.println(i);O/p=>A 0*/
		
	//call(null); O/p=>The method call() in the type Test is not applicable for the arguments (null)
	
	/*static
	{
		System.out.println("jasgja");
	}*/ // O/p=> Syntax error on token "static", delete this token
		
	
	/*Integer a=null;
	int b=a;
	System.out.println(a);*/ // O/p=> Null Pointer Exception
		
	
	/*int i=0;
	callM(i);
	System.out.println("A:"+i);*/// O/p=> b:0 A:0
		
    /*Test t=new Test();
    callM2(t);
    t=null;
    System.out.println("B:"+t.name);*/ // O/p=> Null Pointer Exception
		
	
    /*String as ="new";
    changeValue(as);
    System.out.println(as);*/ //  O/p=> "new"
		
	/*HashSet set=new HashSet();
	String s1=new String("A");
	String s2=new String("A");
	String s5="A";
	
	Student s3=new Student("Abc");
	Student s4=new Student("Pqr");
	set.add(s1);
	set.add(s2);
	set.add(s3);
	set.add(s4);
	set.add(s5);
	
	System.out.println(set);*/ // O/p=>  [Controller.Student@dd20f6, Controller.Student@a83b8a, A] becouse the hashcode and equal method is overide in String class
		
	//System.out.println(args);  // O/p=>[Ljava.lang.String;@87816d
		
	/*Thread t = Thread.currentThread();
	String name = t.getName();
	System.out.println("name=" + name);*/
		
		
		

	
	
	
	
    		
    
    
    
	
		
	
    

	
	
		
	}
		
	
	public static void call()
	{
		System.out.println("In call");
	}
    
	

}
