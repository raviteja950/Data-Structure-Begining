package graphs;

import java.util.LinkedList;
import java.util.Queue;

class vertex
{
	public char label;
	public boolean wasvisited;
	public vertex(char lab)
	{
		label=lab;
		wasvisited=false;
	}
	
}
class graph
{
	private int maxvertex=20;
	private vertex vertexlist[];
	private int admatrix[][];
	private int nvertex;
	Queue<Integer>q;
	public graph()
	{
		vertexlist=new vertex[maxvertex];
		admatrix =new int[maxvertex][maxvertex];
		nvertex=0;
		q=new LinkedList<Integer>();
	}
	public void add(char val)
	{
		vertexlist[nvertex++]=new vertex(val);
	}
	public void edge(int start,int end)
	{
		admatrix[start][end]=1;
		admatrix[end][start]=1;
	}
	public void display(int v)
	{
		System.out.print(vertexlist[v].label+" ");
	}
	public int adjvertex(int v)
	{
		for(int i=0;i<nvertex;i++)
		{
			if(admatrix[v][i]==1 && vertexlist[i].wasvisited==false)
			{
				return i;
			}
		}
		return -1;
	}
	public  void bfs()
	{
		vertexlist[0].wasvisited=true;
		display(0);
		q.add(0);
		while(!q.isEmpty())
		{
		  	int v=adjvertex(q.peek());
		  	if(v==-1)
		  	{
		  		q.poll();
		  	}
		  	else
		  	{
		  		vertexlist[v].wasvisited=true;
		  		display(v);
		  		q.add(v);
		  	}
	
		}
	}
}
	







public class Bfs_using_Admatrix {

	public static void main(String[] args) 
	{
		     
		graph ravi=new graph();
		ravi.add('A');
	    ravi.add('B');
	    ravi.add('C');
	    ravi.add('D');
	    ravi.add('E');
	    ravi.add('F');
	    
	    ravi.edge(0, 1);
	    ravi.edge(1, 2);
	    ravi.edge(0, 3);
	    ravi.edge(3, 4);
	    ravi.edge(4, 5);
	    ravi.edge(1, 3);
	    
	    System.out.println("BFS Visits: ");
	    ravi.bfs();
	    System.out.println();
 
	}
}


