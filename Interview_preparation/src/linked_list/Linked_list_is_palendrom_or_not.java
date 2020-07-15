package linked_list;
import java.util.Stack;
public class Linked_list_is_palendrom_or_not 
{
	static listnode head;
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
	public boolean palendrom(listnode head)
	{
		listnode slow=head;
		boolean ispalen=true;
		Stack<Integer> stack=new Stack<>();
		while(slow!=null)
		{
			stack.push(slow.data);
			slow=slow.next;
		}
		while(head!=null)
		{
			int i=stack.pop();
			if(head.data==i)
			{
			 ispalen=true;
			}
			else
			{
				ispalen=false;
			}
			head=head.next;
		}
		return ispalen;
	}

	public static void main(String[] args) 
	{
		Linked_list_is_palendrom_or_not a =new Linked_list_is_palendrom_or_not ();
		listnode head=new listnode(1);
		listnode secound=new listnode(2);
		listnode three=new listnode(2);
		listnode four=new listnode(1);
		head.next=secound;
				secound.next=three;
				three.next=four;
				a.print(head);
				boolean ravi= a.palendrom(head);
				System.out.println("ispalendrom : " + ravi);

	}

}
