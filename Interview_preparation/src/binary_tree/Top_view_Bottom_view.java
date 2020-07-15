package binary_tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class node55
{
	
	int data;
	node55 left;
	node55 right;
	int height;

}
class binary55
{
	public node55 create(int val)
	{
		node55 a=new node55();
		a.data=val;
		a.left=null;
		a.right=null;
		return a;
	}
	public void topview(node55 root)
	{
		if(root==null)
		{
			return;
		}
		Queue<node55> q=new LinkedList<>();
		q.add(root);
	TreeMap<Integer,Integer> h=new TreeMap<>();
		while(!q.isEmpty())
		{
			
		    node55 t=q.remove();
		    int hd=t.height;
		    if(h.get(hd)==null)
		    {
		    h.put(hd,t.data);
		    }
		    if(t.left!=null)
		    {
		    	t.left.height=hd-1;
		    q.add(t.left);
		    }
		    if(t.right!=null)
		    {
		    	t.right.height=hd+1;
		    	q.add(t.right);
		    }
		    
		}
		System.out.println(h.values());
	}
	public void bottomview(node55 root)
	{
		if(root==null)
		{
			return;
		}
		TreeMap<Integer,Integer> m=new TreeMap<>();
		Queue<node55> q=new LinkedList<node55>();
		q.add(root);
		while(!q.isEmpty())
		{
			node55 temp=q.remove();
			int hd=temp.height;
			m.put(hd, temp.data);
			if(temp.left!=null)
			{
				temp.left.height=hd-1;
				q.add(temp.left);
			}
			if(temp.right!=null)
			{
				temp.right.height=hd+1;
				q.add(temp.right);
			}
		}
		System.out.println(m.values());
	}
}





   public class Top_view_Bottom_view {

	public static void main(String[] args) 
	{
		binary55 a=new binary55();
		node55 root=a.create(2);
		root.left=a.create(7);
		root.right=a.create(5);
		root.left.left=a.create(2);
		root.left.right=a.create(6);
		root.left.right.left=a.create(5);
		root.left.right.right=a.create(11);
		root.right.right=a.create(9);
		root.right.right.left=a.create(4);
		a.topview(root);
		a.bottomview(root);

	}

}
