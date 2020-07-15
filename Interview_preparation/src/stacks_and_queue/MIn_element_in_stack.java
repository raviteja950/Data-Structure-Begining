package stacks_and_queue;
import java.util.Stack;
public class MIn_element_in_stack 
{
	Stack<Integer> s=new Stack<>();
	Stack<Integer> s2=new Stack<>();
	int min;
	int getmin()
	{
		if(s.isEmpty()||s2.isEmpty())
		{
			return -1;
		}
		else
		{
			int m=s2.peek();
			return m;
		}
	}
	int pop()
	{
		if(!s.isEmpty())
		{
			int f=s.pop();
			int s=s2.pop();
			return f; 
		}
		else {
			return -1;
		}
		
	}
	void push(int x)
	{
		if(s.isEmpty())
		{
			min=x;
			 s.push(x);
			s2.push(x);
		}
		else
		{
			s.push(x);
			int y=s2.pop();
			s2.push(y);
			if(x<y)
			{
				s2.push(x);
			}
			else
			{
				s2.push(y);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		MIn_element_in_stack a=new MIn_element_in_stack ();
		a.push(18);
		a.push(19);
		a.push(29);
//		a.push(15);
//		a.push(16);
		System.out.println(a.getmin());
		
	}

}
