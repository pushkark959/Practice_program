package day15;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		// Declaration
		ArrayList mylist = new ArrayList();
		//ArrayList <String> mylist = new ArrayList <String> ();  // Only String value
		//List mylist = new ArrayList();
		
		//Adding data into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//Size of an arraylist
		System.out.println(mylist.size());   //7
		System.out.println(mylist);  // [100, 10.5, Welcome, true, 100, null, null]
		
		//Remove value from arraylist
		mylist.remove(3);
		System.out.println("After Removing Element : "+ mylist); //  [100, 10.5, Welcome, 100, null, null]
		
		//Inserting new element in the middle of the list
		mylist.add(2,"Java");
		System.out.println("After Insertion : "+mylist); // [100, 10.5, Java, Welcome, 100, null, null]
		
		System.out.println(mylist.get(3)); // Welcome
		
		//read all the data from arraylist
		System.out.println("read all the data from arraylist");
		for(Object x:mylist)
		{
			
			System.out.println(x);
		}
		// Clear the data from arraylist
		mylist.clear();
		System.out.println("After Clearing : "+ mylist);  //After Clearing : []
		
		
	}

}
