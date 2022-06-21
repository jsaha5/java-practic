package string;

public class StringTest {

	public static void main(String[] args) {
		String s = new String("Debmitra");
		String s1 = s.concat("Bhattacharjee");
		System.out.println(s);
		System.out.println(s1);

		StringBuffer sb = new StringBuffer("Debmitra");
		sb.append("Bhattacharjee");
		System.out.println(sb);

		String s2 = new String("Hello");
		String s3 = new String("Hello");
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));
		
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));

	}

}
