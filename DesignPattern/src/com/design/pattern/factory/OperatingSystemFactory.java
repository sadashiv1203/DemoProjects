package com.design.pattern.factory;

public class OperatingSystemFactory 
{
   public os getInstatnce(String str)
   {
	   if(str.equals("open"))
	   {
		   return new Android();
	   }
	   else if(str.equals("closed"))
	   {
		   return new Windows();
	   }
	   else
		   return new Windows();
	   
   }
   
   //the purpose of factory design pattern to provide abstract layer between client & business layer
   // example is to provide the os with open & windows
}
