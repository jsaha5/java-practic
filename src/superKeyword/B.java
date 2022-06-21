package superKeyword;

public class B extends A{
	
	B()
	{
		super();
	}
	public void show(int a)
	{
		
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		super.show();
		
		
		
	}

}
