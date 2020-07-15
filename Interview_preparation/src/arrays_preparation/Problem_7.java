package arrays_preparation;
import java.util.*;
public class Problem_7 {
	static void find(int a[],int d[],int n)
	{
		Arrays.sort(a);
		Arrays.sort(d);
		int max=0;
		int min=0;
		int i=0;int j=0;
		while(i<n&&j<n)
		{
			if(a[i]<d[j])
			{
				max++;
				i++;
				if(max>min)
				{
					min=max;
				}
				else
				{
					max--;
					j++;
				}
			}
		System.out.println(min);
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
		int d[]=new int[n];
		for(int j=0;j<n;j++)
		{
			d[j]=sc.nextInt();
		}
		find(a,d,n);

	}

}
