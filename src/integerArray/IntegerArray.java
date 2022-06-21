package integerArray;

import java.util.Scanner;

public class IntegerArray 
{

	public int[] sort(int[] arr1)
	{
		for(int i=0; i<arr1.length-1;i++)
		{
			for(int j=0;j<arr1.length-1;j++)
			{
				if(arr1[i]<arr1[j])
				{
					int temp=arr1[j];
					arr1[j]=arr1[i];
					arr1[i]=temp;
				}
			}
		}
		return arr1;
	}
	
	public void duplicate(int[] arr2)
	{
		for(int i=0; i<arr2.length;i++)
		{
			for(int j=i+1;j<arr2.length;j++)
			{
				if(arr2[i]==arr2[j])
				{
					System.out.println(arr2[j]);
				}
			}
		}

	}
	
	
	
	
	public static void main(String[] args) 
	{
		IntegerArray ia = new IntegerArray();
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:- ");
		size=sc.nextInt();
		int[] arr = new int[size];
		int[] sort= new int[size];
		System.out.println("Enter the numbers:- ");
		for(int i=0; i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("added numbers:- ");
		for(int i=0; i<size;i++)
		{
			System.out.println(arr[i]);
		}
		sort=ia.sort(arr);
		
		System.out.println("sorted numbers:- ");
		for(int i=0; i<sort.length;i++)
		{
			System.out.println(sort[i]);
		}
		System.out.println("duplicate numbers:- ");
		ia.duplicate(arr);

	}

}
