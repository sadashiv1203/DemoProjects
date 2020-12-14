package com.multithreading;

class myThread extends Thread
{
	public void run()
	{
		System.out.println("Run .......");
	}
}

public class DaemonThread {
	
	// Daemon thread executed in the background e.g garbage collector,signal dispatcher, attach listner
	
	
	// Advantages of daemon thread
	// to provide support non-daemon threads (main thread)
	
	// staring with low priority & based on requirement jvm adds high priority
	
	//public boolean isDaemon() :- 
	
	// public void setDaemon(boolean b):- it only allow before the start the 
	//thread else will get illegalthreadstateexception
	
	// defaultNature of thread
	// by default main thread is always non-daemon &
	//all remaining threads daemon nature will be inherited from parent to child
	//i.e if parent tread is daemon then automatically child thread is also daemon
	// & if the parent thread is non-daemon then automatically child thread is non- daemon
	
	//it is impossible to change a daemon nature os main thread
	//becouse it is already started by jvm yet beginning
	
	
	
	
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().isDaemon());//by default false non-daemon
		
		//Thread.currentThread().setDaemon(true);// not possible becouse you can not change sate of main thread
		
		myThread thread= new myThread();
		System.out.println("isDaemon 11 :"+thread.isDaemon());
		thread.setDaemon(true);
		System.out.println("isDaemon 22:"+thread.isDaemon());
		thread.start();
		
		// whenever last daemon thread terminates automatically all daemon thread will be terminated 
		// irrespective of their position
		
		// once non-daemon thread stop automatically daemon thread stops
		
		
		
		
		
	}
	
	
	
	
	
	

}
