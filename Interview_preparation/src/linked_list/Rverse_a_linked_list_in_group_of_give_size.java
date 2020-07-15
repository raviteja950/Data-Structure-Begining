package linked_list;
import java.util.*;
public class Rverse_a_linked_list_in_group_of_give_size
{
	listnode head;
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
listnode reverse(listnode head,int k)
{
	listnode current=head;
	listnode next=null;
	listnode previous=null;
	int count=0;
	while(count<k && current!=null)
	{
		next=current.next;
		current.next=previous;
				previous=current;
				current=next;
				count++;
	}
	if(next!=null)
		head.next=reverse(next,k);
	return previous;
}
public  void print()
{
	listnode current=head;
	while(current!=null)
		{
		System.out.print(current.data+" ");
		current=current.next;
	}
	System.out.println();
}
void push(int data)
{
listnode newnode=new listnode(data);
newnode.next=head;
head=newnode;
}

      public static void main(String[] args)
      {
    	  Scanner sc=new Scanner(System.in);
    	  Rverse_a_linked_list_in_group_of_give_size a=new Rverse_a_linked_list_in_group_of_give_size();
    	  a.push(1);
    	  a.push(2);
    	  a.push(3);
    	  a.push(4);
    	  a.push(5);
    	  a.print();
    	 a.head=a.reverse(a.head, 3);
    	 a.print();
      }
}
