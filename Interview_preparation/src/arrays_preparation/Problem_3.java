package arrays_preparation;
import java.util.*;
public class Problem_3 {
	public static void rearrange(int a[],int n)
	{
		int max=a[n-1];
		int min=a[0];
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				a[i]=max;
				max-=1;
			}
			else
			{
				a[i]=min;
				min+=1;
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		rearrange(a,n);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}

	}

}
