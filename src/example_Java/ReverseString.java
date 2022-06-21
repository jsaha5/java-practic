package example_Java;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	    String str;
	  	String revstr=" ";
	  	System.out.println("Enter a string:- ");
	  	Scanner sc = new Scanner(System.in);
	  	str=sc.nextLine();
	  	
	  	for(int i=str.length()-1; i>0; i--)
	  	{
	  		revstr= revstr+str.charAt(i);
	  	}
	  	System.out.println(revstr);
	      }
	


	}

