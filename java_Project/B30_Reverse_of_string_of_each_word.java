package java_Project;

public class B30_Reverse_of_string_of_each_word {

	public static void main(String[] args) {
		// 30. Separate reverse of each word in the string
		
		String s = "Greens Apple";
		String word[]=s.split(" ");
		String reverse_string="";
		for(String w:word) {
			String reverse_word="";
			{
				for(int i=w.length()-1;i>=0;i--) {
					reverse_word=reverse_word+w.charAt(i);
				}
			}
			reverse_string=reverse_string+reverse_word+" ";
		}
		System.out.println("Reverse of String : "+reverse_string);
	}

}
