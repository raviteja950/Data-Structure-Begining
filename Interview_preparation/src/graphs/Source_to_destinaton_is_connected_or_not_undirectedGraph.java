package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class ravi
{
	List<List<Integer>>l;
	boolean a[];
	int nodes;
	public ravi(int nodes)
	{
		l=new ArrayList<>();
		a=new boolean[nodes];
		for(int i=0;i<nodes;i++)
		{
			l.add(i ,new ArrayList<>());
		}
	}
	public void addEdge(int a,int b) {
		l.get(a).add(b);
		l.get(b).add(a);
	}
	public boolean connect(int source,int destination)
	{
		dfs(source);
		System.out.println(" ");
		return a[destination];
	}
	public void dfs(int v)
	{
		Stack<Integer> s=new Stack<>();
		s.push(v);
		a[v]=true;
		while(!s.isEmpty())
		{
			int p=s.pop();
			//System.out.print(p+" "); to print the path
		
			List<Integer> neigh=l.get(p);
			for(int c:neigh)
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




public class Source_to_destinaton_is_connected_or_not_undirectedGraph {

	public static void main(String[] args) {
		int nodes=7;
		ravi r=new ravi(nodes);
		r.addEdge(0, 1);
		r.addEdge(0, 2);
		r.addEdge(1, 3);
		r.addEdge(3, 4);
		r.addEdge(4, 5);
		r.addEdge(4, 6);
		System.out.println(r.connect(0, 5));

	}

}
