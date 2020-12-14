package com.spring;

import java.util.*;

 class Bag<T> 
{
	int  v;
	
	List l=new ArrayList(10);
	
	public<T> void add(T o)
	{
		l.add(o);
	}
	
	public void display()
	{
		for (int counter = 0; counter < l.size(); counter++) 
		{ 		      
	          System.out.println(l.get(counter).toString()); 		
	    }   
		
	}
	
}
 
 class Coin
 {
	 private int val;
	 
	 public void setValue(int val)
	 {
		 this.val=val;
	 }
	 
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return Integer.toString(val);
	}
 }
 
 class Note
 {
	 private int val;
	 
	 public void setValue(int val)
	 {
		 this.val=val;
	 }
	 
	 @Override
		public String toString() 
	   {
			// TODO Auto-generated method stub
			return Integer.toString(val);
		}
 }


public class CoinNote {
	
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
        int n,val=0;
        String str="";
        //Scan Total number of Coins and Notes
        //given by client
        n=sc.nextInt();
        //A bag to store Coins
        Bag<Coin> bagOfCoins=new Bag<Coin>();
        //A bag to store Notes
        Bag<Note> bagOfNotes=new Bag<Note>();
        for(int i=0;i<n;i++)
        {
            //Scan whether its a Coin or a Note
            str=sc.next();
            //Scan the denomination of the Coin/Note
            val=sc.nextInt();
            switch(str)
            {
                case  "Coin":
                    Coin coin=new Coin();
                    //Set the value of Coin and add it to the bag
                    coin.setValue(val);
                    bagOfCoins.add(coin);
                    break;
                case  "Note":
                    Note note=new Note();
                    //Set the value of Note and add it to the bag
                    note.setValue(val);
                    bagOfNotes.add(note);
                    break;
            }
        }
        System.out.println("Coins :");
        bagOfCoins.display();
        System.out.println("Notes :");
        bagOfNotes.display();
        
        
        
        
        
        
       
		
	}

}
