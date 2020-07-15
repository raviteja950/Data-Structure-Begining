package linked_list;

public class Flatter_linked_list {
	listnode head;
private class listnode 
{
	private listnode right;
	private listnode down;
	private int data;

   public listnode(int data)
  {
	this.data=data;
	this.right=null;
	this.down=null;
  }
}
listnode push(listnode head,int data)
{
listnode newnode=new listnode(data);
newnode.down=head;
head=newnode;
return head;

}
void print()
{
	listnode current=head;
	while(current!=null)
	{
		System.out.print(current.data+" ");
		current=current.down;
	}
	System.out.println(" ");
}
listnode merge(listnode a,listnode b)
{
	if(a==null)
		return b;
	if(b==null)
		return a;
	listnode result;
	if(a.data<=b.data)
	{
		result=a;
		result.down=merge(a.down,b);
	}
	else
	{
		result=b;
		result.down=merge(a,b.down);
	}
	result.right=null;
	return result;
}
listnode fllater(listnode head)
{
	if(head==null || head.right==null)
	{
		return head;
	}
	head.right=fllater(head.right);
	head=merge(head,head.right);
	return head;
}
	public static void main(String[] args) 
	{
		Flatter_linked_list  a=new Flatter_linked_list ();
		
	/*	5 -> 10 -> 19 -> 28 
        |    |     |     | 
        V    V     V     V 
        7    20    22    35 
        |          |     | 
        V          V     V 
        8          50    40 
        |                | 
        V                V 
        30               45 
    */
		a.head=a.push(a.head,30);
		a.head=a.push(a.head,8);
		a.head=a.push(a.head,7);
		a.head=a.push(a.head,5);
		a.head.right=a.push(a.head.right, 20);
		a.head.right=a.push(a.head.right, 10);
		a.head.right.right=a.push(a.head.right.right, 50);
		a.head.right.right=a.push(a.head.right.right, 22);
		a.head.right.right=a.push(a.head.right.right, 19);
		a.head.right.right.right=a.push(a.head.right.right.right, 45);
		a.head.right.right.right=a.push(a.head.right.right.right, 40);
		a.head.right.right.right=a.push(a.head.right.right.right, 35);
		a.head.right.right.right=a.push(a.head.right.right.right, 28);
a.head=a.fllater(a.head);		
		a.print();

	}

}
