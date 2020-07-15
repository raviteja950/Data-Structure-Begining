package heap;
import java.util.*;
import java.util.PriorityQueue;
public class Kth_largest_in_stream {
	PriorityQueue<Integer> heap=new PriorityQueue<>();
	public int add(int num ,int k)
	{
		if(heap.size()<k)
		{
			heap.add(num);
		 return heap.size()==k? heap.peek():-1;
		}
		if(num>heap.peek())
		{
			heap.poll();
			heap.add(num);
		}
		return (heap.peek());
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Kth_largest_in_stream a=new Kth_largest_in_stream();
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println(a.add(arr[i],k ));
		}
		System.out.print(" ");   
		sc.close();

	}

}
