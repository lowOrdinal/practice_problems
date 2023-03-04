package ch1_StringsAndArrays;

public class Question1_6 {
	
	//naively compresses string. returns original string if resulting compression is not actually shorter
	private String naiveCompress(String s) {
	
		// initialize block head and count, and result sb 
		// (only starts at 0 for this initial run because technically head hasn't been seen yet)
		char head = s.charAt(0);
		int count = 0;
		StringBuffer sb = new StringBuffer();
		
		// iterate through string, counting lengths of blocks.
		// when block changes, move block head + count to result sb and reinitialize head and counts
		for (int i=0; i< s.length(); i++) {
			char curr = s.charAt(i);
			if (curr != head) {
				sb.append(head);
				sb.append(count);
				head = curr;
				count = 1;
			}
			else {
				count++;
			}
		}
		// add last block to result, sanity check, and return;
		sb.append(head);
		sb.append(count);
		String result = sb.toString();
		if (result.length() < s.length()) {
			return result;
		}
		else {
			return s;
		}
	}
	
	private void test() {
		String form = "Input: %s\nOutput: %s";
		String input = "aabcccccaaa";
		String response = String.format(form, input, naiveCompress(input));
		System.out.print(response);
	}
	
	public static void main (String[] args) {
		new Question1_6().test();
	}
}
