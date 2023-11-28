package day9;

public class Thiskeyword {
	
	int x,y; // instance variable / Class Variable
	void setData(int x, int y) // Local Variable / Method Variable
	{
		this.x = x;
		this.y = y;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		Thiskeyword th = new Thiskeyword();
		th.setData(10, 30);
		th.display();

	}

}
