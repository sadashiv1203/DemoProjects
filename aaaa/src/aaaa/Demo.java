package aaaa;

import java.rmi.NoSuchObjectException;

public class Demo 
{
  public static void main(String[] args) 
  {
     try
     {
		throw new NoSuchObjectException("dsd");
	 } 
     catch (Exception e) 
     {
    	 System.out.println("Exception");
	 }
     finally
     {
    	 System.out.println("finally");
     }
  }
}
