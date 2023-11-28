package day15;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// Declaration
		HashSet myset = new HashSet();
		//Set myset = new HashSet();
		//HashSet <Integer> myset = new HashSet <Integer> ();
		
		myset.add(100);
		myset.add(10.5);
		myset.add("Welcome");
		myset.add(100);
		myset.add(null);
		myset.add(null);
		System.out.println(myset); // [null, 100, 10.5, Welcome]
		
		//Size of an hashset
		System.out.println(myset.size());  //4
		
		//remove values from hashset
		myset.remove(10.5);
		System.out.println("After removing : "+ myset); // After removing : [null, 100, Welcome]
		
		// Read all data from hashset
		for (Object x : myset)
		{
			System.out.println(x);
		}
		
		
	}

}
