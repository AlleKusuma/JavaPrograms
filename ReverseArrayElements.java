package arrays;

public class ReverseArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {12,56,34,23,67,76,90,345};
		int copy[]=new int[a.length];
		for(int x=0;x<a.length;x++)
		{
			copy[x]=a[x];
		}
		int f[]=new int[a.length/2];
		int s[]=new int[a.length/2];
		System.out.println("first half array in reverse");
		for(int x=a.length-1;x>=a.length/2;x--)
		{
			System.out.print(a[x]+" ");
		}
		System.out.println();
		System.out.println("second half array in reverse");
		for(int x=a.length/2-1;x>=0;x--)
		{
			System.out.print(a[x]+" ");
		}
		System.out.println();
		System.out.println("even index elements");
		for(int x=0;x<a.length;x++)
		{
			if(x%2==0)
			{
				System.out.print(a[x]+" ");
			}
			
		}
		System.out.println();
		System.out.println("odd index elements");
		for(int x=0;x<a.length;x++)
		{
			if(x%2!=0)
			{
				System.out.print(a[x]+" ");
			}
			
		}
		System.out.println();
		System.out.println("elements divisible by 4");
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%4==0)
			{
				System.out.print(a[x]+" ");
			}
			
		}
		System.out.println();
		System.out.println("divisible by 3");
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%3==0)
			{
				System.out.print(a[x]+" ");
			}
			
		}
		System.out.println();
		int d[]=new int[a.length];
		System.out.println("swap the adjacent elements");
		for(int x=0;x<a.length;x+=2)
		{
			d[x]=a[x+1];
			d[x+1]=a[x];
		}
		for(int temp:d)
		{
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println("sort the elemts in ascending");
		for(int x=0;x<copy.length;x++)
		{
			for(int y=x+1;y<copy.length;y++)
			{
				if(copy[x]>copy[y])
				{
					int t=copy[x];
					copy[x]=copy[y];
					copy[y]=t;
				}
			}
		}
		for(int temp:copy)
		{
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println("sort the elemts in descending");
		for(int x=0;x<copy.length;x++)
		{
			for(int y=x+1;y<copy.length;y++)
			{
				if(copy[x]<copy[y])
				{
					int t=copy[x];
					copy[x]=copy[y];
					copy[y]=t;
				}
			}
		}
		for(int temp:copy)
		{
			System.out.print(temp+" ");
		}
		
	}

}
