package arrays;
import java.util.*;
import java.util.Arrays;

public class FindMissingElement_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {1,2,3,4,5,6,7,8,9};
		int b[]=new int[] {2,5,8,7,9,3,4,5,6,7,8,9,4};
		System.out.println(Arrays.equals(a, a));
		System.out.println();
		if(Arrays.binarySearch(a, 89)>=0)
			System.out.println("element found ");
		else
			System.out.println("element not found");
		System.out.println();
		
		for(int x=0;x<a.length;x++)
		{
			int count=0;
			int temp=a[x];//1
			for(int y=0;y<b.length;y++)
			{//0 0<7
				if(temp==b[y])
				{// 1==b[0]  1==2 false
					count++;
				}
				
			}
			if(count==0)
				System.out.println(a[x]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int a[]=new int[9];
//		Random r=new Random();
//		for(int x=0;x<a.length;x++)
//		{
//			a[x]=r.nextInt(1,10);
//		}
//		Arrays.sort(a);
//		for(int x=0;x<a.length;x++)
//		{
//			System.out.print(a[x]+" ");
//		}
//		int s=1;
//		for(int x=0;x<a.length;x++)
//		{
//			while (a[x] > s) {
//                System.out.println("Missing element: " + s);
//                s++;
//            }
//            s = a[x] + 1;
//			
//		}
		
	}

}
