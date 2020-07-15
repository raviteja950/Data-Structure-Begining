package arrays_preparation;
import java.util.*;
public class Problem_12 {
static int Right(int a[],int n)

{
	int l[]=new int[n];
	l[0]=Integer.MIN_VALUE;
	for(int i=1;i<n;i++)
	{
		l[i]=Math.max(l[i-1], a[i-1]);
	}
	int right=Integer.MAX_VALUE;
	 for (int i = n - 1; i >= 0; i--)  
     { 
          if (l[i] < a[i] && right > a[i]) 
              return a[i]; 

         
          right = Math.min(right, a[i]);  
     } 
        
    
     return -1; 

}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
      System.out.println(Right(a,n));
	}

}
