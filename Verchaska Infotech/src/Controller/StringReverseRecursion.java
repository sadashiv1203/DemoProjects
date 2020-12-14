package Controller;




public class StringReverseRecursion {

	/*public String StringReverse(String str)
	{
		if(str==null)
		{
			return ;
		}
		else
		{
			int strlen=str.length();
			//if(strlen>1)
			{
			StringReverse(str.substring(1,strlen-1));
			}
			
		}
		System.out.print(str.charAt(0));}*/
		
		String reverse = "";
	     
	    public String reverseString(String str){
	         
	        if(str.length() == 1){
	            return str;
	        } else {
	            reverse += str.charAt(str.length()-1)
	                    +reverseString(str.substring(0,str.length()-1));
	            return reverse;
	        }
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringReverseRecursion obj=new StringReverseRecursion();
		System.out.println(obj.reverseString("saswaSas"));

	}

}
