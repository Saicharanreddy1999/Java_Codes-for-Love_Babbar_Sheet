package arrays;

import java.util.Scanner;

public class Max_min {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a Number of Values:");
		int n=obj.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Numbers:");
		for(int i=0;i<n;i++)
			a[i]=obj.nextInt();
		int min=a[0],max=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]>max)
				max=a[i];
			else if(a[i]<min)
				min=a[i];	
		}
		System.out.println("Max:"+max+"\nMin:"+min);
		obj.close();
	}

}
