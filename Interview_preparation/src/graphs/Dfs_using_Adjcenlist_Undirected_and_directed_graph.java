package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class graph12
{
    public List<List<Integer>> l;
   public boolean a[];
   public graph12(int v)
   {
	   l=new ArrayList<>();
	   a=new boolean[v];
 
   for(int i=0;i<v;i++)
   {
	   l.add(i,new ArrayList<>());
   }
   }
   public void addEdge(int a,int b)
   {
	   l.get(a).add(b);             ///FOR UNDIRECTED WE USE THIS BOTH
	   l.get(b).add(a);             ///FOR DIRECTED WE USE ONLY THIS ONE____l.get(a).add(b);____
   }
   public void dfs(int v)
   {
	   Stack<Integer> s=new Stack<>();
	   s.push(v);
	   a[v]=true;
	   while(!s.isEmpty())
	   {
		   int p=s.pop();
		   System.out.print(p+" ");
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

public class Dfs_using_Adjcenlist_Undirected_and_directed_graph 
{

	public static void main(String[] args) 
	{
		int nodes=7;
		graph12 g=new graph12(nodes);
		g.addEdge(0, 1);
	    g.addEdge(0, 2);
	    g.addEdge(1, 3);
	    g.addEdge(2, 4);
	    g.addEdge(3, 5);
	    g.addEdge(4, 5);
	    g.addEdge(4, 6);
        g.dfs(1);
	}

}
