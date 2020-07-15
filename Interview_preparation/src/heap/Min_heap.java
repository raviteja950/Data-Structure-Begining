package heap;
class heap1
{
	int size;
	int a[]=new int[20];
	public void insert(int val)
	{
		a[size]=val;
		int index=size;
		int parent=(index-1)/2;
		while(parent>=0 && a[parent]>a[index])
		{
			int t=a[parent];
			a[parent]=a[index];
			a[index]=t;
			
			t=parent;
			index=parent;
			parent=(t-1)/2;
		}
		size++;
	}
	public int getmin()
	{
		return a[0];
	}
	public int delete()
	{
		int min=a[0];
		a[0]=a[size-1];
		size=size-1;
		minheap(0);
		return min;
	}
	public void minheap(int index)
	{
		int l;
		int r;
		l=2*index+1;
		r=2*index+2;
		int smallest=index;
		if(l<=this.size && a[l]<a[smallest])
		{
			smallest=l;
		}
		if(r<=this.size && a[r]<a[smallest])
		{
			smallest=r;
		}
		if(smallest!=index)
		{
			int t=a[smallest];
			a[smallest]=a[index];
			a[index]=t;
			minheap(smallest);
		}
	}
}




public class Min_heap {

	public static void main(String[] args)
	{
		heap1 b=new heap1();
		int a[]= {10,7,11,30,20,38,2,45};
		b.insert(a[0]);
		b.insert(a[1]);
		b.insert(a[2]);
		System.out.println(b.getmin());
		b.insert(a[3]);
		b.insert(a[4]);
		System.out.println(b.getmin());
		b.insert(a[5]);
		b.insert(a[6]);
		b.insert(a[7]);
		System.out.println(b.getmin());
		b.delete();
		System.out.println(b.getmin());
				

	}

}
