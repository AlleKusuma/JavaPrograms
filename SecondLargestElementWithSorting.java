package arrays;
import java.util.*;
public class SecondLargestElementWithSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,20,30,50,60,90,90};
		//Random r=new Random();
//		for(int x=0;x<a.length;x++)
//		{
//			a[x]=r.nextInt(1,10000);
//		}
		for(int x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}
		Arrays.sort(a);
		System.out.println("\nafter sorting");
		for(int x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}
		//System.out.println("\ns "+a[a.length-2]);
		for(int x=a.length-2;x>=0;x--)
		{
			if(a[a.length-1]!=a[x])
			{
				System.out.println("\nsecondmax "+a[x]);
				break;
			}
		}
		System.out.println("max "+a[a.length-1]);
	}

}
