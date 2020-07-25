package recurssion;

public class Sum_fo_first_natural_numbers {

	public static void main(String[] args) 
	{
    System.out.println(sum(15));
	}
	public static int sum(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return n+sum(n-1);
	}

}
