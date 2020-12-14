package com.test;



public class MultithreadingDemo {
	
	public static void main(String[] args) 
	{
		Runnable r=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Child Thred 1");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thred 5");
		}
	}

}
