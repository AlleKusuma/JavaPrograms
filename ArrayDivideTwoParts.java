package arrays;
import java.util.Scanner;
public class ArrayDivideTwoParts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[6];
		int brr[]=new int[arr.length/2];
		int crr[]=new int[arr.length/2];
		Scanner sc=new Scanner(System.in);
		for(int x=0;x<arr.length;x++)
		{
			arr[x]=sc.nextInt();
		}
		for(int x=0;x<arr.length;x++)
		{
			if(x<brr.length)
				brr[x]=arr[x];
			else
				crr[x-arr.length/2]=arr[x];
		}
		
		for(int x=0;x<arr.length;x++)
		{
			if(x<brr.length)
				System.out.println("brr[ "+x+"]= "+brr[x]);
			else
				System.out.println("crr[ "+(x-arr.length/2)+"]= "+crr[x-arr.length/2]);
		}
		/*	for(int x=0;x<arr.length;x++)
		{
			arr[x]=sc.nextInt();
		};
		}
		for(int x=0;x<crr.length;x++)
		{
			crr[x]=arr[x+arr.length/2];
		}
		for(int x=0;x<brr.length;x++)
		{
			System.out.println("brr[ "+x+"]= "+brr[x]);
		}
		for(int x=0;x<crr.length;x++)
		{
			System.out.println("crr[ "+x+"]= "+crr[x]);
		}*/
	}

}
