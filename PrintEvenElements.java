package arrays;
import java.util.Scanner;
public class PrintEvenElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintEvenElements p=new PrintEvenElements();
		System.out.println(p.getClass());
		Scanner s=new Scanner(System.in);
		System.out.println(s.getClass());
		System.out.println("enter array elements");
		int arr[]=new int[5];
		System.out.println(arr.getClass());
		for(int x=0;x<arr.length;x++)
		{
			arr[x]=s.nextInt();
		}
		System.out.println("print even elements");
		int sum=0;
		for(int x=0;x<arr.length;x++)
		{
			sum=sum+arr[x];
			if(arr[x]%2==0)
			{
				System.out.println(arr[x]);
			}
		}
		System.out.println("sum of array elements");
		System.out.println(sum);
	}

}
