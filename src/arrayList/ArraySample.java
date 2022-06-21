package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraySample {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Debmitra", 30, "QA Lead");
		Employee emp1 = new Employee("Madhuri", 31, "QA Lead");
		Employee emp2 = new Employee("Pooja", 33, "Sr QA");
		Employee emp3 = new Employee("Hyma", 21, "Qa");

		ArrayList<Employee> arr = new ArrayList<Employee>();
		arr.add(emp);
		arr.add(emp1);
		arr.add(emp2);
		arr.add(emp3);
		
		
		System.out.println(arr.size());
		
		Iterator<Employee> it=arr.iterator();
		while(it.hasNext())
		{
			Employee employee = it.next();
			System.out.println(employee.name);
			System.out.println(employee.age);
			System.out.println(employee.dept);
		}
		
		System.out.println("************************************************");
		
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("Avici");
		arr1.add("Allen Walker");
		arr1.add("David Guetta");
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("5000");
		arr2.add("3500");
		arr2.add("4000");
		
		arr1.addAll(arr2);
		
		for(int i=0; i<arr1.size();i++)
		{
			System.out.println(arr1.get(i));
		}
		
System.out.println("************************************************");
		
		ArrayList<String> arr3 = new ArrayList<String>();
		arr3.add("Avici");
		arr3.add("Allen Walker");
		arr3.add("David Guetta");
		
		ArrayList<String> arr4 = new ArrayList<String>();
		arr4.add("Avici");
		arr4.add("3500");
		arr4.add("4000");
		
		arr3.retainAll(arr4);
		
		for(int i=0; i<arr3.size();i++)
		{
			System.out.println(arr3.get(i));
		}
		
	}

}
