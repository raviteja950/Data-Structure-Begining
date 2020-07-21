package graphs;
import java.util.*;
class Edge{
	int target;
	int distance;
	public Edge(int start,int end)
	{
		this.target=start;
		this.distance=end;
	}
}

class Graph1234
{
	List<List<Edge>>l;
	boolean visited[];
	int distance[];
	Graph1234(int nodes)
	{
		l=new ArrayList<>();
		visited=new boolean[nodes];
		distance=new int[nodes];
		for(int i=0;i<nodes;i++)
		{
			l.add(i ,new ArrayList<>());
			distance[i]=Integer.MAX_VALUE;
		}
	}
	public void addEdge(int source,int target,int distance)
	{
		l.get(source).add(new Edge(target, distance));
	}
	public int minimundistance(int source,int distination)
	{
		if(source==distination)
		{
			return 0;
		}
		PriorityQueue<Edge> minheap=new PriorityQueue<>((e1,e2)->e1.distance-e2.distance);
		distance[source]=0;
		minheap.add(new Edge(0,0));
		while(!minheap.isEmpty())
		{
			int v=minheap.poll().target;
			if(visited[v])
			{
				continue;
			}
			visited[v]=true;
			List<Edge> childlist=l.get(v);
			for(Edge child:childlist)
			{
				int dist=child.distance;
				int childNode=child.target;
				 if (!visited[childNode] && (distance[v] + dist < distance[childNode])) {
			          distance[childNode] = distance[v] + dist;
			          child.distance = distance[v] + dist;
			          minheap.add(child);
			}
			}
		}
		return distance[distination];
	}
}


public class Dijkstra_Algorithum {

	public static void main(String[] args) {
		int nodes=5;
		Graph1234 a=new Graph1234(nodes);
		a.addEdge(0, 1, 1);
	    a.addEdge(0, 2, 7);
	    a.addEdge(1, 2, 5);
	    a.addEdge(1, 4, 4);
	    a.addEdge(4, 3, 2);
	    a.addEdge(2, 3, 6);
	    System.out.println(a.minimundistance(0, 4));
	}

}
