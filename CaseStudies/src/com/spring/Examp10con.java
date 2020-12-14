package com.spring;


 class Examp10 {

	protected int a;
	public int b;
	int c;
	protected int d;
	
	public Examp10()
	{
		a=10;
		b=15;
		c=10;d=10;
	}

	public void sum3()
	{
		System.out.println(a+b+c+d); /**Line A**/
	}
}
package Doprctice;
import Practi.Examp10;

public class Examp10con extends Examp10{
  Examp10con(){}
	 public void sum3()
	{
		System.out.println(a+b+c+d); /**Line B**/
	}
	 public static void main(String []aa)
	 {
		 Examp10con e=new Examp10con(); 
          e.sum3();  /**Line C**/
			 
 }
}