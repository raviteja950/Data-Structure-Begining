package arrays_preparation;
import java.util.*;
public class Problem_6 {
static int leader(int a[],int n)
{
	int max=a[n-1];
	for(int i=n-2;i>0;i--)
	{
		System.out.println(max);
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	return max;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(leader(a,n));

	}

}
