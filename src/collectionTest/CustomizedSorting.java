package collectionTest;

import java.util.Comparator;

public class CustomizedSorting implements Comparator<Integer> {
	
	@Override
	public int compare(Integer I1, Integer I2) {
		I1= (Integer) I1;
		I2= (Integer) I2;
		return -I1.compareTo(I2);
		
		
	}
}
