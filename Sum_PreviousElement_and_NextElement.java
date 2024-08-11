package arrays;
import java.util.Scanner;
public class Sum_PreviousElement_and_NextElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter array elements");
		int arr[]=new int[5];
		int brr[]=new int[arr.length];
		for(int x=0;x<arr.length;x++)
		{
			arr[x]=s.nextInt();
		}
		for(int x=0;x<arr.length;x++)
		{
			if(x==0)
			{
				brr[x]=arr[x]+arr[x+1];
			}
			else if(x==arr.length-1)
			{
				brr[x]=arr[x-1]+arr[x];
			}
			else
			{
				brr[x]=arr[x-1]+arr[x+1];
			}
		}
		for(int x=0;x<brr.length;x++)
		{
			System.out.println("brr[ "+x+"] = "+brr[x]);
		}
	}

}
