package graphs;
import java.util.*;
class raviteja1
{
	List<List<Integer>>l;
	boolean visited[];
	public raviteja1(int nodes)
	{
		l=new ArrayList<>();
		visited=new boolean[nodes];
		for(int i=0;i<nodes;i++)
		{
			l.add(i,new ArrayList<>());
		}
	}
	public void addEdge(int a,int b)
	{
		l.get(a).add(b);            //for undirected graph we use both.
		l.get(b).add(a);            //for directed graph we use only one l.get(a).add(b);
	}
	public int mindistance(int source,int distance)
	{
		if(source==distance)
		{
			return 0;
		}
		Queue<Integer>q=new LinkedList<>();
		int mindistance=0;
		q.add(source);
		visited[source]=true;
		while(!q.isEmpty())
		{
			int size=q.size();
			while(size>0)
			{
				int p=q.remove();
				List<Integer> childlist=l.get(p);
				for(int c:childlist)
				{
					if(c==distance)
					{
						return ++mindistance;
					}
				if(!visited[c])
				{
					q.add(c);
					visited[c]=true;
				}
				}
				size--;
			}
			mindistance++;
		}
		return -1;
	}
}



public class Min_Distance_from_Source_to_Destination 
{
	public static void main(String[] args) 
	{
		int nodes = 6;
	    
	    raviteja1 a = new raviteja1(nodes);
	    
	    a.addEdge(0, 1);
	    a.addEdge(0, 3);
	    a.addEdge(1, 2);
	    a.addEdge(3, 4);
	    a.addEdge(2, 4);
	    a.addEdge(4, 5);
	    System.out.println(a.mindistance(0, 5));
	}

}
