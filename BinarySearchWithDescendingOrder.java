package arrays;

import java.util.Arrays;

public class BinarySearchWithDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,20,40,80,100,30,50,60,90};
		int b[]=new int[a.length];
		Arrays.sort(a);
		for(int x=a.length-1;x>=0;x--)
		{
			b[a.length-1-x]=a[x];
		}
//		for(int x=0;x<a.length;x++)
//		{
//			for(int y=x+1;y<a.length;y++)
//			{
//				if(a[x]<a[y])
//				{
//					int t=a[x];
//					a[x]=a[y];
//					a[y]=t;
//				}
//			}
//		}
		for(int t:b)
			System.out.println(t);
		int f=0,l=b.length-1,search=10,mid;
		while(f<=l)
		{
			mid=(f+l)/2;
			//System.out.println(mid);
			if(search==b[mid])
			{
				System.out.println("element found");
				break;
			}
			else if(search>b[mid])
			{
				l=mid-1;
			}
			else
			{
				f=mid+1;
			}
		}
		if(f>l)
			System.out.println("element not found");
	}

}
