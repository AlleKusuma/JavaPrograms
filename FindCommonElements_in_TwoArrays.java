package arrays;

public class FindCommonElements_in_TwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {1,2,6,8,6,7,7,6,8,4,2,0,10,-1};
		int b[]=new int[] {1,5,3,4,2,6,6,7,8,9,0,10,-1};
		int c[]=new int[a.length],y=0;
		int d[]=new int[c.length];
		for(int x=0;x<a.length;x++)
		{
			if(c[x]==1)
				continue;
			for(int z=x+1;z<a.length;z++)
			{
				if(a[x]==a[z])
				{   
					c[z]=1;
				}	
			}
			c[x]=a[x];
			System.out.print(c[x]+" ");
//			for(int j=0;j<b.length;j++)
//			{
//				if(c[x]==b[j])
//				{
//					System.out.print(c[x]+" ");
//					break;
//				}
//			}
		}
//		for(int  i=0;i<d.length;i++)
//		{
//			for(int j=0;j<b.length;j++)
//			{
//				if(d[i]==b[j])
//				{
//					System.out.print(d[i]+" ");
//					break;
//				}
//			}
//		}
	}

}
