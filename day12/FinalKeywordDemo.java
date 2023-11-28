package day12;

class Test
{
final int x=100;
}
public class FinalKeywordDemo {

	public static void main(String[] args) {
		Test t = new Test();
	// 	t.x=200; // Incorrect because x is final variable
		System.out.println(t.x);

	}

}
