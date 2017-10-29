package chapter_1;

public class Permutation {

	public boolean permutationCheck(String a, String b) {
		if(a.length() != b.length())
			return false;
		
		int[] characters = new int[128];
		char[] charactersInA = a.toCharArray();
		for(char c : charactersInA) 
			characters[c]++;
		
		char[] charactersInB = b.toCharArray();
		for(char c: charactersInB)
			characters[c]--;
		
		for(int value : characters)
			if(value != 0)
				return false;
		
		return true;
 	}
	
	public static void main(String[] args) {
		Permutation p = new Permutation();
		System.out.println(p.permutationCheck("!x!1?y!z-", "-!zyx1!!?"));
	}
}
