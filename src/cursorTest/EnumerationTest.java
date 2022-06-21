package cursorTest;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i=0; i<=10; i++)
		{
			v.addElement(i);
			System.out.println(i);
		}
		Enumeration E=v.elements();
		while(E.hasMoreElements())
		{
			Integer i = (Integer) E.nextElement();
			if(i%2==0)
			System.out.println(i);
		}
		System.out.println(v);
	}

}
