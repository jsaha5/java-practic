package interfaceTest;

public class Executable {

	public static void main(String[] args) {
		
		Car driver = new Bmw();
		System.out.println(driver);
		driver.door();
		driver.wheel();
	}

}
