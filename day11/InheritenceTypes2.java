package day11;

class AA
{
	int a;
	void display ()
	{
		System.out.println(a);	
	}
}

class BB extends  AA
{
	int b;
	void show ()
	{
		System.out.println(b);
	}
}
class CC extends  BB
{
	int c;
	void print ()
	{
		System.out.println(b);
	}
}

public class InheritenceTypes2 {
	
public static void main(String[] args) {
	CC cobj = new CC();
	cobj.a = 100;
	cobj.b = 20;
	cobj.c = 30;
	
	cobj.display();
	cobj.show();
	cobj.print();
	
	
	

}

}
