package com.spring;

import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array= {"abc","2","10","0"};
		List<String> list=Arrays.asList(array);
		Collections.sort(list);
		System.out.println(Arrays.toString(array));
		
		//without sort [abc, 2, 10, 0]
		
		//with sort [0, 10, 2, abc]
		
		
		//================================================================
		
		
		LinkedList<Integer> list2=new LinkedList();
		list2.add(5);
		list2.add(1);
		list2.add(10);
		
		System.out.println(list2);
		
		
		//==================================================================
		System.out.println("apple".compareTo("apple"));   //0
		System.out.println("apple".compareTo("banana"));   //-1
		System.out.println("apple".compareTo("app"));    //2
		System.out.println("apple".compareTo("asasasas"));//-3
		
		
		//=====================================================================
		
		int a=1;
		int b=0;
		//int c=a/b;
		//System.out.println(c);
		
		//arithmetic exception
		
		//======================================================================
		
		String message="hellow";
		print(message);
		message += "World";
		print(message);
		
		//======================================================================
		
		if("nifty" instanceof String)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		System.out.println("nifty".getClass().getSimpleName());
		
		
		
		

		
		
		
		
		
		
		
		

	}
	
	static void print(String message)
	{
		System.out.println(message);
		message+=" ";
	}

}
