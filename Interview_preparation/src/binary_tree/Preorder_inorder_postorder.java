package binary_tree;
  class rav
 {
	 int data;
	 rav left;
	 rav right;
 }
 class binary
 {
	 public rav create(int val)
	 {
		 rav a=new rav();
		 a.data=val;
		 a.left=null;
		 a.right=null;
		 return a;
	 }
	 public void inorder(rav root)
	 {
		if(root==null)
		{
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	 }
	 public void preorder(rav root)
	 {
		 if(root==null)
		 {
			 return;
		 }
		 System.out.print(root.data+" ");
		 preorder(root.left);
		 preorder(root.right);
	 }
	 public void postorder(rav root)
	 {
		 if(root ==null)
		 {
			 return;
		 }
		 postorder(root.left);
		 postorder(root.right);
		 System.out.print(root.data+" ");
	 }
	 public int getsum(rav root)
	 {
		 if(root==null)
		 {
			 return 0;
		 }
		 return root.data+getsum(root.left)+getsum(root.right);
	 }
	 public int getdiffer(rav root)
	 {
		 if(root==null)
		 {
			 return 0;
		 }
		 return root.data- getdiffer(root.left)-getdiffer(root.right);
	 }
 }







public class Preorder_inorder_postorder {

	public static void main(String[] args) {
		
		binary a=new binary();
		rav root=a.create(2);
		root.left=a.create(7);
		root.right=a.create(5);
		root.left.left=a.create(2);
		root.left.right=a.create(6);
		root.left.right.left=a.create(5);
		root.left.right.right=a.create(11);
		root.right.right=a.create(9);
		root.right.right.left=a.create(4);
		System.out.print(" inorder:" );
		a.inorder(root);
		System.out.println();
		
		
		System.out.print("preorder:");
		a.preorder(root);
		System.out.println();
		
		System.out.print("postorder:");
		a.postorder(root);
		System.out.println();
		
		System.out.print("sum:");
		System.out.println(a.getsum(root));
		System.out.println();
		
		System.out.print("difference:");
		System.out.println(a.getdiffer(root));
		System.out.println();

	}

}
