package heap;

import java.util.*;

public class Kth_largest_element_in_array {
	public static int klargest(int a[],int n,int k)
	{
		PriorityQueue<Integer> heap=new PriorityQueue<>();
		if(n<k)
		{
			System.out.println("invaid value k");
			return -1;
		}
		for(int i=0;i<k;i++)
		{
			heap.add(a[i]);
		}
		for(int i=k;i<n;i++)
		{
			if(a[i]>heap.peek())
			{
				heap.poll();
				heap.add(a[i]);
			}
		}
		return heap.peek();
	}
	public static int klargestusingmaxheap(int a[],int n,int k)
	{
		PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
		if(n<k)
		{
			System.out.println("invlaid");
			return -1;
		}
		for(int i=0;i<n;i++)
		{
			heap.add(a[i]);
		}
		for(int i=0;i<k-1;i++)
		{
			heap.poll();
		}
		return heap.peek();
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
		System.out.println(klargest(a,n,k));
		System.out.println(klargestusingmaxheap(a,n,k));
		sc.close();
	}

}
