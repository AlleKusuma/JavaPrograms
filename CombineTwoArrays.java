package arrays;

public class CombineTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,20,30,40,50};
		int b[]=new int[] {60,70,80};
		int c[]=new int[a.length+b.length];
		for(int x=0;x<a.length;x++)
		{
			c[x]=a[x];
		}
		for(int x=0;x<b.length;x++)
		{
			c[x+a.length]=b[x];
		}
		for(int x=0;x<c.length;x++)
		{
			System.out.println(c[x]);
		}
	}

}
