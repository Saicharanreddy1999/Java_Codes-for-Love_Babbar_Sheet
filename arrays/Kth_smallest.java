package arrays;

import java.util.*;

public class Kth_smallest {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a Number of Values:");
		int n=obj.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Numbers:");
		for(int i=0;i<n;i++)
			a[i]=obj.nextInt();
		System.out.print("Enter value of k:");
		int k=obj.nextInt();
    Arrays.sort(a);
    System.out.println(a[k-1]);
    obj.close();
	}
}
