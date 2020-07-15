package binary_tree;

import java.util.Stack;

class node1
		{
			int data;
			node1 left;
			node1 right;
		}
	   class binarytree1
	   {
			public node1 create(int val)
			{
				node1 a=new node1();
				a.data=val;
				a.left=null;
				a.right=null;
				return a;
			}
			public node1 deleteBiarytree(node1 root)
			{
				if(root ==null)
				{
					return null;
				}
				root.left=deleteBiarytree(root.left);
				root.right=deleteBiarytree(root.right);
				System.out.println("Delete: "+ root.data);
				root=null;
				return root;
		   }
			
			
			public void postorder(node1 root)
			{
				if(root==null)
					return;
				Stack<node1>s1=new Stack<node1>();
				Stack<node1>s2=new Stack<node1>();
				s1.push(root);
				while(s1.size()>0)
				{
					node1 t=s1.pop();
					if(t.left!=null)
					{
						s1.push(t.left);
					}
					if(t.right!=null)
					{
						s1.push(t.right);
					}
					s2.push(t);
				}
				System.out.print("postorder:");
				while(s2.size()>0)
				{
					System.out.print(s2.pop().data+" ");
				}
				System.out.println();
			}
			public void preorder(node1 root)
			{
				if(root==null)
				{
					return;
				}
				Stack<node1> s=new Stack<node1>();
				s.push(root);
				System.out.print("preorder:");
				while(s.size()>0)
				{
					node1 t=s.pop();
					
					System.out.print(t.data+" ");
					
					if(t.right!=null)
					{
						s.push(t.right);
					}
					if(t.left!=null)
					{
						s.push(t.left);
					}
					
				}
				System.out.println();
				
			}
			public void inorder(node1 root)
			{
				if(root==null)
					return;
				Stack<node1> s=new Stack<node1>();
				while(root!=null)
				{
					s.push(root);
					root=root.left;
				}
				System.out.print("inorder:");
				while(s.size()>0)
				{
					node1 t=s.pop();
					System.out.print(t.data+" ");
					if(t.right!=null)
					{
						node1 temp=t.right;
						
						while(temp!=null)
						{
							s.push(temp);
							temp=temp.left;
						}
					}
				}
				System.out.println();
			}
			
			
			
			
		}
public class Preorder_Inorder_postorder_without_recursion  
{	 
	public static void main(String[] args)
	{
		binarytree1 a=new binarytree1();
		node1 root=a.create(2);
		root.left=a.create(7);
		root.right=a.create(5);
		root.left.left=a.create(2);
		root.left.right=a.create(6);
		root.left.right.left=a.create(5);
		root.left.right.right=a.create(11);
		root.right.right=a.create(9);
		root.right.right.left=a.create(4);
		a.inorder(root);
		a.preorder(root);
		a.postorder(root);
		a.deleteBiarytree(root);

	}

}
