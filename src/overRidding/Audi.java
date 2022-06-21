package overRidding;

public class Audi extends Car {

	public void start()
	{
		System.out.println("audi start the car");
	}
	
	public void stop()
	{
		System.out.println("audi stop the car");
	}
	
	public void refuel()
	{
		System.out.println("audi refuel the car");
	}
	
	Audi get()
	{
		return this;
	}
	
	public void message() {
		System.out.println("Covariant Return Type");
		
	}
}
