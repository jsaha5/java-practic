package integerArray;

import java.util.Arrays;

public class MaximumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 5, 7, 9 };
		int maxsum = 0;
		int lowsum = 0;
		Arrays.sort(arr);
		for (int i = 1; i < arr.length; i++) {
			maxsum = maxsum + arr[i];
		}
		System.out.println("Max sum" + maxsum);
		for (int i = arr.length - 2; i >= 0; i--) {
			lowsum = lowsum + arr[i];
		}
		System.out.println("Low sum" + lowsum);

	}

}
