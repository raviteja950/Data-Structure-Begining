package heap;
class heap
{
	int size;
	int a[]=new int[20];
	public void insert(int val)
	{
		a[size]=val;
		int index=size;
		int parent=(index-1)/2;
		while(parent>=0 && a[parent]<a[index])
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
	public int getmax()
	{
		return a[0];
	}
	public int delete()
	{
		int max=a[0];
		a[0]=a[size-1];
		size=size-1;
		maxheap(0);
		return max;
	}
	public void maxheap(int index)
	{
		int l;
		int r;
		l=2*index+1;
		r=2*index+2;
		int largest=index;
		if(l<this.size && a[l]>a[largest])
		{
			largest=l;
		}
		if(r<this.size && a[r]>a[largest])
		{
			largest=r;
		}
		if(largest!=index)
		{
			int t=a[largest];
			a[largest]=a[index];
			a[index]=t;
			maxheap(largest);
		}
	}
public void buildheap(int a[])
	{
		this.size=a.length;
		this.a=a;
		for(int i=size/2-1;i>=0;i--)
		{
			maxheap(i);
		}
	}
	
	
}



public class Max_heap {

	public static void main(String[] args)
	{
		heap b=new heap();
		int a[]= {10,7,11,30,20,38,2,45};
		b.insert(a[0]);
		b.insert(a[1]);
		b.insert(a[2]);
		System.out.println(b.getmax());
		b.insert(a[3]);
		b.insert(a[4]);
		System.out.println(b.getmax());
		b.insert(a[5]);
		b.insert(a[6]);
		b.insert(a[7]);
		System.out.println(b.getmax());
		b.delete();
		System.out.println(b.getmax());
		b.buildheap(a);
	}
}
