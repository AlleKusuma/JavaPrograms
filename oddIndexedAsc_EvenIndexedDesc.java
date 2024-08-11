package arrays;

public class oddIndexedAsc_EvenIndexedDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		int b[]=new int[a.length/2];
		int c[]=new int[a.length/2];
		for(int x=0,y=0,z=0;x<a.length;x++)
		{
			if(x%2==0)
			{
				b[y]=a[x];
				y++;
			}
			else
			{
				c[z]=a[x];
				z++;
			}
		}
		for(int x=0;x<b.length;x++)
		{
			for(int y=x+1;y<b.length;y++)
			{
				if(b[x]<b[y])
				{
					int t=b[x];
					b[x]=b[y];
					b[y]=t;
				}
			}
		}
		System.out.println("even indexed array elements");
		for(int temp:b)
		{
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println("odd indexed array values");
		for(int x=0;x<c.length;x++)
		{
			for(int y=x+1;y<c.length;y++)
			{
				if(c[x]>c[y])
				{
					int t=c[x];
					c[x]=c[y];
					c[y]=t;
				}
			}
		}
		for(int temp:c)
		{
			System.out.print(temp+" ");
		}
		
	}

}
