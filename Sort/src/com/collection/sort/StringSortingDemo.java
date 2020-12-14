package com.collection.sort;

import java.util.ArrayList;
import java.util.Collections;

import utils.MyUtils;

public class StringSortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> musicList=new ArrayList<>();
		musicList.add("kaisa hua");
		musicList.add("zara zara");
		musicList.add("besabriya");
		musicList.add("aisa desh hai mera");
		
		//MyUtils.extracted(musicList);
		MyUtils.extract(musicList);
		
		Collections.sort(musicList);
		
		System.out.println("after sorting:");
		
		//MyUtils.extracted(musicList);
		MyUtils.extract(musicList);
		

	

	
	}

}
