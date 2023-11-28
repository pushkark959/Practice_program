package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_length {

	public static void main(String[] args) {
		
		BufferedReader read= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String s;
		try {
			s = read.readLine();
			System.out.println(s.length());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
