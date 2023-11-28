package day3;

public class Count_number {

	public static void main(String[] args) {
		int i = 1256433456;
		
		
		/*String num = String.valueOf(i);
		char[] numArr= num.toCharArray();
		System.out.println(numArr.length);*/
		
		int count = 0;
		while (i!=0)
		{
			i=i/10;
			count++;
		}
		System.out.println("Digit count of Number : " + count);
		
		}

	}


