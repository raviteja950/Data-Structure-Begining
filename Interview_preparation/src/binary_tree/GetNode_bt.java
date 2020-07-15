package binary_tree;

	class listnode
	{
		int data;
		listnode left;
		listnode right;
	}
	class binar
	{
		public listnode create(int data)
		{
			listnode a=new listnode();
			a.data=data;
			a.left=null;
			a.right=null;
			return a;
		}
		public int getnodecount(listnode root)
		{
			if(root==null)
			{
				return 0;
			}
			return 1+getnodecount(root.left)+getnodecount(root.right);
		}
		public int getleaf(listnode root)
		{
			if(root==null)
			{
				return 0;
			}
			if(root.left==null && root.right==null)
			{
				return 1;
			}
			return getleaf(root.left)+getleaf(root.right);
		}
		public int height(listnode root)
		{
			if(root==null)
			{
				return -1;
			}
			return Math.max(height(root.left), height(root.right))+1;
		}
		public void level(listnode root,int l)
		{
			if(root==null)
			{
				return;
			}
			if(l==1)
			{
			
				System.out.print(  +root.data+" ");
				return;
			}
			level(root.left,l-1);
			level(root.right,l-1);
			
		}
	}
	 
	 
public class GetNode_bt 
{
	
	public static void main(String[] args) 
	{
		binar a=new binar();
		listnode root=a.create(2);
		root.left=a.create(7);
		root.right=a.create(5);
		root.left.left=a.create(2);
		root.left.right=a.create(6);
		root.left.right.left=a.create(5);
		root.left.right.right=a.create(11);
		root.right.right=a.create(9);
		root.right.right.left=a.create(4);
		System.out.println("total nodes  "  + a.getnodecount(root));
		System.out.println("leaf node "+a.getleaf(root));
		System.out.println("height   "+a.height(root));
	     a.level(root,4);
	}

}
