package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class graph124
{
	 List<List<Integer>>l;
	 boolean a[];
	 int nodes;
	graph124(int nodes)
	{
		l=new ArrayList<>();
		a=new boolean[nodes];
		this.nodes=nodes;
		for(int i=0;i<nodes;i++)
		{
			l.add(i,new ArrayList<>());
		}
	}
	public void edge(int a,int b)
	{
		l.get(a).add(b);
		l.get(b).add(a);
	}
	public boolean ifgraphconnect()
	{
		int start=0;
		dfs(start);
		for(int i=0;i<a.length;i++)
		{
			if(!a[i])
			{
				return false;
			}
		}
		return true;
	}
	
	public void dfs(int v)
	{
		Stack<Integer> s=new Stack<Integer>();
		s.push(v);
		a[v]=true;
		while(!s.isEmpty())
		{
			int p=s.pop();
			List<Integer> n=l.get(p);
			for(int c:n)
			{
				if(!a[c])
				{
					s.push(c);
					a[c]=true;
				}
			}
		}
	}
}





public class Undireted_graph_is_conneted_or_not {

	public static void main(String[] args) 
	{
		int nnode=7;
		graph124 g=new graph124(nnode);
		g.edge(0, 1);
	    g.edge(0, 2);
	    g.edge(1, 3);
	    g.edge(2, 4);
	    g.edge(3, 5);
	    g.edge(4, 5);
	    g.edge(4, 6);
	    System.out.println(g.ifgraphconnect());

	}

}
