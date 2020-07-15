package heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class heap1255
{
	public void minheap(int a[],int k)
	{
		PriorityQueue<Integer> min=new PriorityQueue<>();
		for(int i=0;i<k;i++)
		{
			min.add(a[i]);
		}
		List<Integer> l=new ArrayList<>();
		for(int i=k;i<a.length;i++)
		{
			if(a[i]>min.peek())
			{
				min.poll();
				min.add(a[i]);
			}
		}
		for(int i=0;i<k;i++)
		{
			l.add(min.poll());
		}
		for(int k1:l)
		{
		System.out.print(k1+" ");	
		}
	}
  public void maxheap(int a[],int k)
  {
	 PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
	 for(int i=0;i<a.length;i++)
	 {
		 max.add(a[i]);
	 }
	 List<Integer> l=new ArrayList<Integer>();
	 for(int i=0;i<k;i++)
	 {
		 l.add(max.poll());
	 }
	 for(int ke:l)
	 {
		 System.out.print(ke+" ");
	 }
	
  }
}
public class Top_k_largest_value {

	public static void main(String[] args) 
	{
		heap1255 h=new heap1255();
		Scanner sc=new Scanner (System.in);
           int n=sc.nextInt();
           int a[]=new int[n];
           for(int i=0;i<n;i++)
           {
        	   a[i]=sc.nextInt();
           }
           int k=sc.nextInt();
           h.maxheap(a,k);
           h.minheap(a,k);
	}

}
