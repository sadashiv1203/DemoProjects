package com.spring;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

interface A
{
	void get();
}

interface B
{
	void get();
}

class C implements A,B
{

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}

	
}

public class StringMatch
{

public static void main(String[] args) 
{
	String s1 = "Hello i love java";
    String s2 = new String(s1);
    System.out.println((s1 == s2) + " " + s1.equals(s2));
	
	
String regex = "\\b(\\d{3})\\d{7}\\b";
Pattern p = Pattern.compile(regex);
String source = "3342449027, 2339829, and 6152534734";

Matcher m = p.matcher(source);

while(m.find())
{
    String val = m.group();
    String val2 = m.group(1);
    System.out.println("Val: " + val + ", Val2: " + val2);
}
}
}
