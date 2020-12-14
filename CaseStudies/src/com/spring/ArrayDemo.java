package com.spring;

import java.util.List;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter num:");
		Scanner s = new Scanner(System.in);
		int num  = Integer.parseInt(s.nextLine()); 
		int count=-1;
		int[] array =new int[20];
		
		for(int i=0 ;i<num;i++)
		{
		    Scanner s1 = new Scanner(System.in);
		    array[i]= Integer.parseInt(s1.nextLine());
		    count++;
		   // System.out.println("count:"+count);
		}
		
		/*for(int i=0; i<num ;i++)
		{
			   // 
		          System.out.println(array[count]);
		          count--;
		}*/
		
		List<Integer> listOfProducts = Arrays.asList(array);
		Collections.reverse(listOfProducts); 
		int[] reversed = listOfProducts.toArray(typesOfInsurance);

		

	}

}
