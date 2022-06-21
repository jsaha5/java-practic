package collectionTest;

import java.util.Comparator;

public class StringSorting implements Comparator<Object> {

	@Override
	public int compare(Object s1, Object s2) {
		
		String k1=s1.toString();
		String k2=s2.toString();
		int l1= k1.length();
		int l2= k2.length();
		if (l1<l2)
			return -1;
		else if (l1>l2)
			return +1;
		
		return k1.compareTo(k2);
	}
	
	

}


