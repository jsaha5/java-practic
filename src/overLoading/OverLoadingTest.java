package overLoading;

public class OverLoadingTest {
	
	public int sum(int a, int b)
	{
		System.out.println("first methodb "+(a+b));
		return b;
	}
	
	public void sum(float a, int b)
	{
		System.out.println("second method "+(a+b));
	}

	public static void main(String[] args) 
	{
		OverLoadingTest ot = new OverLoadingTest();
		ot.sum(10, 20);
		ot.sum(10, 20);

	}
}


