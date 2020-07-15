package heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Connect_different_rop_into_one_bigrope_miniCost {
	public static int usingminheap(int a[])
	{
		PriorityQueue<Integer> minheap=new PriorityQueue<>();
		for(int i=0;i<a.length;i++)
		{
			minheap.add(a[i]);
		}
		int cost=0;
		while(minheap.size()>1)
		{
			int temp=minheap.poll()+minheap.poll();
			cost=cost+temp;
			minheap.add(temp);
		}
		return cost;
	}

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println(Connect_different_rop_into_one_bigrope_miniCost.usingminheap(a));

	}

}
