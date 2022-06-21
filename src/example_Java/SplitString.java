package example_Java;

import java.util.ArrayList;
import java.util.List;

public class SplitString {

	public static void main(String[] args) {
//		String str = "Hi how are you";
//		String[] words =str.split(" ");
//		
//		for (String word : words)
//		{
//			System.out.println(word);
//		}
		
		String str = "My name is debmitra Bhattacharjee";
		List<String> lst = new ArrayList<String>();
		char[] charArray = str.toCharArray();
		String strTemp="";
		for(int i =0;i<=charArray.length-1;i++)
		{
			if(charArray[i] != ' ')
			{
				strTemp=strTemp+charArray[i];
			}
			
			else
			{
				lst.add(strTemp);
				strTemp="";
			}
		}
		lst.stream().forEach(n -> System.out.println(n)); 
	}

}
