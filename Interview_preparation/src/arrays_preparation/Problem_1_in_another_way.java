package arrays_preparation;
import java.util.*;
public class Problem_1_in_another_way {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the key value");
		int k=sc.nextInt();
        sc.close();
        int sum=0;
        int flag=0;
        int header=0;
        for(int i=0;i<n;i++)
        {
        	sum+=a[i];
        	while(sum>k)
        	{
        		sum=sum-a[header];
        		header++;
        	}
        	if(sum==k)
        	{
        		flag=1;
        		System.out.println((header)+" "+(i));
        		break;
        	}
        }
        if(flag==0)
        {
         System.out.println(-1);
        }
	}

}
