package arrays;

public class divideArrayasc_desc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		int b[]=new int[a.length/2];
		int c[]=new int[a.length/2];
		for(int x=0;x<a.length/2;x++)
		{
			b[x]=a[x];
		}
		System.out.println("before sorting");
		for(int temp:b)
		{
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println("after sorting");
		for(int x=0;x<b.length;x++)
		{
			for(int y=x+1;y<b.length;y++)
			{
				if(b[x]>b[y])
				{
					int t=b[x];
					b[x]=b[y];
					b[y]=t;
				}
			}
		}
		for(int temp:b)
		{
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println("before sorting");
		int y=0;
		for(int x=a.length/2;x<a.length;x++)
		{
			c[y]=a[x];
			y++;
		}
//		for(int x=0;x<c.length;x++)
//		{
//			System.out.println(c[x]+" ",x);
//		}
		for(int temp:c)
		{
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println("after sorting");
		for(int x=0;x<c.length;x++)
		{
			for(int z=x+1;z<c.length;z++)
			{
				if(c[x]<c[z])
				{
					int t=c[x];
					c[x]=c[z];
					c[z]=t;
				}
			}
		}
		for(int temp:c)
		{
			System.out.print(temp+" ");
		}
	}

}
