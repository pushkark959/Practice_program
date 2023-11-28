package day9;

public class Greetings1 {

	//1) No Parameters No return Value
	
	private String Name;
	void greeting1()
	{
		System.out.println("Hello...");
	}
	
	//2) No Parameters return Values
	
	String greeting2()
	{
		return "Hello..How are you..?";
	}
	
	//3) Takes parameter no return value
	
	void greeting3(String Name) 
	{
		System.out.println("Hello.."+ Name);
	}
	
	//4) Takes parameter  return value
	
	String greeting4(String name)
	{
		return ("Hello..."+ name);
	}
	
}
