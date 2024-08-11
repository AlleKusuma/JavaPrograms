package arrays;

public class EvenIndexElements_OddIndexElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,20,30,40,50,60,70,80,20,100,101};
		int b[]=new int[a.length];
		int length=a.length;
		System.out.println("even index or odd index elements");
		if(length%2==0)
		{
			int y=0,z=length/2;
			for(int x=0;x<a.length;x++)
			{
				if(x%2==0)
				{
					b[y]=a[x];
					y++;
				}
				else
				{
					b[z]=a[x];
					z++;
				}
			}
			
		}
		else
		{
			for(int x=0;x<a.length;x++)
			{
				b[x]=a[x];
			}
		}
		for(int temp:b)
		{
			System.out.println(temp);
		} 
		System.out.println();
		System.out.println("adjacent elements");
		int c[]=new int[a.length];
//		if(a.length%2==0)
//		{
//			for(int x=0;x<a.length;x+=2)
//			{
//				if(x<a.length)
//				{
//					c[x]=a[x+1];
//					c[x+1]=a[x];
//				}			
//			}
//		}
//		else
//		{
//			for(int x=0;x<a.length;x+=2)
//			{
//				if(x<a.length)
//				{
//					if(x==a.length-1)
//					{
//						
//						c[x-1]=a[x];
//						c[x]=a[x-2];
//					}
//					else
//					{
//						c[x]=a[x+1];
//						c[x+1]=a[x];
//					}
//				}			
//			}
//		}
		for(int x=0;x<a.length;x+=2)
		{
			if(x<a.length)
			{
				if(x==a.length-1)
				{
					
					c[x-1]=a[x];
					c[x]=a[x-2];
				}
				else
				{
					c[x]=a[x+1];
					c[x+1]=a[x];
				}
			}			
		}
		for(int temp:c)
		{
			System.out.print(temp+" ");
		}
	}

}
