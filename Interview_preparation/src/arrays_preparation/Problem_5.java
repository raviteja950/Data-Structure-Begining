package arrays_preparation;
import java.util.*;
public class Problem_5 {
	static void point(int a[],int n)
	{
		int s[]=new int[n];
		int sum=0;
		int sum1=0;
		int ans=-1;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
			s[i]=sum;
		}
		for(int i=n-1;i>=0;i--)
		{
			sum1=sum1+a[i];
			if(sum1==s[i])
			{
				ans=i+1;
			}
		}
		if(ans==0)
		{
			System.out.println("0");
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+" ");
		}
		
	System.out.println(ans);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0)
		{		
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		point(a,n);
		}
	}

}
