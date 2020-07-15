package stacks_and_queue;
import java.util.*;
public class Next_largest_ele_inStack {
	static class stack
	{
		int top;
		int a[]=new int[100];
	
	void push(int x)
	{
		if(top == 99)
		{
			System.out.println("stack is full");
		}
		else
		{
			a[++top]=x;
		}
	}
	int pop()
	{
		if(top==-1)
		{
			System.out.println("stack is empty");
			return -1;
		}
		else
		{
			int element=a[top];
			top--;
			return element;
		}
	}
	boolean isEmpty()
	{
		return (top==-1 )? true : false;
	}
	
	}
	static void printA(int a[],int n)
	{
		int i=0;
		stack s=new stack();
		s.top=-1;
		int element,next;
		s.push(a[0]);
		for(int j=1;j<n;j++)
		{
			next=a[j];
			if(s.isEmpty()==false)
			{
				element=s.pop();
				while(element<next)
				{
					System.out.println(element+"-->"+next);
					if(s.isEmpty()==true)
						break;
					element=s.pop();
				}
				if(element>next)
					s.push(element);
			}
			s.push(next);
		}
		while(s.isEmpty()==false)
		{
			element=s.pop();
			next=-1;
			System.out.println(element+"-->"+next);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		printA(a,n);
		sc.close();
	}

}
