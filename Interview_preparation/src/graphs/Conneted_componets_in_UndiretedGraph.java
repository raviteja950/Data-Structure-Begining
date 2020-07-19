package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class graph1255
{
	 List<List<Integer>>l;
	 boolean wasvisited[];
	int nodes;
	graph1255(int nodes)
	{
		l=new ArrayList<>();
		wasvisited=new boolean[nodes];
		this.nodes=nodes;
		for(int i=0;i<nodes;i++)
		{
			l.add(i ,new ArrayList<>());
		}
	}
	public void addedge(int a,int b)
	{
		l.get(a).add(b);
		l.get(b).add(a);
	}
	public int connectcomponents()
	{
		int count=0;
		for(int i=0;i<nodes;i++) {
			if(!wasvisited[i])
			{
				dfs(i);
				count++;
			}
		}
		return count;
	}
	public void dfs(int v)
	{
		Stack<Integer>s=new Stack<>();
		s.push(v);
		wasvisited[v]=true;
		while(!s.isEmpty())
		{
			int p=s.pop();
			List<Integer> child=l.get(p);
			for(int neigh:child)
			{
				if(!wasvisited[neigh])
				{
					s.push(neigh);
					wasvisited[neigh]=true;
				}
			}
		}
	}
}





public class Conneted_componets_in_UndiretedGraph {

	public static void main(String[] args)
	{
		int nodes=7;
        graph1255 a=new graph1255(nodes);
a.addedge(0, 1);
a.addedge(0, 2);
a.addedge(1, 3);

a.addedge(4, 5);
a.addedge(4, 6);
System.out.print(a.connectcomponents());

	}

}
