package binary_tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class listnode1
	{
		 int data;
		 listnode1 left;
		 listnode1 right;
	}
	class raviteja
	{
		public listnode1 create(int val)
		{
			listnode1 a=new listnode1();
			a.data=val;
			a.left=null;
			a.right=null;
			return a;
		}
		
		
		public void levelorder(listnode1 root)
		{
			if(root==null)
			{
				return ;
			}
			Queue<listnode1> q=new LinkedList<listnode1>();
			q.add(root);
			while(true)
			{
			int count=q.size();
			if(count==0)
			{
				break;
			}
			while(count>0)
			{
				listnode1 top=q.remove();
				System.out.print(top.data+" ");
				if(top.left!=null)
				{
					q.add(top.left);
				}
				if(top.right!=null)
				{
					q.add(top.right);
				}
				count--;
			}
			System.out.println();
		}
		
	}
	}
	
	public class Level_order_travel
	{
	
	  public static void main(String[] args) 
	   {
		  raviteja a=new raviteja();
		  listnode1 root=a.create(2);
			root.left=a.create(7);
			root.right=a.create(5);
			root.left.left=a.create(2);
			root.left.right=a.create(6);
			root.left.right.left=a.create(5);
			root.left.right.right=a.create(11);
			root.right.right=a.create(9);
			root.right.right.left=a.create(4);
			a.levelorder(root);

	   }

}

