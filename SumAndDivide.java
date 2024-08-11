package arrays;

public class SumAndDivide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {34,13,12,8};
		int b[]=new int[a.length];
		int sum=0;
		for(int x=0;x<a.length;x++)
		{
			sum=sum+a[x];
		}
		for(int x=0;x<a.length;x++)
		{
			b[x]=(int)(sum/a[x]);
		}
		for(int temp:b)
		{
			System.out.println(temp);
		}
	}

}
