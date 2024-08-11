package arrays;

import java.util.Arrays;

public class SecondMinimumElementWithSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]=new int[] {100,90,20,10,30,10,50,10,20};
		 Arrays.sort(a);
		 System.out.println("after sorting");
		 for(int x=0;x<a.length;x++)
		 {
			 System.out.print(a[x]+" ");
		 }
		// System.out.println("\nsecondmin "+a[1]);
		 for(int x=0;x<a.length;x++)
		 {
			 if(a[0]!=a[x])
			 {
				 System.out.println("\nsecondmin "+a[x]);
				 break;
			 }
		 }
		 System.out.println("min "+a[0]);
	}

}
