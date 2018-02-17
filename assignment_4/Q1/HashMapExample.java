package gramma;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Set;
public class HashMapExample {

	public static void main(String[] args) {
		//Create a HashMap
		HashMap<Integer,String>hmap = new HashMap<Integer,String>();
		System.out.println("Is HashMap Empty? "+hmap.isEmpty());
		//add elements to HashMap
		hmap.put(1,"AA");
		hmap.put(2,"BB");
		hmap.put(3, "CC");
		hmap.put(4, "DD");
		
		//Checking whether HashMap is empty or not
		//isEmpty() method
		System.out.println("Is HashMap Empty? "+hmap.isEmpty());
		
		
		//Getting values from HashMap
		String val = hmap.get(4);
		System.out.println("The value mapped to key 4 is ："+val);
		
		String val2 =hmap.get(5);
		System.out.println("The Value mapped to Key is: "+ val2);
		
		//Create another HashMap
		HashMap<Integer,String>hmap2=new HashMap<Integer,String>();
		
		//Adding elements to the recently created HasMap
		hmap2.put(11,"Hello");
		hmap2.put(22,"Hi");
		
		//Copying one HashMap"hmap"to another HashMap "hmap2"
		hmap2.putAll(hmap);
	
		//Displaying HashMap "hmap2" content
		System.out.println("HashMap 2 contains: "+hmap2);
		
		//Getting Set of HashMap keys
		Set<Integer> keys = hmap.keySet();
		System.out.println("Set of Keys contains: ");
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
