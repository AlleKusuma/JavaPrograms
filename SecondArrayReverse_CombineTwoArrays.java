package arrays;

public class SecondArrayReverse_CombineTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,20,30,40,50};
		int b[]=new int[] {60,70,80,90,100};
		int c[]=new int[a.length+b.length];
		for(int x=0;x<a.length;x++)
		{
			c[x]=a[x];
		}
		for(int x=0,y=a.length;x<b.length;x++,y++)
		{
			c[x+a.length]=b[b.length-1-x];
		}
		for(int temp:c)
		{
			System.out.print(temp+" ");
		}
		
	}

}
