package day9;

public class MethodOverloading {
	int x,y;
	double d;
	void sum() //1
	{
		x=10;
		y=20;
		System.out.println(x=y);			
	}
	
	void sum(int a, int b) //2
	{
		x=a;
		y=b;
		System.out.println(x+y);
	}
	
	void sum(int a,double b) //3
	{
		x=a;
		d=b;
		System.out.println(x+d);
	}
	
	void sum(double b, int a) //4
	{
		x=a;
		d=b;
		System.out.println(x+d);
	}
	
	

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.sum();
		mo.sum(100, 200);
		mo.sum(10.5, 20);
		mo.sum(30, 20.8);

	}

}
