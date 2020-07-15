package arrays_preparation;
import java.util.*;
public class Problem_8 {
	static void reverse(int a[],int n,int k)
	{
		for(int i=0;i<n;i=i+k)
		{
			int start=i;
			int end=Math.min(i+k-1, n-1);
			while(start<=end)
			{
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
				start++;
				end--;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	System.out.println(" ");
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter k value");
		int k=sc.nextInt();
		reverse(a,n,k);

	}

}
