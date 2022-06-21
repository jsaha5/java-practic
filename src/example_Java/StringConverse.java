package example_Java;

import java.util.Scanner;

public class StringConverse {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str;
			System.out.println("Enter a string :-");
			str=sc.nextLine();
			for(int i =0; i < str.length();i++)
			{
				char a=str.charAt(i);
				System.out.println(a);

			}
			
			Integer a = new Integer(10);
			int b=a;//unboxing
			System.out.println(b);
			int c= 10;
			a=c;
			System.out.println(a);
			
		}
		
	}

}
