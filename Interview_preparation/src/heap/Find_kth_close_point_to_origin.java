package heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class cordinate
{
	int x;int y;
	public cordinate(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public int distace()
	{
		return x*x+y*y;
	}
	
}




public class Find_kth_close_point_to_origin {

	public static List<cordinate> usingmaxheap(List<cordinate>l,int k)
	{
	    if(l.size()==0)
	    {
	    	return new ArrayList<>();
	    }
	    PriorityQueue<cordinate> maxHeap = new PriorityQueue<>((n1, n2) -> n2.distace() - n1.distace());
	    for(int i=0;i<k;i++)
	    {
	    	maxHeap.add(l.get(i));
	    }
	    for(int i=k;i<l.size();i++)
	    {
	    	if(l.get(i).distace()<maxHeap.peek().distace())
	    	{
	    		maxHeap.poll();
	    		maxHeap.add(l.get(i));
	    	}
	    }
	    List<cordinate> l1=new ArrayList<>();
	    while(!maxHeap.isEmpty())
	    {
	    	l1.add(maxHeap.poll());
	    }
	    return l1;
	}
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		cordinate c1=new cordinate(1,4);
		cordinate c2=new cordinate(2,3);
		cordinate c3=new cordinate(0,4);
		cordinate c4=new cordinate(3,5);
		List<cordinate> l=new ArrayList<>();
		l.add(c1);
		l.add(c2);
		l.add(c3);
		l.add(c4);
		
		List<cordinate> maxheap=Find_kth_close_point_to_origin.usingmaxheap(l,2);
		for(cordinate c:maxheap)
		{
			System.out.println(c.x+" "+c.y);
		}

	}

}
