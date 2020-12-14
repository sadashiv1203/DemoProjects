package com.custom.sort;

public class Song implements Comparable<Song>{
	
	private String title;
	private String artist;
	private Integer year;
	
	public Song(String title, String artist, Integer year) 
	{
		this.title=title;
		this.artist=artist;
		this.year=year;
	}
	
	public String getTitle() 
	{
		return title;
	}
	
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", year=" + year + "]";
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	/*@Override ////if you want to inverse order just do - while returning
	public int compareTo(Song o) {
		// TODO Auto-generated method stub
		return -this.getYear().compareTo(o.getYear());
	}*/
	
	@Override 
	public int compareTo(Song o) 
	{
		// TODO Auto-generated method stub
		return this.getTitle().compareTo(o.getTitle());
	}
	
	/*@Override
	public int compareTo(Song o) {
		// TODO Auto-generated method stub
	    if(this.getYear()>o.getYear())
	    {
	    	return +1;
	    }
	    if(this.getYear()<o.getYear())
	    {
	    	return -1;
	    }
	    
	    return 0;
	}*/
	
	

	
}
