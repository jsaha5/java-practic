package overRidding;

public class BMW extends Car{
	

	public void start()

	{
	
		System.out.println("bmw start the car");
	}
	
	public void stop()
	{
		super.stop();
		System.out.println("bmw stop the car");
	}
	
	public void refuel()
	{
		super.refuel();
		System.out.println("bmw refuel the car");
	}
	
	BMW get()
	{
		return this;
	}
}
