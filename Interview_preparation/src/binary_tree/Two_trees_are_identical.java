package binary_tree;
class node2
{
	int data;
	node2 left;
	node2 right;
}
class binarytree2
{
	public node2 create(int val)
	{
		node2 a=new node2();
		a.data=val;
		a.left=null;
		a.right=null;
		return a;
	}
	public boolean indentical(node2 root,node2 root1)
	{
		if(root==null && root1==null)
		{
			return true;
		}
		if(root==null || root1==null)
		{
			return false;
		}
		return (root.data==root1.data)&&indentical(root.left,root1.left)&&indentical(root.right,root1.right);
	}
	public int level(node2 root,int key,int level)
	{
		if(root==null)
		{
			return 0;
		}
		int l;
		if(root.data==key)
		{
			return level;
		}
		l=level(root.left,key,level+1);
		if(l!=0)
		{
			return l;
		}
		l=level(root.right,key,level+1);
		return l;
	}
}
public class Two_trees_are_identical {

	public static void main(String[] args) 
	{
		binarytree2 a=new binarytree2();
		node2 root=a.create(2);
		root.left=a.create(7);
		root.right=a.create(5);
		root.left.left=a.create(2);
		root.left.right=a.create(6);
		root.left.right.left=a.create(5);
		root.left.right.right=a.create(11);
		root.right.right=a.create(9);
		root.right.right.left=a.create(4);
		
		
		
//		node2 root1=a.create(2);
//		root1.left=a.create(7);
//		root1.right=a.create(5);
//		root1.left.left=a.create(2);
//		root1.left.right=a.create(6);
//		root1.left.right.left=a.create(5);
//		root1.left.right.right=a.create(11);
//		root1.right.right=a.create(9);
//		root1.right.right.left=a.create(4);
//		System.out.println(a.indentical(root,root1));
		System.out.println(a.level(root,11,0));

	}

}
