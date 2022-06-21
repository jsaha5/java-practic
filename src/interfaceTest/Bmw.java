package interfaceTest;

public class Bmw implements Car{

	@Override
	public void door() {
		System.out.println("Door Method is calling from class Bmw");
		
	}

	@Override
	public void wheel() {
		System.out.println("wheel Method is calling from class Bmw");
		
	}
	
	

}
