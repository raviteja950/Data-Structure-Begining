package linked_list;
import java.util.*;
class listnode
{
	listnode next;
	int data;
	public  listnode(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class sort
{
	public void print(listnode head)
	{
		listnode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println(" ");
	}
	public listnode merge(listnode head1,listnode head2)
	{
		listnode dummy=new listnode(0);
		listnode tail=dummy;
		while(true)
		{		
		if(head1==null)
		{
			tail.next=head2;
			break;
		}
		if(head2==null)
		{
			tail.next=head1;
			break;
		}
		if(head1.data<=head2.data)
		{
			tail.next=head1;
			head1=head1.next;
		}
		else
		{
			tail.next=head2;
			head2=head2.next;
		}
		tail=tail.next;
		}
		return dummy.next;
	}
}

public class Merger_two_Sorted_linked_list 
{

	public static void main(String[] args) 
	{
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      listnode head1=new listnode(sc.nextInt());
     listnode tail1=head1;
     for(int i=0;i<n1-1;i++)
     {
    	 tail1.next=new listnode(sc.nextInt());
    	 tail1=tail1.next;
     }
     listnode head2=new listnode(sc.nextInt());
     listnode tail2=head2; 
     for(int i=0;i<n2-1;i++)
     {
    	 tail2.next=new listnode(sc.nextInt());
    	 tail2=tail2.next;
     }
     sort a=new sort();
     a.print(head1);
     a.print(head2);
     a.merge(head1,head2);
     a.print(head2);
	}

}
