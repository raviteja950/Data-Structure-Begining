package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class graph125
{
	public List<List<Integer>>l;
	public boolean a[];
	public int nodes;
	graph125(int nodes)
	{
		l=new ArrayList<>();
		a=new boolean[nodes];
		this.nodes=nodes;
		for(int i=0;i<nodes;i++)
		{
			l.add(i,new ArrayList<>());
		}
	}
	public void addEdge(int a,int b)
	{
		l.get(a).add(b);
	}
	public boolean IfDirecteIsConnected()
	{
		for(int i=0;i<nodes;i++)
		{
			dfs(i);
			for(int j=0;j<nodes;j++)
			{
				if(!a[j])
				{
					return false;
				}
			}
			Arrays.fill(a, false);
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
		List<Integer> neighbour=l.get(p);
			for(int c:neighbour)
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







public class Check_if_directed_graph_is_connected {

	public static void main(String[] args) 
	{
		int nodes=4;
		graph125 a=new graph125(nodes);
		    a.addEdge(0, 1);
		    a.addEdge(1, 2);
		    a.addEdge(2, 0);
		    a.addEdge(0, 3);
		   a.addEdge(3, 2);

		    System.out.println(a.IfDirecteIsConnected());
	}

}
