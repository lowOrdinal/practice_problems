package stringsAndArrays;

public class Question1_7 {
	
	// operations assume square matrix
	
	// 90 degree rotation accomplished by reflecting across diagonal, 
	// followed by reflection across center
	public int[][] rotate(int[][] arr) {
		return midReflect(diagReflect(arr));
	}
	
	// inplace matrix reflection across diagonal
	public int[][] diagReflect(int[][] arr) {
		for (int i =0; i < arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		return arr;
	}
		
	// inplace matrix reflection across midpoint
	public int[][] midReflect(int[][] arr) {
		int mid = arr.length/2;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j< mid; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][arr.length-j-1];
				arr[i][arr.length-j-1] = temp;
			}
		}
		
		
		return arr;
	}
	
	private void test() {
		int[][] input = new int[5][5];
		input[0][4] = 5;
		input[1][2] = 7;
		input[2][2] = 1;
		input[3][0] = 9;
		System.out.println("Input:");
		for (int i = 0; i< input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				System.out.print(input[i][j]);
				System.out.print(' ');
			}
			System.out.print('\n');
		}
		input = rotate(input);
		System.out.println("Output:");
		for (int i = 0; i< input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				System.out.print(input[i][j]);
				System.out.print(' ');
			}
			System.out.print('\n');
		}
	}
	
	public static void main(String[] args) {
		new Question1_7().test();
	}
}
