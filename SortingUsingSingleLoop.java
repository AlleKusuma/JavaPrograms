package arrays;

public class SortingUsingSingleLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,20,34,12,2,67};
		for(int x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}
		System.out.println();
		for(int x=0;x<a.length-1;x++)
		{
			if(a[x]>a[x+1])
			{
				int t=a[x];
				a[x]=a[x+1];
				a[x+1]=t;
				x=-1;
			}
		}
		for(int x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}
	}

}
