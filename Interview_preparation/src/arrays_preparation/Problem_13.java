package arrays_preparation;
import java.util.*;
public class Problem_13 {
static void zigzag(int a[],int n)
{
	int flag=1;
	int temp=0;
	for(int i=0;i<n-2;i++)
	{
		if(flag==1)
		{
			if(a[i]>a[i+1])
			{
				 temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
			flag=-1;
		}
		else
		{
			if(a[i]<a[i+1])
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
			flag=1;
		}
		
	}
	
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        zigzag(a,n);
        for(int i=0;i<n;i++)
        {
        	System.out.println(a[i]+" ");
        }
		}
	}

}
