package stringsAndArrays;

import java.util.HashMap;
import java.util.Map;

public class Question1_4 {

	// determines if the string is a permutation of a palindrome
	private boolean palinPerm (String s) {
		//read through string and get character counts
		s = s.toLowerCase();
		Map<Character,Integer> counts = new HashMap<>();
		int nonwhite = 0;
		for (int i=0; i< s.length(); i++) {
			Character curr = s.charAt(i);
			if (curr == ' ') {
				continue;
			}
			if (!counts.containsKey(curr)) {
				counts.put(curr, 1);
				nonwhite++;
			}
			else {
				counts.put(curr, counts.get(curr)+1);
				nonwhite++;
			}
		}
		//set a flag to track if the length of the string is odd or even
		int flag = 0;
		if (nonwhite % 2 == 1) {
			flag++;
		}
		// iterate through keys making sure all counts are even, excepting one if len is odd
		// return false once violating count has been found
		for (Character k : counts.keySet()) {
			int test = counts.get(k) % 2;
			if (test == 1) {
				flag--;
			}
			if (flag < 0) {
				return false;
			}
		}
		// return true if all character tests are successful
		return true;
		
	}
	
	private void test() {
		String form = "Input: %s\nResult: %s";
		String in = "Tact Coa";
		String response = String.format(form, in, palinPerm(in));
		System.out.print(response);
	}
	
	public static void main(String[] args) {
		new Question1_4().test();
	}
}
