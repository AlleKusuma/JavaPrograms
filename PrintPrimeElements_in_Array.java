package arrays;

public class PrintPrimeElements_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {2,47,6,77,5,9,06,19,8};
		for(int x=0;x<a.length;x++)
		{
			int count=0;
			for(int i=2;i<=a[x]/2;i++)
			{
				if(a[x]%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0 & a[x]>1)
				System.out.print(a[x]+" ");
		}
	}

}
