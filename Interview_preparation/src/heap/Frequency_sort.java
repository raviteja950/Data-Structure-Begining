package heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Frequency_sort {
	public static List<Character> frequency(String s)
	{
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
		map.put(s.charAt(i),
				map.getOrDefault(s.charAt(i), 0)+1);
		}
		PriorityQueue<Map.Entry<Character, Integer>> maxheap=new PriorityQueue<>
		((n1,n2)->n1.getValue()-n2.getValue());
		
		maxheap.addAll(map.entrySet());
		List<Character> l=new ArrayList<>();
		while(!maxheap.isEmpty())
		{
			Map.Entry<Character, Integer> entry=maxheap.poll();
			l.add(entry.getKey());
		}
		return l;
		}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next(); 
		System.out.println(frequency(s));
	}

}
