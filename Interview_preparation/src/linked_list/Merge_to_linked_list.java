package linked_list;

public class Merge_to_linked_list {
	listnode head1,head2;
private static class listnode 
{
	private listnode next;
	private int data;
	public listnode(int data)
	{
		this.data=data;
		this.next=null;
	}
	
}
public void print()
{
	listnode current=head1;
	while(current!=null)
	{
		System.out.print(current.data+" ");
		current=current.next;
	}
	System.out.println(" ");
	
}
public listnode merge(listnode p,listnode q)
{
	
	
	if(p==null&&q==null)
		return null;
	listnode s=null;
	
	while(p!=null && q!=null)
	{
		if(p.data<=q.data)
		{
			listnode temp=p.next;
			p.next=s;
			s=p;
			p=temp;
		}
		else
		{
			listnode temp=q.next;
			q.next=s;
			s=q;
			q=temp;
		}
	}
	
	while(p!=null)
	{
		listnode temp=p.next;
			p.next=s;
			s=p;
			p=temp;
	}
	while(q!=null)
		{
		listnode temp=q.next;
			q.next=s;
			s=q;
			q=temp;
		}
	
	return s;
}
	public static void main(String[] args)
	{
		listnode head1=new listnode(5);
		listnode secound=new listnode(10);
		listnode third=new listnode(15);
		head1.next=secound;
		secound.next=third;
		/*_____________________________
		  __secound_linkedlis___________*/
		listnode head2 =new listnode(2);
		listnode four=new listnode(3);
		listnode five=new listnode(20);
		head2.next=four;
		four.next=five;
		listnode result=null;
		Merge_to_linked_list a=new Merge_to_linked_list ();
		a.print();
		a.print();
		result=a.merge(head1,head2);
		
		
	}

}
