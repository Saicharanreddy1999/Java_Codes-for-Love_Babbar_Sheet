package arrays;

import java.util.Scanner;

public class Reverse_an_array {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter number of Values:");
		int n=obj.nextInt();
		int a[]=new int[n];
		int temp;
		System.out.println("Enter Numbers:");
		for(int i=0;i<n;i++)
			a[i]=obj.nextInt();
		for(int i=0;i<n/2;i++)
		{
			temp=a[i];
			a[i]=a[n-1-i];
			a[n-1-i]=temp;
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		obj.close();
	}
}
