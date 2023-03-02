package stringsAndArrays;

public class Question1_2 {
	
	//check if str1 is a permutation of str2
	public boolean permCheck(String str1, String str2) {
		int len = str1.length();
		if (len != str2.length()) {
			return false;
		}
		int [] counts = new int[256];
		for (int i =0; i< len; i++) {
			int dex = str1.charAt(i);
			counts[dex]++;
		}
		for (int j=0; j<len; j++) {
			int dex = str2.charAt(j);
			counts[dex]--;
			if (counts[dex] < 0) {
				return false;
			}
		}
		return true;
	}
	
	public void test() {
		String test1 = "Game";
		String test2 = "emaG";
		String form = "String 1: %s; String 2: %s;\nResponse: %s";
		String response = String.format(form, test1,test2,permCheck(test1,test2));
		System.out.print(response);
		
	}
	
	public static void main(String[] args) {
		new Question1_2().test();
	}

}
