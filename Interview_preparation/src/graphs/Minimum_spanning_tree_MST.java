package graphs;

import java.util.Stack;

class mstvertex
{
	public char label;
	public boolean wasvisit;
	public mstvertex(char val)
	{
		label=val;
		wasvisit=false;
	}
}
class graph123
{
	private int maxsize=20;
	private mstvertex vertexlist[];
	private int adjmatrix[][];
	private int nvertex;
	Stack<Integer> s;
	public graph123()
	{
		vertexlist=new mstvertex[maxsize];
		adjmatrix=new int[maxsize][maxsize];
		nvertex=0;
		s=new Stack<Integer>();
	}
	public void addVertex(char val)
	{
		vertexlist[nvertex++]=new mstvertex(val);
	}
	public void addEdge(int a,int b)
	{
		adjmatrix[a][b]=1;
		adjmatrix[b][a]=1;
	}
	public int ajlist(int vl)
	{
		for(int i=0;i<nvertex;i++)
		{
			if(adjmatrix[i][vl]==1 && vertexlist[i].wasvisit==false)
			{
				return i;
			}
		}
		return -1;
	}
	public void display(int v)
	{
		System.out.print(vertexlist[v].label);
	}
	public void mst( )
	{
		vertexlist[0].wasvisit=true;
	    s.push(0);
	    while(!s.isEmpty())
	    {
	    	int p=s.peek();
	    	int c=ajlist(p);
	    	if(c==-1)
	    	{
	    		s.pop();
	    	}
	    	else
	    	{
	    		vertexlist[c].wasvisit=true;
	    		display(p);
	    		display(c);
	    		System.out.print(" ");
	    		s.push(c);
	    	}
	    }
	}
}


public class Minimum_spanning_tree_MST {

	public static void main(String[] args) 
	{
		graph123 a=new graph123();
		    a.addVertex('A');
		    a.addVertex('B');
		    a.addVertex('C');
		    a.addVertex('D');
		    a.addVertex('E');
		    
		    a.addEdge(0, 1); 
		    a.addEdge(0, 2); 
		    a.addEdge(0, 3); 
		    a.addEdge(0, 4); 
		    a.addEdge(1, 2); 
		    a.addEdge(1, 3); 
		    a.addEdge(1, 4); 
		    a.addEdge(2, 3); 
		    a.addEdge(2, 4); 
		    a.addEdge(3, 4); 
		    
		    System.out.println("MST: ");
		    a.mst();

	}

}
