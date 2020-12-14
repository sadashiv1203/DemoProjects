package com.custom.sort;

class Human
{
	
}

class Doctor extends Human
{
	
}

class Animal
{
	
}

class Dog extends Animal
{
	
}

class Bird
{
	
}

public class Test 
{
   public static <T extends Human> void printInfo(T obj)
   {
	   System.out.println("hey you are a human/dog/bird..");
   }
   
    public static void main(String args[])
    {
    	printInfo(new Human());
    	printInfo(new Doctor());
    //	printInfo(new Dog()); here getting error becouse object shold be extended from Human class
    	//-ve integer , if current object is lesser than the specified object
    	System.out.println("a".compareTo("x"));
    	
    	//-ve  o/p -2
    	System.out.println("b".compareTo("d"));
    	
    	//+ve  o/p 3
    	System.out.println("d".compareTo("a"));
    	
    	//zero
    	System.out.println("a".compareTo("a"));
    	
    	
    	
    	
    	
    }
}
