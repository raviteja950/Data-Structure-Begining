package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class ravi1{
	List<List<Integer>>l;
	boolean wasvisited[];
	int nodes;
	public ravi1(int nodes)
	{
		l=new ArrayList<>();
		wasvisited=new boolean[nodes];
		for(int i=0;i<nodes;i++)
		{
			l.add(i,new ArrayList<>());
		}
	}
	public void addEdge(int a,int b)
	{
		l.get(a).add(b);
	}
	public boolean ifConnectorNot(int source,int destination)
	{
		dfs(source);
		return wasvisited[destination];
	}
	public void dfs(int v)
	{
		Stack<Integer> s=new Stack<>();
		s.push(v);
		wasvisited[v]=true;
		while(!s.isEmpty())
		{
			int p=s.pop();
			// System.out.print(p+" "); to print the path
			List<Integer> neighbourlist=l.get(p);
			for(int neightbour:neighbourlist)
			{
				if(!wasvisited[neightbour])
				{
					s.push(neightbour);
					wasvisited[neightbour]=true;
				}
			}
		}
	}
}
public class Source_and_destination_connected_in_directed_graph {

	public static void main(String[] args) 
	{
		int nodes=7;
	ravi1 a=new ravi1(nodes);	
	a.addEdge(0, 1);
    a.addEdge(1, 2);
    a.addEdge(2, 0);
    a.addEdge(3, 2);
    a.addEdge(3, 0);
    a.addEdge(2, 4);
    System.out.println(a.ifConnectorNot(0, 4));
    System.out.println(a.ifConnectorNot(0, 3));
	}

}
