package arrays;

public class PrintUniqueElements_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {1,2,3,3,1,2,4,4,5,3};
		int b[]=new int[a.length];
		//int value=a[0];
		
		for(int x=0;x<a.length;x++)
		{
			int count=1;
			if(b[x]==1)
				continue;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					b[y]=1;
					count++;
				}
					//System.out.println(a[x]);
			}
			if(count>1)
				System.out.println(a[x]);
			//System.out.println(a[x]+" "+count);
			
		}
	}

}
