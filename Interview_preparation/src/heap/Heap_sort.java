package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Heap_sort {
	public static void heapsort(int a[],int n)
	{
		PriorityQueue<Integer> minheap=new PriorityQueue<>();
		for(int i=0;i<n;i++)
		{
			minheap.add(a[i]);
		}
		for(int i=0;i<n;i++)
		{
			a[i]=minheap.poll();
		}
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
		heapsort(a,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
