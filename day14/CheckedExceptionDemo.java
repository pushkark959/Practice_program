package day14;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Program is Starteed..");
		System.out.println("Program is in Progress..");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Program is Finished..");
		System.out.println("Program is in terminated..");

	}

}
