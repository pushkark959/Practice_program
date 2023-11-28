package day4;

public class Single_dim_array {

	public static void main(String[] args) {
	//	int a[]= new int [5]; // Declare array with size 5, Starting index is 0, Last index is 4
		
	/*	a[1]=100; //Storing or inserting values into array
		a[2]=200;
		a[3]=300;
		a[4]=400;
		a[5]=500;
		System.out.println(a); 
		
		int a[] = {100, 200, 300, 400, 500};
		System.out.println("Length of an array : " + a.length); // print length or size of an array
		System.out.println(a[2]); // Read specific value
		for (int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]); 
		}*/
		
		int a[] = {100, 200, 300, 400, 500}; // enhanced for loop
		for (int i:a)
		{
			System.out.println(i);
		}
	}

}
