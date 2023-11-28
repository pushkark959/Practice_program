package java_Project;

public class B37_Count_vowels_nonvowels {

	public static void main(String[] args) {
		// 37. Count of vowels and non vowels
		
		/*
		String s="welcome";
		String s2=s.toLowerCase();
		int count_vowels=0;
		int count_nonvowels=0;
		for(int i=0;i<=s2.length()-1;i++) {
			char c=s2.charAt(i);
			if(c>='a' && c<='z'){
				if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')){
					count_vowels++;
					System.out.println("Vowels : "+c);
				}
				else {
					System.out.println("Non Vowels : "+c);
					count_nonvowels++;
				}
			}
			
			
		}
		System.out.println();
		System.out.println("Number of vowels : "+count_vowels);
		System.out.println("Number of Non vowels : "+count_nonvowels);
		*/
		
		String s="Welcome";
		String s2=s.toLowerCase();
		int vowel_count=0;
		int nonvowel_count=0;
		for(int i=0;i<=s2.length()-1;i++) {
			if((s2.charAt(i)=='a')||(s2.charAt(i)=='e')||(s2.charAt(i)=='i')||(s2.charAt(i)=='o')||(s2.charAt(i)=='u')) {
				vowel_count++;
			}
			else {
				nonvowel_count++;
			}
		}
		System.out.println("Count of Vowel count : "+vowel_count);
		System.out.println("Count of Vowel count : "+nonvowel_count);	

	}

}
