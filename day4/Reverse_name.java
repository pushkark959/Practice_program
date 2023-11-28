package day4;

public class Reverse_name {

	public static void main(String[] args) {
		//Using concatenation operator
		
		
		 String s = "pushkar";
		String p = "";
		//int len = s.length();
		for(int i = s.length()-1;i>=0;i--)
		
		{
			 p = p+s.charAt(i);
		}
		System.out.println("Reverse of Pushkar : "+p);    
			
        //Using Character array
		/*
		String s = "pushkar";
		String p = " ";
		char a[] = s.toCharArray();
		int len = s.length();
		for(int i = len-1;i>=0;i--)
			
		{
			 p = p+a[i];
		}
		System.out.println("Reverse of Pushkar : "+p);   */
		
		//Using String buffer class
		
		
		/*String s = "pushkar";
		String p = " ";
		StringBuffer sb = new StringBuffer(s);
		System.out.println("Reverse of Pushkar : "+sb.reverse());     */
		
				
	}

}
