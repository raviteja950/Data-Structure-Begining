package linked_list;
import java.util.*;
public class Pair_wise_swap 
{
	listnode head;
private static class listnode 
{
	listnode next;
	int data;
	public listnode(int data)
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
public listnode swap(listnode head)
{
	listnode p=head;
	listnode start=p.next;
	while(true)
	{
		listnode q=p.next;
		listnode temp=q.next;
		q.next=p;
		if(temp==null || temp.next==null)
		{
			p.next=null;
			break;
		}
		p.next=temp.next;
		p=temp;
	}
	return start;
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		listnode head=new listnode(sc.nextInt());
		listnode tail=head;
		for(int i=0;i<n-1;i++)
		{
			tail.next=new listnode(sc.nextInt());
			tail=tail.next;
		}
		Pair_wise_swap a=new Pair_wise_swap();
		a.print(head);
		listnode ravi=a.swap(head);
		a.print(ravi);
	}

}


