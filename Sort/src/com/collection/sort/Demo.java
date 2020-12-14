package com.collection.sort;

import java.util.ArrayList;
import java.util.Collections;

import utils.MyUtils;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> integerList=new ArrayList<>();
		integerList.add(1);
		integerList.add(4);
		integerList.add(5);
		integerList.add(2);
		integerList.add(8);
		integerList.add(3);
		
		//MyUtils.extractedInteList(integerList);
		MyUtils.extract(integerList);
		
		System.out.println("After sorting:");
		Collections.sort(integerList);
		
		//MyUtils.extractedInteList(integerList);
		MyUtils.extract(integerList);
		
		

	}

	

}
