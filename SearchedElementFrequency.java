package arrays;
import java.util.Scanner;
public class SearchedElementFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many elements:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int x=0;x<n;x++)
		{
			a[x]=sc.nextInt();
		}
		int search=3;
		for(int x=0;x<a.length;x++)
		{
			int count=1;
			if(a[x]==1)
				continue;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					count++;
					a[y]=1;
				}
			}
			if(search==a[x])
			{
				System.out.println(search+" "+count);
			}
		}
	}

}
