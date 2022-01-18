package arrays;

import java.util.*;

public class Union_Intersection {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int n1=obj.nextInt();
		int a[]=new int[n1];
		for(int i=0;i<n1;i++)
			a[i]=obj.nextInt();
		int n2=obj.nextInt();
		int b[]=new int[n2];
		for(int i=0;i<n2;i++)
			b[i]=obj.nextInt();
		HashSet<Integer> u=new HashSet<Integer>();
		ArrayList<Integer> in=new ArrayList<Integer>();
		for(int i=0;i<n1;i++)
			u.add(a[i]);
		int ps,as;
		for(int i=0;i<n2;i++)
		{
			ps=u.size();
			u.add(b[i]);
			as=u.size();
			if(ps==as)
				in.add(b[i]);
		}
		System.out.println("Union"+u);
		System.out.println("Intersection"+in);
		obj.close();
	}
	
	

}
