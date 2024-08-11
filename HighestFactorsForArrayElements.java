package arrays;

public class HighestFactorsForArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,20,30,40,50,60,70,13,45,68,79};
		
		for(int x=0;x<a.length;x++)
		{
			
			for(int i=a[x]/2;i>=1;i--)
			{
				if(a[x]%i==0)
				{
					a[x]=i;
					break;
				}
			}
			
		}
		for(int x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}
	}

}
