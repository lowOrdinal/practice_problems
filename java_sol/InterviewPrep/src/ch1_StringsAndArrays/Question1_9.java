package ch1_StringsAndArrays;

public class Question1_9 {
	
	// tests to see if s1 is a string rotation of s2
	// this involves the observation if s2 is a string rotation of s1, then
	// s2 is a substring of s1s1
	public boolean isStringRotation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		else {
			return (s1+s1).contains(s2);
		}
	}
	
	private void test() {
		String form = "Inputs: %s ; %s\nResult: %s";
		String input1 = "waterbottle";
		String input2 = "erbottlewat";
		String response = String.format(form, input1, input2, isStringRotation(input1,input2));
		System.out.print(response);
	}
	
	public static void main(String[] args) {
		new Question1_9().test();
	}
	
}
