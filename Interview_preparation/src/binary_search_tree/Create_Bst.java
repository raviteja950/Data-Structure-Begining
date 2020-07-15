package binary_search_tree;

class node
{
	int data;
	node left;
	node right;
}
class bst
{
	public node createnode(int k)
	{
		node a=new node();
		a.data=k;
		a.left=null;
		a.right=null;
		return a;
	}
	public node insert(node root,int val)
	{
		if(root==null)
		{
			return createnode(val);
		}
		if(val<root.data)
		{
			root.left=insert(root.left,val);
		}
		else if(val>root.data)
		{
			root.right=insert(root.right,val);
		}
		return root;
	}
	public boolean ifnodepresent(node root,int val)
	{
		if(root==null)
		{
			return false;
		}
		boolean present=false;
		while(root!=null)
		{
			if(val<root.data)
			{
				root=root.left;
			}
			else if(val >root.data)
			{
				root=root.right;
			}
			else
			{
				present=true;
				break;
			}
		}
		return present;
	}
	public node parentnode(node root,int val)
	{
		if(root==null)
		{
			return null;
		}
		node parentnode1=null;
		while(root!=null)
		{
			if(val<root.data)
			{
				parentnode1=root;
				root=root.left;
			}
			else if(val>root.data)
			{
				parentnode1=root;
				root=root.right;
			}
			else
			{
				break;
			}
		}
		return root!=null?parentnode1:null;
	}
	public node sibling(node root,int val)
	{
		if(root==null || root.data==val)
		{
			return null;
		}
		node parent1=null;
		while(root!=null)
		{
			if(val<root.data)
			{
				parent1=root;
				root=root.left;
			}
			else if(val>root.data)
			{
				parent1=root;
				root=root.right;
			}
			else
			{
				break;
			}
		}
		if(parent1.left!=null && val==parent1.left.data)
		{
			return parent1.right;
		}
		if(parent1.right!=null && val==parent1.right.data)
		{
			return parent1.left;
		}
		return null;
	}
	public node inorder(node root,int val)
	{
		if(root==null)
		{
			return null;
		}
		node inorder1parent=null;
		while(root!=null)
		{
			if(val<root.data)
			{
				inorder1parent=root;
				root=root.left;
			}
			else if(val>root.data)
			{
				root=root.right;
			}
			else
			{
				break;
			}
		}
		return root!=null?inorder1parent:null;
	}
	
	
}






public class Create_Bst {
	public static void main(String[] args)
	{
	
	   bst a=new bst();
	   node root=null;
	   root=a.insert(root, 8);
	   root=a.insert(root, 3);
	   root=a.insert(root, 10);
	   root=a.insert(root, 1);
	   root=a.insert(root, 6);
	   root=a.insert(root, 14);
	   root=a.insert(root, 4);
	   root=a.insert(root, 7);
	   root=a.insert(root, 13);
		System.out.println(a.ifnodepresent(root, 11));
        node parent=a.parentnode(root, 81);
        if(parent!=null)
        {
        	System.out.println(parent.data);
        }
        else
        {
        	System.out.println("no parent node");
        }
        node sebeling=a.sibling(root, 6);
        if(sebeling!=null)
        {
        	System.out.println(sebeling.data);
        }
        else
        {
        	System.out.println("no sibiling not exits");
        }
       node inoder1=a.inorder(root, 13);
       
        if(inoder1!=null)
        {
        	System.out.println(inoder1.data);
        }
        else
        {
        	System.out.println("no exit parent");
        }
	}

}
