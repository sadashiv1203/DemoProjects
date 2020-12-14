package sorting.hashmap;

import java.util.*;
import sorting.hashmap.Emp;

public class Treemap_sorting_comparator {
	
	public static void main(String argS[])
	{
		
		//TreeMap(Comparator<? super K> comparator)
		//TreeMap(Map<? extends K,? extends V> m)
		//TreeMap(SortedMap<K,? extends V> m)
		//TreeMap()
		
		
		//TreeMap--RED_BLACK_TREE
		//insertion order not preserved 
		//sorting order is dependes on key
		//duplicates is allowd in values & not allowed in keys
		//customised sorting is doing Comparator interface
		// if we are depending on default natural sorting 
		//order then keys should be homogenius & comparabol otherwise,
		//we will get runtime exception class cast exception
		//if we are defining our own sorting using Comparator, then keys need not be homogeneous & 
		//comparable, we can take hetrogeneous non comparable object also.
		// wheather wec are depending default natural sorting order are
		//customeised sorting order there are no setriction for values
		//, we can take hetrogeneous non comparable object also.
		
		//null acceptance,  1. for non empty treemap, if we are trying to insert 
		//an entry with null key then we will get runtime exceptiuon saying null pointer exception.
		//null acceptance, 2.for emptyt tree map , as firts entry with null key is allowed but after inserting that entry
		//if we are trying to insert any other entry then we will get runtime ecxception saying 
		//null pointer exception
		
		//the above null acceptance rule untill 1.6 version only, from 1.7 v onwords null is not allowed for key.
		//but for values we can use null any number times, there is no restrictions wheather it is 1.6 or 1.7 version
		
		
		 TreeMap<Emp,String> tm = new TreeMap<Emp, String>(new MyNameComp());
	        tm.put(new Emp("Ram",3000), "RAM");
	        tm.put(new Emp("John",6000), "JOHN");
	        tm.put(new Emp("Crish",2000), "CRISH");
	        tm.put(new Emp("Tom",2400), "TOM");
	        Set<Emp> keys = tm.keySet();
	        for(Emp key:keys){
	            System.out.println(key+" ==> "+tm.get(key));
	        }
		
	        System.out.println("===================================");
	        //By using salary comparator (int comparison)
	        TreeMap<Emp,String> trmap = new TreeMap<Emp, String>(new MySalaryComp());
	        trmap.put(new Emp("Ram",3000), "RAM");
	        trmap.put(new Emp("John",6000), "JOHN");
	        trmap.put(new Emp("Crish",2000), "CRISH");
	        trmap.put(new Emp("Tom",2400), "TOM");
	        Set<Emp> ks = trmap.keySet();
	        for(Emp key:ks){
	            System.out.println(key+" ==> "+trmap.get(key));
	        }		   
	        
	}

}
class MyNameComp implements Comparator<Emp>{
	 
    @Override
    public int compare(Emp e1, Emp e2) {
        return e1.getName().compareTo(e2.getName());
    }
}
 
class MySalaryComp implements Comparator<Emp>
{
 
    @Override
    public int compare(Emp e1, Emp e2) 
    {
        if(e1.getSalary() > e2.getSalary()){
            return 1;
        } else {
            return -1;
        }
    }
}