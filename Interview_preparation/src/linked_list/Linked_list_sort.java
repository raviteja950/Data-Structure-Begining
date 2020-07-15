package linked_list;
import java.util.*;
public class Linked_list_sort 
{
	listnode head;
   private static  class linkedlist
   {
	   listnode next;
	   int data;
	  void listnode(int data)
	   {
		   this.data=data;
		   this.next=null;
	   }
   }
    void sort(listnode head)
   {
	   int count[]= {0, 0, 0};
	   listnode ptr=head;
	   while(ptr!=null)
	   {
		   count[ptr.data]++;
		   ptr=ptr.next;
	   }
	   int i=0;
	   ptr=head;
	   while(ptr!=null)
	   {
		   if(count[i]==0)
		   {
			   i++;
		   }
		   else
		   {
			   ptr.data=i;
			   --count[i];
			   ptr=ptr.next;
		   }
	   }
	  
   }
   public void push(int data)
   {
	   listnode f=new listnode(data);
	   f.next=head;
	   head=f;
   }
   public void display(listnode head)
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
	   Linked_list_sort  a=new Linked_list_sort ();
	   Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  listnode head=new listnode(sc.nextInt());
	  listnode tail=head;
	  for(int i=1;i<n;i++)
	  {
		  tail.next=new listnode(sc.nextInt());
		  tail=tail.next;
	  }
	   a.display(head);
	  a.sort(head);
	   a.display(head);
   }
}
