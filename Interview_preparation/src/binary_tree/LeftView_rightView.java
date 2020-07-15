package binary_tree;


class listno
{
	 int data;
	 listno left;
	 listno right;
}
class ravitej
{
	public listno create(int val)
	{
		listno a=new listno();
		a.data=val;
		a.left=null;
		a.right=null;
		return a;
	}
	int max;
	public void leftView(listno root,int level)
	{
		
		if(root==null)
			return;
		if(level>=max)
		{
			
			System.out.print(root.data+" ");
			max++;
		}
		
		leftView(root.left,level+1);
		leftView(root.right,level+1);
	}
	int max1;
	public void rightView(listno root,int level)
	{
		
		if(root==null)
			return;
		if(level>=max1)
		{
			System.out.print(root.data+" ");
			
			max1++;
		}
		rightView(root.right,level+1);
		rightView(root.left,level+1);
	}
}	
public class LeftView_rightView 
{

	public static void main(String[] args) 
	{
		ravitej a=new ravitej();
		  listno root=a.create(2);
			root.left=a.create(7);
			root.right=a.create(5);
			root.left.left=a.create(2);
			root.left.right=a.create(6);
			root.left.right.left=a.create(5);
			root.left.right.right=a.create(11);
			root.right.right=a.create(9);
			root.right.right.left=a.create(4);
			a.leftView(root,0);
			a.rightView(root,0);
	

	}

}
