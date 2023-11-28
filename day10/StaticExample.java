package day10;

public class StaticExample {
	static int a = 10; // Static Variable
	int b = 20; // Non-static
	static void m1() // Static
	{
		System.out.println("This is m1 static method");
	}
	void m2 () // non static
	{
		System.out.println("This is m2 non-static method");
	}
	void m() // non static
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	
		
	}
	public static void main(String[] args) {
		// 1. Static method can access  static stuff directly (without object)
		System.out.println(a);
		// System.out.println(b); // Incorrect because b is non static
		m1();
		// m2(); // Incorrect because m2() is non static
		// Static method can access non static stuff through object
		StaticExample se = new StaticExample();
		System.out.println(se.b);
		se.m2();
		se.m();
		
 
	}

}
