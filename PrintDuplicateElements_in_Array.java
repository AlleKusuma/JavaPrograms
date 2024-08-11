package arrays;

public class PrintDuplicateElements_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {2,3,4,5,3,2,6,3,1,6};
		for(int x=0;x<a.length;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
					System.out.println(a[x]);
			}
		}
		
	}

}
