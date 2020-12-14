package sorting.hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ArrayList_Unique {

	public static void main(String[] args) 
	{
		
       ArrayList<String> aListNumbers = new ArrayList<String>();
        
        //add elements to ArrayList
        aListNumbers.add("One");
        aListNumbers.add("Two");
        aListNumbers.add("Three");
        aListNumbers.add("One");
        aListNumbers.add("Four");
        
        HashSet<String> hSetNumbers = new HashSet(aListNumbers);
        
        System.out.println("ArrayList 1 Unique Values");
        
        //iterate through HashSet
        for(String strNumber : hSetNumbers)
            System.out.println(strNumber);
        
        LinkedHashSet<String> lhSetNumbers = new LinkedHashSet(aListNumbers);
        
        System.out.println("ArrayList 2 Unique Values");
         
        //iterate through HashSet
        for(String strNumber : lhSetNumbers)
            System.out.println(strNumber);
	}

}
