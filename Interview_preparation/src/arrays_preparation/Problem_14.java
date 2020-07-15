package arrays_preparation;
import java.util.*;
public class Problem_14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
		while(n-->0)
		{
		String s=sc.next();
		int index=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)=='1')
			{
				index=1;
				System.out.println(i);
				break;
			}
		}
		if(index==0)
		System.out.println("-1");
		}	

	}

}
