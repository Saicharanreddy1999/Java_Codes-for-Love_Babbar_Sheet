package arrays;

import java.util.Scanner;

public class Sort012 {

	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter numberof values:");
		int n=obj.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=obj.nextInt();
		int l=0,mid=0,m=n-1,temp=0;
		while(mid<=m)
		{
			switch(a[mid])
			{
			case 0:
				temp=a[l];
				a[l]=a[mid];
				a[mid]=temp;
				mid++;
				l++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				temp=a[m];
				a[m]=a[mid];
				a[mid]=a[m];
				m--;
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");	
		obj.close();
	}
}
