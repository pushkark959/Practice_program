package day9;

public class Thiskeyword_constructor {
	int a,b;
	
	Thiskeyword_constructor(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		Thiskeyword_constructor th = new Thiskeyword_constructor(10,50);
		th.display();

	}

}
