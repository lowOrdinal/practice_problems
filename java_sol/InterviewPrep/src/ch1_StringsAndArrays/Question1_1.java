package ch1_StringsAndArrays;

import java.util.HashSet;
import java.util.Set;

public class Question1_1 {
	
	// determines if input string consists of strictly unique characters
	public boolean isUnique(String arg) {
		Set<Character> visited = new HashSet<>();
		for (int i=0;i<arg.length();i++) {
			Character curr = arg.charAt(i);
			if (visited.contains(curr)) {
				return false;
			}
			visited.add(curr);
		}
		return true;
	}
	
	public void test() {
		String format = "String: %s\nResonse: %s\nString: %s\nResponse: %s\nString: %s\nResonse: %s\n";
		String test1 = "";
		String test2 = "";
		String test3 = "";
		String response = String.format(format, test1, isUnique(test1), test2, isUnique(test2), test3, isUnique(test3));
		System.out.println(response);
	}
	
	public static void main(String[] args) {
		new Question1_1().test();
	}

}
