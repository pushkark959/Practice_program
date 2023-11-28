package java_Project;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		/*
		// 1.Find the Factorial of the given number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
        System.out.println("Factorial of the number : "+fact);
        */
		
		/*
		//2. Find the reverse of the number
		int n = 6235762;
		int r ;
		System.out.print("Reverse of the Number : ");
		while(n>0) {
			r=n%10;
			System.out.print(r);
			n=n/10;
		}
		*/
		
		/*
    	//3. Check whether the number is palindrome or not

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Your Number");
		int n = sc.nextInt();
		int r;
		int s=0;
		int c=n;
		while(n>0) {
			r = n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(c==s) {
			System.out.println(s+" : This is Plaindrome Number");
		}
		else {
			System.out.println(s+" : This is Not Plaindrome Number");
		}
		*/	
		
		/*
		//4. Check whether the number is amstrong or not
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Your Number");
		int n = sc.nextInt();
		int r;
		int s=0;
		int c=n;
		while(n>0) {
			r=n%10;
			s=(r*r*r)+s;
			n=n/10;
		}
		if(c==s) {
			System.out.println(s+" : This is armstrong Number");
		}
		else{
			System.out.println(s+" : This is Not armstrong Number");
		}
		*/
		
		/*
		//5. Print the amstrong number available between 0 to 1000
		int r;
		for(int i=1;i<=1000;i++) {
			int n=i;
			int s=0;
			while(n>0) {
				r=n%10;
				s=(r*r*r)+s;
				n=n/10;	
			}
			if(s==i) {
				System.out.println(s);
			}
		}
		*/
		
		/*
		//6. To print the palindrome available between 0 to 100
		
		int r;
		for(int i=1;i<=100;i++) {
			int n=i;
			int s=0;
			while(n>0) {
				r=n%10;
				s=(s*10)+r;
				n=n/10;
			}
			if(s==i) {
				System.out.println(s);
			}
		}
		*/
		
		/*
		// 7. Print the count of the given number
		
		int n = 647283;
		int count=0;
		
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println(count+" : Coount of the Number");
		*/
		
		/*
		// 8. Find the Sum of the digit
		int n=742856;
		int sum = 0;
		int r;
		while(n>0) {
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum+" : Sum of Number");
		*/
		
		/*
		//9.Swap of two number using third variable
		int n1=12;
		int n2=24;
		System.out.println("First Number Before Swapping : "+n1);
		System.out.println("Second Number Before Swapping : "+n2);
		int n3=n1;
		n1=n2;
		n2=n3;
		System.out.println("First Number After Swapping : "+n1);
		System.out.println("Second Number After Swapping : "+n2);
		*/
		
		/*
		//10.Swap of two variable without using third variable
		int n1=12;
		int n2=24;
		System.out.println("First Number Before Swapping : "+n1);
		System.out.println("First Number Before Swapping : "+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("First Number After Swapping : "+n1);
		System.out.println("Second Number After Swapping : "+n2);
		*/
		
		/*
		//11. To find even/odd number:
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Valid Number");
		int n= sc.nextInt();
		
			if (n%2==0) {
				System.out.println(n+" : This is Even Number");
			}
				else if(n%2==1) {
					System.out.println(n+" : This is Odd Number");
				}
				else {
					System.out.println(n+" : Please Enter The Valid Number");
				}
			*/
		
		/*
		//12. Count of even and odd count
		int count_even=0;
		int count_odd=0;
		for(int i=1;i<=100;i++) {
			if (i%2==0) {
				count_even++;
			}
			else if(i%2==1) {
				count_odd++;
			}
		}
		System.out.println(count_even+" : Count of Even Number");
		System.out.println(count_odd+" : Count of Odd Number");
			*/
		
		/*
		// 13. Fibonacci series:
		int count=0;
		int n1=0;
		int n2=1;
		int n3;
		for(int i=1;i<=10;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
		}
		*/
		
		/*
		// 14. Print the value in Fibonacci series up to 100
		int n1=0;
		int n2=1;
		int n3;
		for(int i=1;i<=100;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			if(n3>100) {
			break;
			}
			System.out.print(n3+" ");
		}
		*/
		
		/*
		//15. Reverse the String
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Your Name");
//		String s= sc.next();
		String s = "PUSHKAR";
		String t = "";
		for(int i=s.length()-1;i>=0;i--) {
			t=t+s.charAt(i);
		}
		System.out.println(t);
		*/
		
		/*
		//16.To Check the String is palindrome or not.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String s = sc.next();
		//String s="RADAR";
		String r="";
		for(int i=s.length()-1;i>=0;i--) {
			r=r+s.charAt(i);
		}
		if(s.equals(r)) {
			System.out.println(r+" : It is Palindrome.");
		}
		else {
			System.out.println(r+" : It is NOT Palindrome.");
		}
		*/
		
		/*
		// 17.Count of each Character in the String
		String str="AaAaBbBb AaAaBbBb AaAaBbBb";
		String str2=str.toLowerCase();
		System.out.println(str2);
		
		Map<Character, Integer> charMapCount = new HashMap<>();
		for(Character c : str2.toCharArray()) {
			if(charMapCount.containsKey(c)) {
				charMapCount.put(c, charMapCount.get(c)+1);
			}
			else {
				charMapCount.put(c, 1);
			}
		}
		System.out.println(charMapCount);
		*/
		
		
		/*
		 //18.Count of each Word
		String s = "Welcome To Selenium";
		int count = 1;
		for(int i=1;i<=s.length()-1;i++) {
			if ((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')){
				count++;
			}
		}
		System.out.println("Count of Word : "+count);
		*/
		
		/*
		// 19. Print the numbers in ascending order
		int a[]=  {6,9,1,2,3,4,5};
		int temp=0;
		System.out.println("Before Ascending Order : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println();
		System.out.println("After Ascending Order : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		*/
		
		/*
		//20.Print the numbers in descending order
		int a[]= {7,32,453,1,435,892};
		System.out.println("Before Descending Order : ");
		int desc=0;
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
				desc=a[i];
				a[i]=a[j];
				a[j]=desc;
				}
			}
		}
		System.out.println();
		System.out.println("After Descending Order : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		*/
		
		/*
		//21.Print Triangle with Stars in "L" shape

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		/*
		//22. Assume the string is he,xa,wa,re and give the output as
		String s = "he,xa,wa,re";
		String s2=s.replace(",", "");
		System.out.println(s2);
		*/
		
		/*
		//23.Find the special character, uppercase, lowercase, Number of digits in the given string
		String s = "Hi Welcome To Java Classes Tommorow At 2.00 p.m!!\\\\";
		int count_lowercase=0;
		int count_uppercase=0;
		int count_number =0;
		int count_specialcharacter=0;
		for(int i=0;i<=s.length() - 1;i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				count_lowercase++;
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z') {	
				count_uppercase++;
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9') {	
				count_number++;
			}
			else {
				count_specialcharacter++;
			}
		}
			System.out.println("Count of Lowercase : "+count_lowercase);
			System.out.println("Count of Uppercase : "+count_uppercase);
			System.out.println("Count of Number : "+count_number);
			System.out.println("Count of Special Character : "+count_specialcharacter);
			*/
		/*
		//24. Print Reverse triangle without Space
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
		//25 . Check Whether the given number is prime or not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Valid Number : ");
		int n = sc.nextInt();
		
		int count =0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
			}
		if(count<3) {
			System.out.println("This is prime number : "+n);
		}
		else if(count>2) {
			System.out.println("This is not prime number : "+n);
		}
		else {
			System.out.println("Enter your Valid Number : "+n);
		}
		*/
		
		/*
		//26. Print the prime numbers counts available between 1 to 100
		
		int count = 0;
		int count_prime=0;
		System.out.print("All prime Numbers : ");
		for(int i=2;i<=100;i++) {
			count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			
			if(count==0) {
				count_prime++;
				System.out.print(i+" ");
		}
		
		}
		System.out.println();
		System.out.println("Number of prime Number : "+count_prime);
		*/
		
		/*
		//27. Multiplication of the given number
		int n=5;
		for(int i=1;i<=10;i++) {
			System.out.println(n+" "+"*"+" "+i+" "+"="+" "+n*i);
		}
		*/
		
		/*
		//28. Biggest of 4 number
		int a[]= {1123,13,243,75};
		int max= a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum number : "+max);
		*/
		
		/*
		//29. Find the 3rd maximum Number in an given array.
		
		int a[]= {1123,13,243,75,800};
		int max =0;
		System.out.println("Given Numbers : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					max = a[i];
					a[i]=a[j];
					a[j]=max;
				}
			}
		}
		System.out.println();
		System.out.println(a[2]+" : This is the 3rd highest number");
		*/
		
		/*
		//30. Separate reverse of each word in the string
		String s="Green Apple";
		String [] word = s.split(" ");
		String reverse_string = "";
		for(String w:word) {
			String reverse_word="";
			for(int i=w.length()-1;i>=0;i--) {
				reverse_word=reverse_word+w.charAt(i);
			}
			reverse_string=reverse_string+reverse_word+" ";
		}
		System.out.println("Reverse Of String : "+reverse_string);
		*/
		
		/*
		//31. Number triangle
		for(int i=1;i<=5;i++) {
			System.out.println();
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		*/
		
		/*
		//32. Find the duplicate count in an array
		String a[]= {"java","java"};
		HashSet <String> s1=new HashSet<>();
		boolean  flag=false;
		for(String l:a) {
			if(s1.add(l)==false) {
				System.out.println("Duplicate array found : "+l);
				flag=true;
			}
		}
		if(flag=false) {
			System.out.println("No Duplicate Array");
		}
		*/		
		
		
		//33.Find the duplicate count in the string
		
		
		
   

		



		
         /*
		//34.Count of the palindrome number between 1 to 1000
		
		int count=0;
		for(int i=1;i<=1000;i++) {
			int n=i;
			int r;
			int s=0;
			while(n>0) {
				r=n%10;
				s=(s*10)+r;
				n=n/10;
			}
			if(s==i) {
				count++;
		}			
		}
		System.out.println("Count of Palindrome Number : "+count);
		*/
		
		/*
		//35. Count of the amstrong number between 1 to 100035. Count of the amstrong number
		
		int count=0;
		for(int i=1;i<=1000;i++) {
			int n=i;
			int r;
			int s=0;
			while(n>0) {
				r=n%10;
				s=(r*r*r)+s;
				n=n/10;
			}
			if(s==i) {
				count++;
			}
		}
		System.out.println("Count of armstrong Number : "+count);
		*/
		
		// 36.Construct the triangle pyramid with number
		
		/*
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("  ");
			}
			for (int j=i; j >= 1; j--) {
                System.out.print(j+" ");
            }
			for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
			System.out.println();
		}
		*/
		
		
		/*
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		*/
		
		
		
		
		
		
		
		/*
		//38.Sum of the odd and even number
		
		int count_even=0;
		int count_odd=0;
		int add_even=0;
		int add_odd=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				count_even++;
				add_even=add_even+i;
			}
			if(i%2==1) {
				count_odd++;
				add_odd=add_odd+i;
			}
		}
		System.out.println("Count of even number : "+count_even);	
		System.out.println("Count of even number : "+count_odd);
		System.out.println("Sum of even number : "+add_even);	
		System.out.println("Sum of even number : "+add_odd);
		*/
		
		/*
		//39.Count of Uppercase, lowercase, digits, special character
		String s = "Welcome To JAVA Clas @ 12345";
		int count_lowercase=0;
		int count_uppercase=0;
		int count_number=0;
		int count_speacialchar=0;
		for(int i=1;i<=s.length()-1;i++) {
			char ch = s.charAt(i);
			if(Character.isLowerCase(ch)) {
				count_lowercase++;
			}
			else if(Character.isUpperCase(ch)) {
				count_uppercase++;
			}
			else if(Character.isDigit(ch)) {
				count_number++;
			}
			else {
				count_speacialchar++;
			}
		}
		System.out.println("Count of lower case : "+count_lowercase);
		System.out.println("Count of Upper case : "+count_uppercase);
		System.out.println("Count of Number : "+count_number);
		System.out.println("Count of Special Character : "+count_speacialchar);
		*/
		
		/*
		// 30. Separate reverse of each word in the string
		String s="Green Apple";
		String [] word = s.split(" ");
		String reverse_string = "";
		for(String w:word) {
			String reverse_word="";
			for(int i=w.length()-1;i>=0;i--) {
				reverse_word=reverse_word+w.charAt(i);
			}
			reverse_string=reverse_string+reverse_word+" ";
		}
		System.out.println("Reverse Of String : "+reverse_string);
		*/
		
		
		
		
		
		
		
		
		
		
	}

}
