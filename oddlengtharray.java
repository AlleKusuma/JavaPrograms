package arrays;

import java.util.Scanner;

public class oddlengtharray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {10,20,30,40,50};
		int brr[]=new int[arr.length/2+1];
		int crr[]=new int[arr.length/2];
		
		if(arr.length%2!=0)
		{
			for(int x=0;x<brr.length;x++)
			{
				brr[x]=arr[x];
			}
			for(int x=0;x<crr.length;x++)
			{
				crr[x]=arr[brr.length-1+x+1];
			}
			
		}
		else
		{
			for(int x=0;x<brr.length;x++)
			{
				brr[x]=arr[x];
			}
			for(int x=0;x<crr.length;x++)
			{
				crr[x]=arr[brr.length+x];
			}
		}
		for(int x=0;x<brr.length;x++)
		{
			System.out.println("brr[ "+x+"]= "+brr[x]);
		}
		for(int x=0;x<crr.length;x++)
		{
			System.out.println("crr[ "+x+"]= "+crr[x]);
		}
	}

}
