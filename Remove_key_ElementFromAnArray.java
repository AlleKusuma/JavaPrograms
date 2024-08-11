package arrays;

public class Remove_key_ElementFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,20,30,40,10,40,10,10};
		int key=10;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]==key)
			{
				continue;
			}
			else
			{
				System.out.print(a[x]+" ");
			}
		}
	}

}
