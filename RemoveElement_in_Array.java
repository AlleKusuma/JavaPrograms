package arrays;

public class RemoveElement_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,20,30,40,50,60,70,80};
						//  0  1  2  3  4  5  6  7
		int b[]=new int[a.length];
		int index=4;//50
		int y=0;
		for(int x=0;x<a.length;x++)
		{
			if(index!=x)
			{
				b[y++]=a[x];
				//y++;
			}
		}
		for(int t:b)
			System.out.println(t);

		//
//		for(int x=index;x<a.length-1;x++)
//		{
//			a[x]=a[x+1];
//			//System.out.println(a[x]);
//		}
//		a[a.length-1]=0;
//		for(int t:a)
//			System.out.println(t);
	}

}
