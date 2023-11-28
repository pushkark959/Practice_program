package java_Project;

import java.util.HashMap;

public class Duplicate_Count_string_character {

	public static void main(String[] args) {
		// 33.Find the duplicate count in the string
		String s="india";
		String s2=s.toLowerCase();
		HashMap<Character,Integer> CharMapCount = new HashMap<>();
		//char c;
		for(Character c:s2.toCharArray()) {
			if(CharMapCount.containsKey(c)) {
				CharMapCount.put(c, CharMapCount.get(c)+1);
			}
			else {
				CharMapCount.put(c, 1);
			}
		}
		
	
		System.out.println(CharMapCount);
		
		
		
		
	}

}
