package arrays_preparation;
import java.util.*;
public class Merge_sort {
	static void merge(int a[],int b,int m,int e)
	{
		int n1=m-b+1;
		int n2=e-m;
		int l[]=new int[n1];
		int r[]=new int[n2];
		for(int i=0;i<n1;i++)
		{
			l[i]=a[b+i];
		}
		for(int j=0;j<n2;j++)
		{
			r[j]=a[m+1+j];
		}
		int i=0;
		int j=0;
		int k=b;
		while(i<n1&&j<n2)
		{
			if(l[i]<=r[j])
			{
				a[k]=l[i];
				i++;
			}
			else
			{
				a[k]=r[j];
				j++;
			}
			k++;
		}
			while(i<n1)
			{
				a[k]=l[i];
				i++;
				k++;
			}
			while(j<n2)
			{
				a[k]=r[j];
				j++;
				k++;
			}
		}
	static void sort(int a[],int b,int e)
	{
		if(b<e)
		{
			int m=(b+e)/2;
			sort(a,b,m);
			sort(a,m+1,e);
			merge(a,b,m,e);
		}
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
		int b=0;
		int e=n-1;
		sort(a,b,e);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
