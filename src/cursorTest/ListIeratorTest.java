package cursorTest;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIeratorTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("Debmitra");
		list.add("Monalisa");
		list.add("Nandini");
		list.add("surbhi");
		System.out.println(list);
		ListIterator ltr= list.listIterator();
		while (ltr.hasNext())
		{
			String s = (String) ltr.next();
			if(s.equals("Nandini"))
			{
				ltr.remove();
			}
			else if(s.equals("surbhi"))
			{
				ltr.set("Monalisa");
			}
		}
		System.out.println(list);
	}

}
