package overRidding;

public class Car {
	
	public void start()
	{
		System.out.println("start the car");
	}
	
	public void stop()
	{
		System.out.println("stop the car");
	}
	
	public void refuel()
	{
		System.out.println("refuel the car");
	}
	
	Car get()
	{
		return this;
	}



}
