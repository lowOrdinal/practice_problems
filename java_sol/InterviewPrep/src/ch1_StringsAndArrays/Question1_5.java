package ch1_StringsAndArrays;

public class Question1_5 {
	
	//checks if input strings are one edit away from each other
	private boolean oneAway(String s1, String s2) {
		//normalize input and perform sanity checks
		String longer  = "";
		String shorter = "";
		if (s1.length() > s2.length()) {
			longer  = s1;
			shorter = s2;
		}
		else {
			longer  = s2;
			shorter = s1;
		}
		if ((longer.length() - shorter.length()) > 1) {
			return false;
		}
		if (longer.equals(shorter)) {
			return true;
		}
		
		//read through and find the first place they differ
		int shortdex = -1;
		int longdex = -1;
		for (int i=0; i < shorter.length(); i++) {
			char lc = longer.charAt(i);
			char sc = shorter.charAt(i);
			if (lc != sc) {
				longdex = i+1;
				if (shorter.length() < longer.length()) {
					shortdex = i;
				}
				else {
					shortdex = i+1;
				}
				break;
			}
		}
		if (shortdex == -1) {
			return true;
		}
		else {
			String longrem = longer.substring(longdex);
			String shortrem = shorter.substring(shortdex);
			return longrem.equals(shortrem);
		}
	}
	
	private void test() {
		String form = "Inputs: %s ; %s\nResult: %s";
		String in1 = "pale";
		String in2 = "bake";
		String response = String.format(form, in1, in2, oneAway(in1,in2));
		System.out.print(response);
	}
	
	public static void main(String[] args) {
		new Question1_5().test();
	}

}
