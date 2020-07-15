package binary_tree;
	
   class node
	{
		int data;
		node left;
		node right;
	}
   class binarytree{
		public node create(int val)
		{
			node a=new node();
			a.data=val;
			a.left=null;
			a.right=null;
			return a;
		}
	}
		 
	
	public class Create_binary_tree 
	{
	
	public static void main(String[] args) 
	{
		binarytree a=new binarytree();
		node root=a.create(2);
		root.left=a.create(7);
		root.right=a.create(5);
		root.left.left=a.create(2);
		root.left.right=a.create(6);
		root.left.right.left=a.create(5);
		root.left.right.right=a.create(11);
		root.right.right=a.create(9);
		root.right.right.left=a.create(4);

	}

}
