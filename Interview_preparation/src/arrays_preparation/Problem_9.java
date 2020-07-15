package arrays_preparation;
import java.util.*;
public class Problem_9 {
	static boolean pytho(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					int x=a[i]*a[i];
					int y=a[j]*a[j];
					int z=a[k]*a[k];
					if(x==y+z || y==x+z || z==x+y)
					{
						return true;
					}
				}
			}
		}
		return false;
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
		System.out.println(pytho(a,n));

	}

}
