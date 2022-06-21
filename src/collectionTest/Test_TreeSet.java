package collectionTest;

import java.util.TreeSet;

public class Test_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>(new CustomizedSorting());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(20);
		System.out.println("Customized Sorting");
		System.out.println(t);	
		
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(10);
		t1.add(0);
		t1.add(15);
		t1.add(20);
		t1.add(20);
		System.out.println("Natural Sorting");
		System.out.println(t1);	
		
		TreeSet<String> s1 = new TreeSet<String>();
		s1.add("amit");
		s1.add("subham");
		s1.add("jyoti");
		s1.add("debmitra");
		s1.add("debmitra");
		System.out.println("Natural Sorting");
		System.out.println(s1);
	
		TreeSet s2 = new TreeSet(new StringSorting());
		s2.add("amit");
		s2.add("subham");
		s2.add("jyoti");
		s2.add("debmitra");
		s2.add("debmitra");
		s2.add(new StringBuffer("deb"));
		System.out.println("character length Sorting");
		System.out.println(s2);	
}

}
