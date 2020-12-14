package Controller;

import java.util.List;

public class Restaurant {
	
	   private List restarantWorkerslist;
	   
	   
	   public void setRestarantWorkerslist(List restarantWorkerslist)
	   {
		   this.restarantWorkerslist=restarantWorkerslist;
	   }
	   
	   public void DisplayWaiterList()
	   {
		  System.out.println("The Workers::"+restarantWorkerslist); 
	   }
	   
}
