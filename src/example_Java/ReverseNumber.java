package example_Java;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int number;
		int rem;
		Scanner sc = new Scanner(System.in);
		number=sc.nextInt();
		while(number>0)
		{
			rem=number%10;
			System.out.print(rem);
			number=number/10;
			
		}
		

	}

}
