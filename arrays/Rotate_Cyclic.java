package arrays;
import java.util.*;
public class Rotate_Cyclic {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter number of Values:");
		int n=obj.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=obj.nextInt();
		int temp=a[n-1];
		for(int i=n-1;i>=1;i--)
			a[i]=a[i-1];
		a[0]=temp;
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
			obj.close();
		
		
	}

}
