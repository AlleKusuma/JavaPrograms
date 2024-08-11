package arrays;
import java.util.*;
public class SecondLargestElements_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
	//	int a[]=new int[] {200,10,-5,20,25,15,55,-100};
		int a[]=new int[6];
		for(int x=0;x<a.length;x++)
		{
			a[x]=r.nextInt(1,1000);
		}
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
		int max=Integer.MIN_VALUE,sec_max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,sec_min=Integer.MAX_VALUE;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>max)
			{
				sec_max=max;
				max=a[x];
			}
			else if(max!=a[x] && a[x]>sec_max)
			{
				sec_max=a[x];
			}
			if(a[x]<min)
			{
				sec_min=min;
				min=a[x];
			}
			else if(a[x]!=min && a[x]<sec_min)
			{
				sec_min=a[x];
			}
		}
		System.out.println("secondmax "+sec_max);
		System.out.println("max value "+max);
		System.out.println("min value "+min);
		System.out.println("secondmin "+sec_min);
	}

}
