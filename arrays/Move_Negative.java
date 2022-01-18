package arrays;

import java.util.Scanner;

public class Move_Negative {
	public static void main(String args[]) {
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter number of Values:");
	int n=obj.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
		a[i]=obj.nextInt();
	int temp,j=0;
	for(int i=0;i<n;i++)
	{
		if(a[i]<0)
		{
			if(i!=j)
			{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
			j++;
		}
	}
	for(int i=0;i<n;i++)
	System.out.print(a[i]+" ");
	obj.close();
}

}
