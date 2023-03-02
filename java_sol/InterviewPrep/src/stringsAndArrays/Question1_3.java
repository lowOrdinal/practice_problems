package stringsAndArrays;

public class Question1_3 {
	
	//replace whitespace with '%20'
	public String urlify(String str) {
		StringBuilder result = new StringBuilder();
		for (int i=0; i< str.length(); i++) {
			if (str.charAt(i) == ' ') {
				result.append("%20");
			}
			else {
				result.append(str.charAt(i));
			}
		}
		return result.toString();
	}
	
	public void test() {
		String test1 = "Time for clowning";
		String form = "String: %s\nOutput: %s";
		String response = String.format(form, test1, urlify(test1));
		System.out.print(response);
	}
	
	public static void main(String[] args) {
		new Question1_3().test();
		
	}

}
