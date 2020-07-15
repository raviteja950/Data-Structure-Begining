package arrays_preparation;
import java.util.*;
public class Problem_10 {
	static int cholate(int a[],int n,int m)
	{
		if(m==0||n==0)
		{
			return 0;
		}
		if(n<m)
		{
			return -1;
		}
		Arrays.sort(a);
		int max=Integer.MAX_VALUE;
		for(int i=0;i+m-1<n;i++)
		{
			int differ=a[i+m-1]-a[i];
			
				if(differ<max)
				{
					max=differ;
				}
		}
		return max;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
       {
	         a[i]=sc.nextInt();
       }
      System.out.println("enter the m value");
      int m=sc.nextInt();
      System.out.println(cholate(a,n,m));
	}
	}
}
