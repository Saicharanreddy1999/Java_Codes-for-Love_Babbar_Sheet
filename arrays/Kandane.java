package arrays;

import java.util.Scanner;

public class Kandane {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter number of Values:");
		int n=obj.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=obj.nextInt();
		int max=Integer.MIN_VALUE,sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
			if(max<sum)
				max=sum;
			if(sum<0)
				sum=0;
		}
		System.out.println(max);
		obj.close();
	}

}
