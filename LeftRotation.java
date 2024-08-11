package arrays;

public class LeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,20,30,40,50};
		//20 30 40 50 10
		for(int r=1;r<=3;r++)
		{
			int temp=a[0],x;
			for(x=0;x<a.length-1;x++)
			{
				a[x]=a[x+1];
			}
			a[x]=temp;
			//System.out.println("\nrotation "+r);
		}
		for(int t:a)
			System.out.print(t+" ");
	}

}
