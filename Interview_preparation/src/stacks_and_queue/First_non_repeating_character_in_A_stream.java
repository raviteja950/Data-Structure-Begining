package stacks_and_queue;
import java.util.*;
public class First_non_repeating_character_in_A_stream {

	static void nonrepeating(char ch[],int n)
	{
		int i=0;
		Set<Character> s=new HashSet<>();
		Queue<Character> q=new LinkedList<>();
		while(i<n)
		{
			if(!s.contains(ch[i]))
			{
				s.add(ch[i]);
				q.add(ch[i]);
				System.out.println(q.peek());
			}
			else
			{
				q.remove(ch[i]);
				if(q.isEmpty())
				{
					System.out.println(-1);
				}
				else
				{
					System.out.println(q.peek());
				}
			}
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		char ch[]=new char[n];
		String s=sc.next();
        nonrepeating(s.toCharArray(),n);
	}

}
