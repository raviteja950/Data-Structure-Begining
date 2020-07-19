package graphs;
import java.util.*;
class ravi12
{
	List<List<Integer>>l;
	boolean wasvisited[];
	int nodes;
	ravi12(int nodes)
	{
		l=new ArrayList<>();
		wasvisited=new boolean[nodes];
		this.nodes=nodes;
		for(int i=0;i<nodes;i++)
		{
			l.add(i, new ArrayList<>());
		}
	}
	public void addEdge(int a,int b)
	{
		l.get(a).add(b);
		l.get(b).add(a);
	}
	public boolean ifcycle()
	{
		for(int i=0;i<nodes;i++)
		{
			if(!wasvisited[i])
			{
				if(dfs(i,-1))
				{
				return true;
				}
			}
		}
		return false;
	}
	public boolean dfs(int start,int parent)
	{
		wasvisited[start]=true;
	    List<Integer>neighbourlist=l.get(start);
	    for(int c:neighbourlist)
	    {
	    	if(!wasvisited[c])
	    	{
	    		dfs(c,start);
	    	}
	    	else if(c!=parent)
	    	{
	    		return true;
	    	}
	    }
	    return false;
	}
}
public class Undirect_graph_as_cycle_Or_not 
{
          public static void main(String[] args)
         {
        	  int nodes=3;
        	  ravi12 a=new ravi12(nodes);
        	    a.addEdge(0, 1);
        	    a.addEdge(1, 2);
        	    a.addEdge(2, 0);
        	    System.out.println(a.ifcycle());
         }
}
