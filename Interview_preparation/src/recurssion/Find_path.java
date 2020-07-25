package recurssion;

public class Find_path {

	public static void main(String[] args) {
		System.out.println(path(2,2));

	}
	static int path(int a,int b)
	{
		if(a==1 || b==1 )
		{
			return 1;
		}
		return path(a,b-1)+path(b,a-1); 
	}

}
