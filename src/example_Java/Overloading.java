package example_Java;

public class Overloading {
	
	public  void test(int i, int j) {
		System.out.println("i m in test 1");
		
	}
	
	public  void test(double d) {
		System.out.println("i m in test 2");
	
	}

	public static void main(String[] args) {
		Overloading ov = new Overloading();
		ov.test(1234567898, 9876543);
		ov.test(3.5);
		

	}

}
