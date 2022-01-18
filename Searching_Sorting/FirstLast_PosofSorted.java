package Searching_Sorting;
import java.util.*;
public class FirstLast_PosofSorted {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Number of Numbers:");
		int n=obj.nextInt();
		int a[]=new int[n];
		int first=-1,last=-1;
		System.out.println("Enter Sorted Array");
		for(int i=0;i<n;i++)
			a[i]=obj.nextInt();
		System.out.print("Enter a Number to Search:");
		int x=obj.nextInt();
		obj.close();
		for(int i=0;i<n;i++)
		{
			if(x!=a[i])
				continue;
			if(first==-1)
				first=i;
				last=i;
		}
		if(first!=-1)
		{
			System.out.println("First Occurance:"+first);
			System.out.println("Last Occurance:"+last);
		}
		else
			System.out.println("Not Found");
	}
}
