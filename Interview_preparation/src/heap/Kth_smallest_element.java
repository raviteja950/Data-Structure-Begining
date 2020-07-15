package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Kth_smallest_element {
	public static int maxheap(int n,int a[],int k)
	{
		if(n<k)
		{
			System.out.println("invalid case");
			return -1;
		}
		PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<k;i++)
		{
			maxheap.add(a[i]);
		}
		for(int i=k;i<n;i++)
		{
			if(a[i]<maxheap.peek())
			{
				maxheap.poll();
				maxheap.add(a[i]);
			}
		}
		return maxheap.peek();
	}
	public static int minheap(int n,int a[],int k)
	{
		if(n<k)
		{
			System.out.println("invalid case");
			return -1;
		}
		PriorityQueue<Integer> minheap=new PriorityQueue<>();
		for(int i=0;i<n;i++)
		{
			minheap.add(a[i]);
		}
		for(int i=0;i<k-1;i++)
		{
			minheap.poll();
		}
		return minheap.peek();
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
		int k=sc.nextInt();
		System.out.println(maxheap(n,a,k));
		System.out.println(minheap(n,a,k));
		

	}

}
