package com.design.pattern;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		BookShop bs=new BookShop();
		bs.setShopName("Novel");
		bs.loadData();
		System.out.println(bs);
		
	   //	BookShop bs1=(BookShop)bs.clone();// shallow copy
		
		//bs.setShopName("A1");
		//bs.loadData();
		//System.out.println(bs);
		
		BookShop bs1=(BookShop)bs.clone();
		
		//in prototype design pattern, we are creating deep copy of object.
		//when to create a new object is a heavy task that time, we are using prototype design pattern.
	    //when suppoes any class need a repeative task to fetch the data from db that time we can use the 
		// prototype design pattern.
	}

}
