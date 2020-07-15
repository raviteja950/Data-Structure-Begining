package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Kth_smallest_in_stream {
	PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
   
	public  int add(int num,int k)
	{
		if(maxheap.size()<k)
		{
			maxheap.add(num);
			return maxheap.size()==k?maxheap.peek():-1;
		}
		if(num<maxheap.peek())
		{
			maxheap.poll();
			maxheap.add(num);
		}
		return maxheap.peek();
	}
	public static void main(String[] args) 
	{
		Kth_smallest_in_stream b=new Kth_smallest_in_stream();
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
    	   a[i]=sc.nextInt();
       }
       int k=sc.nextInt();
       for(int i=0;i<n;i++)
       {
    	   System.out.print(b.add(a[i],k) +" ");
       }
       System.out.println(" ");
       
	}
	

}
