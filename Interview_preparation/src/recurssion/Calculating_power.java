package recurssion;

public class Calculating_power {

	public static void main(String[] args) 
	{
		System.out.println(power(3,4));
	}
	static int power(int a,int b)
	{
		if(b==0)
		{
			return 1;
		}
		return a*power(a,b-1);
	}

}
