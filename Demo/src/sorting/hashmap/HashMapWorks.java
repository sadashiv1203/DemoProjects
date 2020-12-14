package sorting.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapWorks {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//each bucket called node
		// default size is 16
		// before inserting into hashmap, we calcalculate hash of the key.
		//by using hash we will get hashcode .
		
		// how to calculate index in map :: index= hash & (n-1) called modular operation
		
		//once index will create, that bucket list cantain linked list is created.
		
		// node cantains few info, key,hashcode,value,next
		
		//any key returns same hashcode called hash collision, then attach new node with the previous one.
		
		// when hashmap cantains null key, it will goes into first index
		
		
		
		Map<String,Integer> map=new HashMap<>();
		
		map.put("aaa",1);
		map.put("bbb",2);
		
		
		
		String s1="FB";
		String s2="Ea";
		
		System.out.println(s1.hashCode() + " " +s2.hashCode() );// both objects cantains same hash
		
		// if above both the object cantains same hashcode then it linked to the same
		// index by using the FCFS algo
		
		map.put("bb",1);
		map.put("bb",2);
		
		//if key gets duplicate, it replace the value 
		
		map.put(null,1);
		
		//when it key cantains null value, it will goes to 0th bucket
		
		//loadfactor: when load factor reach 75 then table size gets double.
		//threshold : table capacity * loadfactor(default 0.75)  default=12 when i insert 12 entries into map then
		//table size gets double
		
		
		
		
		
		
		
		

	}

}
