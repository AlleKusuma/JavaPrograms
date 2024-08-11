package arrays;

public class BothArraysEqual_or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,20,30,40,50,90};
		int b[]=new int[] {10,20,30,40,50,80};
		String res="no";
		if(a.length==b.length)
		{
			int count=0;
			
			for(int x=0;x<a.length;x++)
			{
				if(a[x]==b[x])
				{
					//count++;
					res="equal";
				}
				else
				{
					res="notequal";
				}
			}
//			if(count==a.length)
//			{
//				
//				//System.out.println("both are equal");
//			}
//			else
//			{
//				System.out.println("both are not equal");
//			}
		}
		else
		{
			res="both are not equal";
		}
		System.out.println(res);
	}

}
