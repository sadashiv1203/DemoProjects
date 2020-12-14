package sorting.hashmap;
import java.util.*;

public class MapDemo {

	public static void main(String[] args) 
	{

		//Map(I) 1.2
		
		// each key value pair in map called entry
		// Map is not child interface of collection
		// if we want to represent a group of objects as key value pairs then we should go for map
		// both keys and values objects only
		// duplicates keys are not allowed but values can be duplicated
		// each key value pair is called entry hense map is considered as a collection of entry objects
		
		// Map interface methods 
		
		// object put(object o,object o)-----return old value of key else null will return
		// void putAll(map m)// copy map 
		// object get(key)// null if not present , returns value associated with specified key
		// remove(key)// total entry will remove
		//boolean m.containsKey(key)
		//boolean m.containsValue(value)
		//boolean isEmpty()
		//int size()
		//void clear();
		
		//collection views of map
		
		//set keySet();  
		//Collection values();
		// set entrySet();
		
		//==================================================
		//Entry(I) Interface-entry is inner interface of map
		
		//object getKey();
		//object getValue();
		//object setValue();
		
		
		
		
		
		// HashMap 1.2
		// underlying datastructure is hashtable
		// insertion order is not preserved &  hashcode of keys.
		// duplicates keys are not allowed , duplicate values are allowed
		// hetrogeneous values are allowed
		// null is allowed for key only once
		// null value is allowed many times
		// serializable & clonable but random access
		// best choice if our frequent operation is search operation.
		
		HashMap m =new HashMap();
		//default intial capacity is 16
		//float fill ration 0.75
		
		HashMap m1 =new HashMap(20);//HashMap(String initialCapacity)
		//intial capacity is 20
		
		//HashMap m3 =new HashMap(String initialCapacity,Float  firstRatio)//
		
		//HashMap m4=new HashMap(Map m);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//LinkedHashmap 1.4
		//IdentityHashMap 1.4
		
		
		
		
	}

}
