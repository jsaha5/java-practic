package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class inserUserValueArraylist {

	public static void main(String[] args) {
		ArrayList<String> arr= new ArrayList<String>();
		try (Scanner sc = new Scanner(System.in)) {
			for(int i = 0; i<=4; i++)
			{
				String str = sc.nextLine();
				arr.add(str);
			}
			System.out.println(arr);
		}
		

	}

}
