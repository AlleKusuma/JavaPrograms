package arrays;
import java.util.Scanner;
public class SumElelemts_in_2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int rows=3,cols=3;
		int a[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]=new int[][] {{10,20,30},{1,2,3},{4,5,6}};
		int c[][]=new int[b.length][];
		int d[][]=new int[a.length][];
		
		for(int x=0;x<a.length;x++)
		{
			b[x]=new int[a[x].length];
		}
		for(int x=0;x<b.length;x++)
		{
			c[x]=new int[b[x].length];
		}
		for(int x=0;x<a.length;x++)
		{
			d[x]=new int[a[x].length];
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements");
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a[x].length;y++)
			{
				//a[x][y]=sc.nextInt();
				System.out.print(a[x][y]+" ");
			}
			System.out.println();
		}
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		for(int x=0;x<a.length;x++)
		{
			int sum=0;
			for(int y=0;y<a[x].length;y++)
			{
				
				sum=sum+a[x][y];//System.out.print(a[x][y]+" ");
			}
			System.out.println(sum);
			if(max<sum)
				max=sum;
			if(min>sum)
				min=sum;
			//System.out.println();
		}
		System.out.println(max+" is max");
		System.out.println(min+" is min");
		System.out.println("left diagonal elements");
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a[x].length;y++)
			{
				if(x==y)
					System.out.println(a[x][y]);
			}
		}
		System.out.println("right diagonal elements");
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a[x].length;y++)
			{
				if((x+y)==a.length-1)
					System.out.println(a[x][y]);
			}
		}
		System.out.println("copy one array into another array");
		for(int x=0;x<b.length;x++)
		{
			for(int y=0;y<b[x].length;y++)
			{
				b[x][y]=a[x][y];
				System.out.print(b[x][y]+" ");
			}
			System.out.println();
		}
		System.out.println("Add 2 Arrays array into another array");
		for(int x=0;x<c.length;x++)
		{
			for(int y=0;y<c[x].length;y++)
			{
				c[x][y]=a[x][y]+b[x][y];
				System.out.print(c[x][y]+" ");
			}
			System.out.println();
		}
		System.out.println("print even numbers in each row");
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a[x].length;y++)
			{
				if(a[x][y]%2==0)
					System.out.println(a[x][y]);
			}
		}
		System.out.println("print prime numbers in each row");
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a[x].length;y++)
			{int count=0;
				for(int i=2;i<=a[x][y]/2;i++)
				{
					if(a[x][y]%i==0)
					{
						count++;
						break;
					}
				}
				if(count==0 && a[x][y]>1)
					System.out.println(a[x][y]);
			}
		}
		System.out.println("sub 2 Arrays array into another array");
		for(int x=0;x<a.length;x++)
		{
			int sub=0;
			for(int y=0;y<a[x].length;y++)
			{
				 sub=a[x][y]-b[x][y];
				System.out.print(sub+" ");
			}
			System.out.println();
		}
		System.out.println("sum of left diagonal & right diagonal elements");
		int sum=0;
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a[x].length;y++)
			{
				if((x==y) || (x+y)==a.length-1)
				{
					sum=sum+a[x][y];
					//System.out.println(sum);
				}
					
			}
		}
		System.out.println(sum);
	}

}
