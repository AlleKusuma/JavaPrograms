package arrays;

public class AddElement_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,20,30,40,50,60,70,80,0};
						//  0  1  2  3  4  5  6  7 8
		int index=5;//60 -55
		int ele=55,x;
//		for(int x=a.length-1;x>=index;x--)
//		{
//			if(x==index)
//				a[x]=ele;
//			else
//				a[x]=a[x-1];
//		}
		for( x=a.length-1;x>index;x--)
		{
			a[x]=a[x-1];
		}
		a[x]=ele;
		for(int t:a)
			System.out.println(t);
	}

}
