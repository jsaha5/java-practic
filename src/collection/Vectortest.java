package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Vectortest {

	public static void main(String[] args) {
		Vector <String> v = new Vector<String>();
		v.add("hello");
		v.add("helloo");
		v.add("bolo");
		v.add("hellllo");
		System.out.println(v);
		System.out.println(v.size());
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(100);
		arr.add(12);
		arr.add(113);
		arr.add(10);
		arr.add(11);
		Collections.sort(arr);
		for(int i=0;i<arr.size();i++)
		{
			for(int j=0;j<arr.size();j++)
			{
				if(arr.get(i) < arr.get(j))
				{
					int temp = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, temp);
				}
			}
		}
		
		for(Integer lt : arr)
		{
			System.out.println(lt);
			
		}
		

	}
	

}
