package com.multithreading;

class Printer
{
	void printDoc(int num)
	{
		for(int i=1;i<=num;i++)
		{
			System.out.println("Printing Doc:"+i);
		}
	}
}

class MyThread extends Thread
{
	Printer pRef;
	MyThread(Printer p)
	{
		pRef=p;
	}
	
	public void run()
	{
		pRef.printDoc(10);
	}
}

class YourThread extends Thread
{
	Printer pRef;
	YourThread(Printer p)
	{
		pRef=p;
	}
	
	public void run()
	{
		pRef.printDoc(10);
	}
}

public class DemoThreading {
	
	//Runnable interface---enables the loose coupling
	// only if there is a need of speacial run method
	
	//Thread class----enables the tight coupling
	//only if there is is a need of overriding othere methods of it
	
	public static void main(String[] args) 
	{
		System.out.println("=========Application started==============");
		
		Printer ptr=new Printer();
		//ptr.printDoc(10);
		
		MyThread mRef= new MyThread(ptr);
		
		
		YourThread yRef= new YourThread(ptr);
		
		mRef.start();
		try {
			mRef.join();// by using join method, we will handle the synchronisation 
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		yRef.start();
		
		//in the above scenario two threads are working on same printer object
		
		System.out.println("=========Application End==============");
		
	}
	
	

}
