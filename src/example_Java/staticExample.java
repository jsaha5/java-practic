package example_Java;

public class staticExample {

	String name = "Debmitra"; //non static global variable
	static int age = 30; //static global variable 
	
	public void sendMail()//non static method
	{
		System.out.println("mail Send!!!");
	}
	
	public static void sum()//static method
	{
		System.out.println("i am in sum method");
	}
	
	public static void main(String[] args) {
		//how to call static method
		// call by method name
		sum();
		//call by class name 
		staticExample.sum();
		//calling static variable
		System.out.println(age);
		System.out.println(staticExample.age);
		//calling static method and variable using onbject
		staticExample obj = new staticExample();
		obj.sum();
	}
}
