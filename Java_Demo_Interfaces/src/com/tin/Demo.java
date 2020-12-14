package com.tin;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sum sum=new Sum();
		Strategy str=new Strategy(sum);
		System.out.println("Stategy:-"+str.output(5, 6));

	}

}
