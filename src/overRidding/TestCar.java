package overRidding;

public class TestCar {

	public static void main(String[] args) {
		
		BMW bd = new BMW();// static Polymorphism or compile time Polymorphism. 
		bd.start();
		bd.stop();
		bd.stop();
		
		Audi audi = new Audi();
		audi.start();
		audi.stop();
		audi.stop();
		audi.get().message();
		
		Car car = new BMW(); //child class object can be refered by parent class variable is called run time or dynamic Polymorphism
		car.start();
		car.stop();
		car.stop();
		
	}

}
