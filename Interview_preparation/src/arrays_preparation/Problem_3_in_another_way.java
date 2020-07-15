package arrays_preparation;
import java.util.*;
public class Problem_3_in_another_way {
	static void arrange(int a[],int s,int l)
	{
		if(l==0)
		{
			System.out.println(a[l]+" ");
		}
		while(l>s)
		{
			System.out.print(a[l]+" ");
			l--;
			System.out.print(a[s]+" ");
			s++;
			if(s==l)
				System.out.print(a[s]+" ");
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int s=0;
		int l=n-1;
		arrange(a,s,l);

	}

}
