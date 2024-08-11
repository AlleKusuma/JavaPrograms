package arrays;

public class ToRemoveDuplicateElements_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {1,2,3,1,2,4};
		int b[]=new int[a.length];
		for(int x=0;x<a.length;x++)
		{
			int count=1;
			if(b[x]==a[x])
				continue;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					count++;
					b[y]=a[x];
				}
			}
			if(count==1)
			{
					b[x]=a[x];
					//System.out.print(b[x]+" ");
			}
		}
		for(int t:b)
		{
			if(t!=0)
				System.out.print(t+" ");
		}
			
	}

}
