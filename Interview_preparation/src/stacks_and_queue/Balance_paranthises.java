package stacks_and_queue;

import java.util.Scanner;
import java.util.Stack;

public class Balance_paranthises {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
				while(t-->0)
				{
		String n=sc.next();
		Stack<Character> ravi=new Stack<>();
		for(int i=0;i<n.length();i++)
		{
			char ch=n.charAt(i);
		    if(ravi.empty())
		    {
			ravi.push(ch);
		    }
		    else if(ch == '{' || ch=='[' || ch=='(')
		    {
		    	ravi.push(ch);
		    }
		    else
		    {
		    	if(ch ==')' && ravi.peek()=='(')
		        {
		    	ravi.pop();
		        }
		    	else if(ch=='}' && ravi.peek()=='{')
		    	{
		    		ravi.pop();
		    	}
		    	else if(ch==']' && ravi.peek()=='[')
		    	{
		    		ravi.pop();
		    	}
		    	else
		    	{
		    		ravi.push(ch);
		    	}
		    }
	    }
         if(ravi.isEmpty())
         {
        	 System.out.println("Balanced");
         }
         else
         {
        	 System.out.println("Not Balanced");
         }
				}
	}

	}
