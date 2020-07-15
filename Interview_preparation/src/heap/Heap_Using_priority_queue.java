package heap;
import java.util.*;
public class Heap_Using_priority_queue {
public static void minheap(int a[],int n)
{
	PriorityQueue<Integer> heap=new PriorityQueue<>();
	for(int i=0;i<n;i++)
	{
		heap.add(a[i]);
		System.out.print(heap.peek()+" ");
	}
	System.out.println();
	for(int i=0;i<n;i++)
	{
		heap.poll();
		System.out.print(heap.peek()+" ");
	}
	System.out.println();
}
public static void maxheap(int a[],int n)
{
	PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
    for(int i=0;i<n;i++)
    {
    	heap.add(a[i]);
    	System.out.print(heap.peek()+" ");
    }
    System.out.println();
    for(int i=0;i<n;i++)
    {
    	heap.poll();
    	System.out.print(heap.peek()+" ");
    }
    System.out.println();
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{                                                //10, 7, 11, 5, 2, 13, 1, 45
			a[i]=sc.nextInt();
		}
		minheap(a,n);
		maxheap(a,n);
		sc.close();

	}

}
