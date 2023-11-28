package day11;

public class super_Animal {
	String colour = "White";
	void eat()
	{
		System.out.println("Eating...");
	}
}
class Dog extends super_Animal
{
	String colour = "Black";
	void displaycolour()
	{
		System.out.println(super.colour);
	}
	void eat()
	{
		System.out.println("Eating Bread....");
	}
}