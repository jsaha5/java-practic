package abstractClass;

public class FourWheeler extends carClass {

	public static void main(String[] args) {
		
		carClass cc= (carClass) new FourWheeler();
		cc.wheel(); //method 1:- type cast the object and call by the object
		//carClass.wheel(); // method 2:- if non abstract method is decleard as static then we can call directly using class name.
		FourWheeler bd = new FourWheeler();
		bd.wheel();// method 3:- we can call using child class object
		bd.door();
		bmw bmw = new bmw();
		bmw.door();

	}

	@Override
	public void door() {
		System.out.println("four wheel car door");
		
	}

}
