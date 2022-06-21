package integerArray;

import java.util.Scanner;

public class PrintStar {

	public static void main(String[] args) {

		System.out.println("Enter a number to print");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("x");
				}
			System.out.println();
			}
		System.out.println("------------------------");
		for (int k = num; k >= 1; k--) {
			for (int l = k; l >= 1; l--) {
				System.out.print("x");
			}
			System.out.println();
			}
		System.out.println("------------------------");
		for (int i = 1; i <= num; i++) {
			for (int j = num - 1; j >= i; j--) {
				System.out.print(" ");
				}
			for (int k = 1; k <= i; k++) {
				System.out.print("x");
				}
			System.out.println();
			}
		}
	}
