package Controller;

public class TryCatchDemo{
	public Object clone() { 
		try { 
		// call clone in Object. 
		return super.clone(); 
		} catch(CloneNotSupportedException e) { 
		System.out.println("Cloning not allowed."); 
		return this; 
		//return super.clone();
		} 
		} 
	
	public int Test()
	{
      try {
    	    System.out.println("1");
			return 1;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("2");
			return 2;
		}
      
      finally
      {
    	  System.out.println("3");
    	  return 3;
      }
	}
	
	
	public void  Test2()
	{
      try {
    	    System.out.println("Test2 1");
    	    int i=10/0;
			//return 1;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Test2 2");
			System.exit(0);
			
			//return 2;
		}
      
      finally
      {
    	  System.out.println("Test2 3");
    	 // return 3;
      }
      
     System.out.println("Test2 4");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchDemo obj=new TryCatchDemo();
	   // System.out.println("Result:"+obj.Test());
		obj.Test2();
		//obj.Test2();
		/*try {
			TryCatchDemo obj2=(TryCatchDemo)obj.clone();
			obj2.Test2();
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		
		
	}

}
