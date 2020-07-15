package linked_list;

public class Intersection_of_two_linked_list {
	static listnode head,head1;
	static class listnode
	{
		private listnode next;
		private int data;
		public listnode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	int getintersection(int d,listnode head,listnode head1)
	{
		listnode current1=head;
		listnode current2=head1;
		for(int i=0;i<d;i++)
		{
			if(current1==null)
			{
				return -1;
			}
			current1=current1.next;
		}
		while(current1!=null && current2!=null)
		{
			if(current1.data==current2.data)
			{
				return current1.data;
			}
			current1=current1.next;
			current2=current2.next;
		}
		return -1;
		
	}
	int getcount(listnode head)
	{
		listnode current=head;
		int count=0;
		while(current!=null)
		{
			count++;
			current=current.next;
		}
		return count;
	}
	int getnode()
	{
		int c1=getcount(head);
		int c2=getcount(head1);
		int d;
		if(c1>c2)
		{
			 d=c1-c2;
			return getintersection(d,head,head1);
		}
		else
		{
			d=c2-c1;
			return getintersection(d,head1,head);
		}
	}

	public static void main(String[] args) {
		
		Intersection_of_two_linked_list a=new Intersection_of_two_linked_list();
		a.head=new listnode(1);
		a.head.next=new listnode(2);
		a.head.next.next=new listnode(3);
		a.head.next.next.next=new listnode(4);
		
		a.head1=new listnode(10);
		a.head1.next=new listnode(3);
		a.head1.next.next=new listnode(4);
		System.out.print(a.getnode());
	}

}
