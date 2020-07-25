package recurssion;

public class Flood_fill 
{
	public static void main(String[] args) 
	{
      int a[][]= {{1,1,1,1},
    		      {1,1,2,2},
    		      {1,1,1,1},
    		      {1,1,1,1}
      };
      floodfill(a,0,0,8,1);
      display(a);
	}
	public static void floodfill(int a[][],int r,int c,int tofill,int previousfill)
	{
		int rows=a.length;
		int cols=a[0].length;
		if(r<0 || r>=rows || c<0 || c>=cols)
		{
			return;
		}
		if(a[r][c]!=previousfill)
		{
			return;
		}
		a[r][c]=tofill;
		floodfill(a,r-1,c,tofill,previousfill);
		floodfill(a,r,c-1,tofill,previousfill);
		floodfill(a,r,c+1,tofill,previousfill);
		floodfill(a,r+1, c,tofill,previousfill);
		
	}
	public static void display(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
