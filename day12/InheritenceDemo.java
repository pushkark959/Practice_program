package day12;
interface shape
{
	int length = 10;  // Final & Static
	int width = 20;   // Final & Static
	
	void circle();   //abstract method - unimplemented
	
	default void square() // default method
	{
		System.out.println("This is square default method...");
	}
	static void rectangle ()	 // Static method
	{
		System.out.println("This is rectangle...");
	}
	
}

public class InheritenceDemo implements shape{
	public void circle()	
	{
		System.out.println("This is Circle");
	}

	public static void main(String[] args) {
		InheritenceDemo idobj = new InheritenceDemo();
		idobj.circle();
		idobj.square();
		
		shape.rectangle();   //Static method can directly access
		
		// shape sh = new shape(); // Incorrect
		
		shape sh = new InheritenceDemo();
		sh.circle();
		sh.square();
		
		

	}

}
