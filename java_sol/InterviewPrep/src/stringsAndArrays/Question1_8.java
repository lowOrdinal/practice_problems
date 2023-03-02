package stringsAndArrays;

import java.util.Arrays;

public class Question1_8 {
	
	// zeros out any row and column which contains at least one zero already
	public int[][] fillZeros(int[][] arr) {
		
		//iterate through array and locate zeros
		int [] zeroRows = new int[arr.length];
		int [] zeroCols = new int[arr[0].length];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col <arr[row].length; col++) {
				if (arr[row][col] == 0) {
					zeroRows[row] = 1;
					zeroCols[col] = 1;
				}
			}
		}
		
		// zero rows
		for (int i=0; i<zeroRows.length; i++) {
			if (zeroRows[i] == 1) {
				Arrays.fill(arr[i], 0);
			}
		}
		
		// zero cols
		for (int j=0; j<zeroCols.length; j++) {
			if (zeroCols[j] == 1) {
				for (int [] row : arr) {
					row[j] = 0;
				}
			}
		}
		return arr;
	}
	
	private void test() {
		int[][] input = new int[8][4];
		for (int [] row : input) {
			Arrays.fill(row, 1);
		}
		input[1][2] = 0;
		input[2][2] = 0;
		input[3][0] = 0;
		System.out.println("Input:");
		for (int i = 0; i< input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				System.out.print(input[i][j]);
				System.out.print(' ');
			}
			System.out.print('\n');
		}
		input = fillZeros(input);
		System.out.println("Output:");
		for (int i = 0; i< input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				System.out.print(input[i][j]);
				System.out.print(' ');
			}
			System.out.print('\n');
		}
	}
	
	public static void main(String[] args) {
		new Question1_8().test();
	}

}
