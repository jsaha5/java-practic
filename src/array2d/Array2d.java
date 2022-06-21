package array2d;

public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] x = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 8, 9 } };
		int[][]z=new int [3][3];

		for (int row = 0; row <x.length; row++) {
			for (int col = 0; col <x.length; col++) {
				z[row][col] = (x[row][col] + x[row + 1][col + 1] + x[row + 2][col + 2])-(x[row][col+2] + x[row + 1][col + 1] + x[row + 2][col + 0]);
				System.out.println("sum of x series:- "+z[row][col]);

			}
		}
		

	}
}