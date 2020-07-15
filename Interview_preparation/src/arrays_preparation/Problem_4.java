package arrays_preparation;
import java.util.*;
public class Problem_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[]=new int[m];
		int b[]=new int[n];
		for(int i=0;i<m;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			b[j]=sc.nextInt();
		}
		int ans=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(Math.pow(a[i], b[j])>Math.pow(b[j], a[i]))
				{
					ans++;
				}
			}
		}
		System.out.println(ans+" ");

		
	}

}
