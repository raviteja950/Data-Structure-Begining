package graphs;
import java.util.*;
class raviteja{
	List<List<Integer>>l;
	HashMap<Integer,Integer> h;
	int nodes;
	Queue<Integer>q;
	public raviteja(int nodes)
	{
		l=new ArrayList<>();
		h=new HashMap<>();
		q=new LinkedList<>();
		this.nodes=nodes;
		for(int i=0;i<nodes;i++)
		{
			l.add(i,new ArrayList<>());
			h.put(i, 0);
		}
	}
	public void addEdge(int a,int b)
	{
		l.get(a).add(b);
		h.put(b, h.get(b)+1);
	}
	public List<Integer> topologicalsort()
	{
		for(Map.Entry<Integer,Integer> entry:h.entrySet())
		{
			if(entry.getValue()==0)
			{
				q.add(entry.getKey());
			}
		}
		List<Integer> result=new ArrayList<>();
		while(!q.isEmpty())
		{
			int p=q.remove();
			result.add(p);
			List<Integer>childlist=l.get(p);
			for(int neigh:childlist)
			{
				h.put(neigh, h.get(neigh)-1);
				if(h.get(neigh)==0)
				{
					q.add(neigh);
				}
			}
		}
		if(result.size()!=nodes) {
			System.out.println("Cycle is there in graph");
			return new ArrayList<>();
		}
		return result;
	}
}
public class Topological_sort {

	public static void main(String[] args)
	{
		int nodes=6;
		raviteja a=new raviteja(nodes);
		a.addEdge(0, 1);
	    a.addEdge(0, 2);
	    a.addEdge(1, 3);
	    a.addEdge(1, 4);
	    a.addEdge(2, 4);
	    a.addEdge(3, 5);
	    a.addEdge(4, 5);
	    System.out.println(a.topologicalsort());
				
		

	}

}
