package arrays;

public class TwoArrayElements_EqualtoK_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {1,4,5,6,2,-1,0,5,9,-2};
		int k=5;
		for(int x=0;x<a.length;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(k==a[x]+a[y])
					System.out.println(a[x]+" , "+a[y]);
			}
			
		}

		
	}

}
