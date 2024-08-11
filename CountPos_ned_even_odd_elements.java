package arrays;
import java.util.Scanner;
public class CountPos_ned_even_odd_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter how many elements you want");
		int a[]=new int[n];
		System.out.println("enter elements");
		for(int x=0;x<n;x++)
		{
			a[x]=sc.nextInt();
		}
		int pos=0,neg=0,even=0,odd=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>0)
			{
				pos++;
			}
			else if(a[x]<0)
				neg++;
			if(a[x]%2==0)
				even++;
			else if(a[x]%2!=0)
				odd++;
		}
		System.out.println("pos"+pos);
		System.out.println("neg"+neg);
		System.out.println("even"+even);
		System.out.println("odd"+odd);
	}

}
