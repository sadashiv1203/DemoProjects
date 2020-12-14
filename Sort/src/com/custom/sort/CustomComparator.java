package com.custom.sort;

import java.util.Comparator;

public class CustomComparator implements Comparator<Song> {

	@Override
	public int compare(Song o1, Song o2) {
		// TODO Auto-generated method stub
		// sort all the songs by the year in the ascending order
		
		if(o1.getYear()>o2 .getYear())
		{
			return +1;
		}
		if(o1.getYear()<o2 .getYear())
		{
			return -1;
		}
		
		return 0;
	}
	
	

}
