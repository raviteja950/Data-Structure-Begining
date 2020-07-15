package stacks_and_queue;

import java.util.Stack;

public class Queue_using_two_stacks {
	static Stack<Integer> s1=new Stack<Integer>();
    static Stack<Integer> s2=new Stack<Integer>();
	void push(int x)
	{
		while(!s1.isEmpty())
		{
			s2.push(s1.pop());
		}
		s1.push(x);
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
		
	}
	int pop()
	{
		if(s1.isEmpty())
		{
			System.out.println("queue is empty");
			System.exit(0);
		}
		int x=s1.peek();
		s1.pop();
		return x;
			
	}

	public static void main(String[] args) 
	{
		Queue_using_two_stacks a=new Queue_using_two_stacks();
		a.push(1);
		a.push(2);
		a.push(3);
		a.push(4);
        System.out.print(a.pop()+" ");
        System.out.print(a.pop()+" ");
        System.out.print(a.pop()+" ");
        System.out.println(a.pop()+" ");
        System.out.println(a.pop()+" ");
        
       
        
        
	}

}
