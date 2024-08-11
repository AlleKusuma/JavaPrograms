package arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {80,60,20,90,100,30,10};
		for(int x=0;x<a.length;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]>a[y])
				{
					int t=a[x];
					a[x]=a[y];
					a[y]=t;
				}
			}
		}
		for(int temp:a)
		{
			System.out.println();
		}
	}

}
