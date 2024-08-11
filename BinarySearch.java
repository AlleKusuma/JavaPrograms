package arrays;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,20,40,80,100,30,50,60,90};
		Arrays.sort(a);
		int f=0,l=a.length-1,search=180,mid;
		while(f<=l)
		{
			mid=(f+l)/2;
			if(search==a[mid])
			{
				System.out.println("element found");
				break;
			}
			else if(search>a[mid])
			{
				f=mid+1;
			}
			else
			{
				l=mid-1;
			}
		}
		if(f>l)
		{
			System.out.println("element not found");
		}
	}

}
