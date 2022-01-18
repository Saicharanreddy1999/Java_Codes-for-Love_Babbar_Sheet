package Searching_Sorting;
import java.util.*;
public class Value_to_Index {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Number of Numbers:");
		int n=obj.nextInt();
		int a[]=new int[n];
		System.out.println("Enter an Array");
		for(int i=0;i<n;i++)
			a[i]=obj.nextInt();
		int flag=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==(i+1))
			{	
				flag=1;
				System.out.println(i+1);
			}
		}
		if(flag==0)
			System.out.print("Not Found");
		obj.close();
	}	
}
