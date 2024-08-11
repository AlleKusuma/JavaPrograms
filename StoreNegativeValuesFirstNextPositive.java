package arrays;

public class StoreNegativeValuesFirstNextPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {-2,4,5,-1,6,-9,2,3,7,8,-6,-4,0};
		int b[]=new int[a.length];
		int x=0;	
		for(int y=0;y<a.length;y++)
		{
			if(a[y]<0)
			{
				b[x++]=a[y];
				//x++;
			}
		}
		for(int y=0;y<a.length;y++)
		{
			if(a[y]>=0)
			{
				b[x++]=a[y];
				//x++;
			}
		}
		for(int t:b)
		{
			System.out.print(t+" ");
		}
	}

}
