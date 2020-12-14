package com.test;


interface interef //called functional interface since it is having only single abstract method
{
	public void add(int a, int b);
	
	default void test()
	{
		System.out.println("sasas");
	}
}

@FunctionalInterface
interface interefTest extends interef  //called functional interface since its is having single interfaces
{
	//public void addSecond(); // if you adding this method then this interface can not be functional interface
}

interface squareDemo
{
	public int squareIt(int n);
}


class Test implements interef
{
	public void add(int a, int b)
	{
		System.out.println("Addition :"+(a+b));
	}
}


public class FunctionalInterfacesDemo {

	public static void main(String[] args)
	{
		interef i= new Test();
		i.add(10,20);
		
		//System.out.println("sasas");
		
		// how to use lambda expression
		
		interef j = (a,b)->{System.out.println("Addition :"+(a+b));};
		j.add(10,76);
		
		
		interefTest k=(a,b)->{System.out.println("Addition :"+(a+b));};
		k.add(2323, 323);
		
		squareDemo v=n->n*n;
		System.out.println("Square value of 5:"+v.squareIt(5));
		
	}

}
