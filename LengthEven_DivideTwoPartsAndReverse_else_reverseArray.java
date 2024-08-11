package arrays;

public class LengthEven_DivideTwoPartsAndReverse_else_reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,20,30,40,50,60};
		int b[]=new int[a.length];
		if(a.length%2==0)
		{
			for(int x=0;x<a.length/2;x++)
			{
				b[x]=a[a.length/2-1-x];
			}
			for(int x=a.length/2,y=0;x<a.length;x++,y++)
			{
				b[x]=a[a.length-1-y];
			}
		}
		else
		{
			for(int x=0;x<a.length;x++)
			{
				b[x]=a[a.length-1-x];
			}
		}
		for(int temp:b)
		{
			System.out.print(temp+" ");
		}
	}

}
