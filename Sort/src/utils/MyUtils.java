package utils;

import java.util.ArrayList;

public class MyUtils {
	
	/*public static void extracted(ArrayList<String> musicList)
	{
		for(String temp:musicList)
		{
			System.out.println(temp);
		}
	}
	
	public static void extractedInteList(ArrayList<Integer> integerList) 
	{
		for(Integer temp:integerList)
		{
			System.out.println(temp);
		}
	}*/
	
	//static<T> this is used to tell java, method is generic
	public static<T> void extract(ArrayList<T> integerList) 
	{
		for(T temp:integerList)
		{
			System.out.println(temp);
		}
	}
	
	
	
	

}
