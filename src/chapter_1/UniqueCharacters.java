package chapter_1;

import java.util.HashMap;

public class UniqueCharacters {

	public boolean hasUniqueCharacters(String s) {
		char[] charactersInS = s.toCharArray();
		int size = charactersInS.length;
		HashMap<Character, Integer> occurances = new HashMap<>();
		for(char c : charactersInS) {
			if(occurances.containsKey(c)) {
				int count = occurances.get(c);
				occurances.put(c, ++count);
			}else
				occurances.put(c, 1);	
		}
		if(occurances.size() == size)
			return true;
		else
			return false;
	}
}
