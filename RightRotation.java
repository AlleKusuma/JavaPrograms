package arrays;

public class RightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,20,30,40,50,60};
		//                 60 10 20 30 40 50
		for(int r=1;r<=2;r++)
		{
			int temp=a[a.length-1],x;
			for(x=a.length-1;x>0;x--)
			{
				a[x]=a[x-1];
				//System.out.println(x+" "+a[x+1]);
			}
			a[x]=temp;
			System.out.println("\nrotation "+r);
			for(int t:a)
			{
				System.out.print(t+" ");
			}
		}
		
	}

}
