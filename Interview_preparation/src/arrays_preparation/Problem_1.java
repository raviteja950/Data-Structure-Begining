package arrays_preparation;
import java.util.*;
public class Problem_1 {
	static void subarray(int a[],int n,int k)
	{
	int sum=0;
	int start=0;
	int end=-1;
	HashMap<Integer,Integer> hs=new HashMap<>();
	for(int i=0;i<n;i++)
	{
		sum=sum+a[i];
	
	if(sum-k==0)
	{
		start=0;
		end=i;
		break;
	}
	if(hs.containsKey(sum-k))
	{
		start=hs.get(sum-k)+1;
		end=i;
		break;
	}
	hs.put(sum,i);
	}
	if(end==-1)
	{
		System.out.println("no sub elemennt present");
	}
	else
	{
		System.out.println(start + "  " + end);
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
		int k=sc.nextInt();
		sc.close();
		subarray(a,n,k);

	}

}
