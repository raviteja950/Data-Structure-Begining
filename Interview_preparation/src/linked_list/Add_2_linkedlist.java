package linked_list;

public class Add_2_linkedlist
{
static listnode head1;
static listnode head2;
	private static class listnode
	{
		listnode next;
		int data;
		  public  listnode  (int data)
		{
			this.data=data;
			this.next=null;
		}	
	}
	public void print(listnode head)
	{
		listnode current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println(" ");
	}
	public listnode add(listnode head1,listnode head2)
	{
	listnode result=null;
	listnode previous=null;
	listnode temp=null;
	int sum;
	int carry=0;
	while(head1!=null || head2!=null)
  {
	sum=carry + (head1!=null ?head1.data:0)+(head2!=null ?head2.data:0);
	carry=(sum>=10?1:0);
	sum=sum%10;
	temp=new listnode(sum);
	if(result==null)
	{
		result=temp;
	}
	else
	{
		previous.next=temp;
	}
	previous=temp;
	
	if(head1!=null)
	{
		head1=head1.next;
	}
	if(head2!=null)
	{
		head2=head2.next;
	}
  }
	if(carry>0)
	{
		temp.next=new listnode(carry);
	}
	return result;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Add_2_linkedlist a=new Add_2_linkedlist();
		a.head1=new listnode(7);
		a.head1.next=new listnode(5);
		a.head1.next.next=new listnode(9);
		a.head1.next.next.next=new listnode(4);
		a.head1.next.next.next.next=new listnode(6);
		System.out.println("first linked list");
		a.print(head1);
		a.head2=new listnode(8);
		a.head2.next=new listnode(4);
		System.out.println("secound linked list");
		a.print(head2);
		listnode rs=a.add(head1,head2);
	    a.print(rs);

	}

}
