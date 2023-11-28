package day14;

import java.util.Scanner;

public class HandelException_finally {

	public static void main(String[] args) {
		System.out.println("Program is Starteed..");
		System.out.println("Program is in Progress..");
		
		String s = null;
		
		try
		{
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured..Handled");
		}
		finally
		{
			System.out.println("Entered into finally Block..");
		}
		System.out.println("Program is Completed..");
		System.out.println("Program is in Exited..");
		

	}

}
