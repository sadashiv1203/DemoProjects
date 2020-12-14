package com.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
	
	private String shopName;
	List<Book> books=new ArrayList<>();
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void loadData()
	{
		for(int i=1;i<=2;i++)
		{
			Book b=new Book();
			b.setId(1);
			b.setName("Xyz");
		    getBooks().add(b);
		}
	}
	
	/*@Override  its shallow copy
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}*/
	
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		BookShop shop =new BookShop();
		for(Book b:this.getBooks())
		{
			shop.getBooks().add(b);
		}
		
		return shop;
	}
	
	
	

	
	

}
