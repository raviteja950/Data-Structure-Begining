package stacks_and_queue;
import java.util.*;
public class Sliding_window_1 
{
   static  void  sliding(int a[],int n,int k)
   {
	   Deque<Integer> d=new LinkedList<>();
	   int ans[]=new int[n-k+1];
	   int i=0;
	   for(;i<k;i++)
	   {
		   while(!d.isEmpty() && a[d.peekLast()]<=a[i])
		   {
			   d.removeLast();
		   }
		   d.addLast(i);
	   }
	   for(;i<n;i++)
	   {
		   ans[i-k]=a[d.peekFirst()];
		   while(!d.isEmpty() && d.peekFirst()<=i-k)
		   {
			   d.removeFirst();
		   }
		   while(!d.isEmpty()&& a[d.peekFirst()]<=a[i])
		   {
			   d.removeLast();
		   }
		   d.addLast(i);
	   }
	    ans[i-k]=a[d.peekFirst()];
	    
	    for(int x:ans)
	    {
	    	System.out.print(x+" ");
	    }
	     
   }
	
	
	public static void main(String[] args)
	{
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
    	  a[i]=sc.nextInt();                //12, 1, 78, 90, 57, 89, 56
      }
      int k=sc.nextInt();
      sliding(a,n,k);
      
	}
}
