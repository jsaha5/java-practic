package string;

public class FindCaptilalChar {

	public static void main(String[] args) {
		String s="saveChangesInTheEditor";
		int count=1;
		for(int i=0; i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				count++;
			}
				
		}
		System.out.println(count);

	}

}
