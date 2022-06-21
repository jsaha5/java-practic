package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Hello");
		hs.add("Helllo");
		System.out.println(hs);
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Hello");
		lhs.add("Hello");
		System.out.println(lhs);
	}

}
