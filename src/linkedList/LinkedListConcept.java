package linkedList;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList <String> ll= new LinkedList<String>();
		
		ll.add("deb");
		ll.add("mitra");
		ll.add("Bhattacharjee");
		
		System.out.println("Linked list Element:- "+ll);
		
		ll.addFirst("MR");
		ll.addLast("B506");
		System.out.println("Linked list Element:- "+ll);
		
		System.out.println("get 2nd element:- "+ll.get(2));
		
		ll.set(2, "dennis");
		
		System.out.println("replace 2nd element:- "+ll);
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Linked list Element:- "+ll);
		
		for(String str : ll)
		{
			System.out.println(str);
		}
		
	}

}
