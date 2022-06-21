package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AUzs-nV";
		int count = 0;
		int n = 7;
		Matcher num = Pattern.compile("[0123456789]").matcher(s);
		Matcher small = Pattern.compile("[abcdefghijklmnopqrstuvwxyz]").matcher(s);
		Matcher cap = Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]").matcher(s);
		Matcher special = Pattern.compile("[!@#$%^&*()+-]").matcher(s);
		
		if (!num.find()) {
			count++;
		}
		if (!small.find()) {
			count++;
		}
		if (!cap.find()) {
			count++;
		}
		if (!special.find()) {
			count++;
		}
		if ((n + count) < 6) {
			count += 6 - n - count;
		}

		System.out.println(count);

	}

}
