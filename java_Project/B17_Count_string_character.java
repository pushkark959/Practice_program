package java_Project;

import java.util.HashMap;

public class B17_Count_string_character {

	public static void main(String[] args) {
		// 17.Count of each Character in the String
		
		String s = "PUSHKAR123p";
		String s2 = s.toLowerCase();
		HashMap<Character,Integer> CountMap  = new HashMap<Character,Integer>();
		for(Character c : s2.toCharArray()) {
			if(CountMap.containsKey(c)) {
				CountMap.put(c, CountMap.get(c)+1);
			}
			else {
				CountMap.put(c, 1);
			}
		}
		System.out.println(CountMap);

	}

}
