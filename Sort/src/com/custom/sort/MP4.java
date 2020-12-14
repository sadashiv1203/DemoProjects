package com.custom.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utils.MyUtils;


public class MP4 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		ArrayList<Song> musicList= new ArrayList<>();
		
		Song song1= new Song("kaisa hua","Arjit",2019);
		Song song2= new Song("zara zara","bbb",2011);
		Song song3= new Song("besabriya","ggg",1990);
		Song song4= new Song("aisa desh hai mera","aaa",2001);
		
		
		musicList.add(song1);
		musicList.add(song2);
		musicList.add(song3);
		musicList.add(song4);
		
		MyUtils.extract(musicList);
		System.out.println("================================================================");
		
		System.out.println("After sorting:");
		
		Collections.sort(musicList);
		
		MyUtils.extract(musicList);
		
		 System.out.println("================================================================");
		
		CustomComparator comparator=new CustomComparator();
        System.out.println("After sorting:");
		
		Collections.sort(musicList,comparator); // its does not call camparable compareTo method, it calls compare method
		
		MyUtils.extract(musicList);
		
		

	}

}
