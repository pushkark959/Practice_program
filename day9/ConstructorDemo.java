package day9;

public class ConstructorDemo {
	int x,y;
	String S;
	
	/* ConstructorDemo (); // Default Constructor
	
	{
		x=100;
		y=200;
		S="Welcome";
		
	} */
	
    	ConstructorDemo (int a, int b, String str) //Parameterised constructor
	{
		x=a;
		y=b;
		S= str;
	}
	
	
	void displayData()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(S);
	}
	

	public static void main(String[] args) {
	//	ConstructorDemo cd = new ConstructorDemo(); //  we are invoking Default Constructor
		ConstructorDemo cd = new ConstructorDemo(10,20,"welcome"); //we are invoking Parameterised constructor
		cd.displayData();

	}

}
