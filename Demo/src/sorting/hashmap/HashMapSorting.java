package sorting.hashmap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.TreeMap;

public class HashMapSorting {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		 Map<Integer, String> hmap = new HashMap<Integer, String>();
		 hmap.put(5, "A");
         hmap.put(11, "C");
         hmap.put(4, "Z");
         hmap.put(77, "Y");
         hmap.put(9, "P");
         hmap.put(66, "Q");
         hmap.put(0, "R");
         
         System.out.println("Before Sorting:");
         
         Set set = hmap.entrySet();
         Iterator iterator = set.iterator();
         
         while(iterator.hasNext()) {
             Map.Entry me = (Map.Entry)iterator.next();
             System.out.print(me.getKey() + ": ");
             System.out.println(me.getValue());
       }
         
         Map<Integer, String> map = new TreeMap<Integer, String>(hmap); 
         
         System.out.println("After Sorting:");
         Set set2 = map.entrySet();
         Iterator iterator2 = set2.iterator();
         while(iterator2.hasNext()) {
              Map.Entry me2 = (Map.Entry)iterator2.next();
              System.out.print(me2.getKey() + ": ");
              System.out.println(me2.getValue());
         }
         
         
         // Treemap common methods
         
         System.out.println("====================================================");
         TreeMap<Integer, String> tmap= new TreeMap<Integer, String>(hmap); 
         System.out.println("tmap firstKey:"+tmap.firstKey());
         System.out.println("tmap lastKey:"+tmap.lastKey());
         System.out.println("headMap(9):"+tmap.headMap(9));
         System.out.println("subMap(9, 66):"+tmap.subMap(9, 66));
         
         
         
         
		
	}

}
