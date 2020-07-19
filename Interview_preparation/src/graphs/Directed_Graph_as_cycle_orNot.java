package graphs;
import java.util.*;

class graph21
{
	List<List<Integer>>l;
	boolean visited[] ,recursivestack[];
	int nodes;
	public graph21(int nodes)
	{
		l=new ArrayList<>();
		visited=new boolean[nodes];
		recursivestack=new boolean[nodes];
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
	public boolean ifcycle()
	{
		for(int i=0;i<nodes;i++)
		{
			if(dfs(i)) {
				return true;
			}
			
		}
		return false;
	}
	public boolean dfs(int v)
	{
		if(recursivestack[v])
			{
			return true;
			}
		if(visited[v])
		{
			return false;
		}
		visited[v]=true;
		recursivestack[v]=true;
		List<Integer> neighbourlist=l.get(v);
		for(int c:neighbourlist)
		{
			if(dfs(c))
			{
				return true;
			}
		}
				recursivestack[v]=false;
				return false;
	}
}
public class Directed_Graph_as_cycle_orNot 
{

	public static void main(String[] args) 
	{
      int nodes=5;
      graph21 a=new graph21(nodes);
      a.addEdge(0, 1);
      a.addEdge(1, 2);
      a.addEdge(2, 0);
      a.addEdge(0, 3);
      a.addEdge(3, 4);
      a.addEdge(4, 0);
      
      System.out.println(a.ifcycle());

	}

}
