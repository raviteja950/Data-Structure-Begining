package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class graph2
{
	public List<List<Integer>> l;
	public boolean a[];
	graph2(int v)
	{
		l=new ArrayList<>();
		a=new boolean[v];
		for(int i=0;i<v;i++)
		{
			l.add(i  ,new ArrayList<>());
		}
			
	}
	public void addedge(int a,int b)
	{
		l.get(a).add(b);
		l.get(b).add(a);
	}
	public void bfs(int v)
	{
		Queue<Integer> q=new LinkedList<>();
		q.add(v);
		a[v]=true;
		while(!q.isEmpty())
		{
			int p=q.poll();
			System.out.print(p+" ");
			List<Integer> child=l.get(p);
			for(int c:child)
			{
				if(!a[c])
				{
					q.add(c);
					a[c]=true;
				}
			}
		}
		
	}
	
}









public class Bfs_Using_Adjlist_Direct_and_Undirect_Graph 
{

	public static void main(String[] args) 
	{
		int node=7;
		graph2 ravi=new graph2(node);
		ravi.addedge(0, 1);
	    ravi.addedge(0, 2);
	    ravi.addedge(0, 3);
	    ravi.addedge(1, 4);
	    ravi.addedge(2, 4);
	    ravi.addedge(2, 5);
	    ravi.addedge(4, 5);
	    ravi.bfs(0);

	}

}
