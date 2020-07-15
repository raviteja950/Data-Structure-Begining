package graphs;

import java.util.Stack;

class vertex1
{
	public char lable1;
	public boolean wasvisit;
	public vertex1(char lab)
	{
		lable1=lab;
		wasvisit=false;
	}
}
class graph1
{
	private final int maxvertex1=20;
	private vertex1 vertexlist1[];
	private int admatrix1[][];
	private int nvertex1;
	Stack<Integer>s;
	public graph1()
	{
		vertexlist1=new vertex1[maxvertex1];
		admatrix1=new int [maxvertex1][maxvertex1];
		nvertex1=0;
		s=new Stack<Integer>();
	}
	public void add1(char val)
	{
		vertexlist1[nvertex1++]=new vertex1(val);
	}
	public void edge1(int start,int end)
	{
		admatrix1[start][end]=1;
		admatrix1[end][start]=1;
	}
	public void display(int v)
	{
		System.out.print(vertexlist1[v].lable1+" ");
	}
	public int adjvertex1(int v)
	{
		for(int i=0;i<nvertex1;i++)
		{
			if(admatrix1[v][i]==1 && vertexlist1[i].wasvisit==false)
			{
				return i;
			}
		}
		return -1;
	}
	  public void dfs()
	  {
		vertexlist1[0].wasvisit=true;
		display(0);
		s.push(0);
		while(!s.isEmpty())
		{
		    int v=adjvertex1(s.peek());
		    if(v==-1)
		    {
		    	s.pop();
		    }
		    else
		    {
		    	vertexlist1[v].wasvisit=true;
		    	display(v);
		    	s.push(v);
		    }
		    		
		}
	}
}
public class Dfs_using_Admatrix 
{

	public static void main(String[] args) 
	{
             graph1 raviteja=new graph1();		
             raviteja.add1('A');
             raviteja.add1('B');
             raviteja.add1('C');
             raviteja.add1('D');
             raviteja.add1('E');
             raviteja.add1('F');
             
            raviteja.edge1(0, 1);
     	    raviteja.edge1(1, 2);
     	    raviteja.edge1(0, 3);
     	    raviteja.edge1(3, 4);
     	    raviteja.edge1(4, 5);
     	    raviteja.edge1(1, 3);
     	    
     	    System.out.println("DFS Visits: ");
     	    raviteja.dfs();
     	    System.out.println();
	
	}

}
