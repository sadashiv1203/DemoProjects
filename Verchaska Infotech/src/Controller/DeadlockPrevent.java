package Controller;

class DeadLock extends Thread
{
	String str1="Hello";
	String str2="Hi";
	
	Thread t1=new Thread("Thread1")
			{
	    public void run()
	         {
		        while(true)
		         {
		        	synchronized(str1){
	                    synchronized(str2){
	                        System.out.println(str1 + str2);
	                    }
	                }
			    
		         }
	         }
           };
           
      Thread t2=new Thread("Thread2")
			{
	    public void run()
	         {
		        while(true)
		         {
		        	synchronized(str2){
	                    synchronized(str1){
	                        System.out.println(str2 + str1);
	                    }
	                }
			    
		         }
	         }
          };
	
	}

public class DeadlockPrevent {
	
	public static void main(String args[])
	{
		DeadLock obj1=new DeadLock();
		obj1.t1.start();
		obj1.t2.start();
		
	}

}
