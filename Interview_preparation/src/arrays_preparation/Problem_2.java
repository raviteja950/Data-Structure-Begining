package arrays_preparation;
import java.util.*;
public class Problem_2 {
	static int count(int a[],int n)
	{
		 int max_val = 0; 
	        for (int i = 0; i < n; i++) 
	            max_val = Math.max(max_val, a[i]); 
	        int[] freq = new int[max_val + 1]; 
	        for (int i = 0; i < n; i++) 
	            freq[a[i]]++; 
	  
	        int ans = 0;
	        ans += freq[0] * (freq[0] - 1) * (freq[0] - 2) / 6;
	        for (int i = 1; i <= max_val; i++) 
	            ans += freq[0] * freq[i] * (freq[i] - 1) / 2; 
	  
	        // Case 3: x, x, 2*x 
	        for (int i = 1; 2 * i <= max_val; i++) 
	            ans += freq[i] * (freq[i] - 1) / 2 * freq[2 * i]; 
	  
	        // Case 4: x, y, x + y 
	        // iterate through all pairs (x, y) 
	        for (int i = 1; i <= max_val; i++) { 
	            for (int j = i + 1; i + j <= max_val; j++) 
	                ans += freq[i] * freq[j] * freq[i + j];
	        }
	        return ans;
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
		System.out.println(count(a,n));
	}
}

