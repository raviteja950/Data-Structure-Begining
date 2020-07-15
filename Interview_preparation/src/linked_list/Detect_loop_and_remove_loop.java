package linked_list;

public class Detect_loop_and_remove_loop
{
	private static listnode head;
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
  void remove(listnode slow,listnode head)
  {
	listnode ptr1=null;
	listnode ptr2=null;
	ptr1=head;
	while(1==1)
	{
	ptr2=slow;
	while(ptr2.next!=slow && ptr2.next!=ptr1)
	{
		ptr2=ptr2.next;
	}
	if(ptr2.next==ptr1)
	{
		break;
	}
	ptr1=ptr1.next;
	}
	ptr2.next=null;
  }
 int detectloop(listnode head)
  {
	  listnode slow=head;
	  listnode fast=head;
	  while(fast!=null&&fast.next!=null)
	  {
		  slow=slow.next;
		  fast=fast.next.next;
		  if(slow==fast)
		  {
			  remove(slow,head);
			  return slow.data;
		  }
	  }
	  return 0;
  }
 void print(listnode head)
 {
	listnode current=head;
	while(current!=null)
	{
		System.out.print(current.data+" ");
		current=current.next;
	}
	System.out.println(" ");
 }
	public static void main(String[] args)
	{
		 Detect_loop_and_remove_loop a=new  Detect_loop_and_remove_loop();
		 a.head=new listnode(1);
		 a. head.next=new listnode(2);
		 a. head.next.next=new listnode(3);
		 a.head.next.next.next=new listnode(4);
		 a.head.next.next.next.next=new listnode(5);
		 a.head.next.next.next.next.next=a.head.next.next;
		System.out.println( a.detectloop(head));
		a.print(head);

	}

}
