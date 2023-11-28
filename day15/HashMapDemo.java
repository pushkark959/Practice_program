package day15;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		//Map hm = new HashMap();
		//HashMap <Integer, String> hm = new HashMap <Integer, String>();
		
		//Adding data pairs to hashmap
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "John");
		hm.put(104, "Marry");
		hm.put(101, "David");
		
		System.out.println(hm); // {101=David, 102=Scott, 103=John, 104=Marry}
		
		// Size of the hashmap
		System.out.println(hm.size()); // 4
		
		// remove Pair
		hm.remove(103);
		System.out.println("After removing Pair : "+hm); // After removing Pair : {101=David, 102=Scott, 104=Marry}
		
		System.out.println(hm.get(102)); // Scott
		
		//Print Only keys from Hashmap
		System.out.println(hm.keySet()); // [101, 102, 104]
		
		//Print values from hashmap
		for(Object k : hm.keySet())
		{
			//System.out.println(k); // only print values
			System.out.println(k + "   " +hm.get(k)); // print both key and values 
		}
		hm.clear();
		System.out.println("After Clear..: "+hm); // After Clear..: {}

	}

}
