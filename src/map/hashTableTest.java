package map;

import java.util.Hashtable;

public class hashTableTest {

	public static void main(String[] args) {
		
		Hashtable<String,Integer> hashtable= new Hashtable<String,Integer>();
		hashtable.put("Deb", 200);
		hashtable.put("pooja", 300);
		hashtable.put("abhay", 400);
		hashtable.put("panda", 500);
		hashtable.put("jyoti", 600);
		hashtable.put("shaym", 200);
		hashtable.put("radhe", 300);
		hashtable.put("luke", 400);
		hashtable.put("ben", 500);
		hashtable.put("tom", 600);
		hashtable.put("ram", 600);
		hashtable.put("kebla", 600);
		hashtable.put("raju", 600);
		hashtable.put("kapil", 600);
		hashtable.put("sumona", 600);
		
		System.out.println(hashtable.get("Deb"));
		System.out.println(hashtable.get("pooja"));
		System.out.println(hashtable.get("abhay"));
		System.out.println(hashtable.get("panda"));		
		System.out.println(hashtable.get("jyoti"));
		System.out.println(hashtable.get("shaym"));		
		System.out.println(hashtable.get("radhe"));
		System.out.println(hashtable.get("luke"));
		System.out.println(hashtable.get("ben"));
		System.out.println(hashtable.get("tom"));
		System.out.println(hashtable.get("ram"));
		System.out.println(hashtable.get("kebla"));	
		System.out.println(hashtable.get("raju"));
		System.out.println(hashtable.get("kapil"));
		System.out.println(hashtable.get("sumona"));

		

	}

}
