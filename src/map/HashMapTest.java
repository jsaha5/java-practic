package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,Integer> m2 = new HashMap<String,Integer>();
		Map<String, Integer> m =  Collections.synchronizedMap(m2);
		m.put("Debmitra",101);
		m.put("sunil",102);
		m.put("raaj",103);
		m.put("Krishna",104);
		m.put("Deb",105);
		//m.put(102,101);
		m.put(null,101);
		System.out.println(m);
		//System.out.println(m.put(134,"rama"));//retun the previous value of the key
		//System.out.println(m.put(102,107));
		Set s = m.keySet();
		System.out.println(s);
		Collection c = m.values();
		System.out.println(c);
		Set s1 = m.entrySet();
		System.out.println(s1);
		Iterator itr = s1.iterator();
		System.out.println("i am here");
		while (itr.hasNext())
		{
			Map.Entry m1= (Map.Entry)itr.next();
			System.out.println("key:- "+ m1.getKey()+" " +"value:-" +m1.getValue());
			if(m1.getKey().equals("sunil"))//null comparison not possible java.lang.NullPointerException
			{
				m1.setValue("Rajkumar");
			}		
		}
		System.out.println(m);
		
		
		ConcurrentHashMap<String, Integer> cocurentmap= new ConcurrentHashMap<String, Integer>();
		cocurentmap.put("deb", 1001);
		

	}

}
