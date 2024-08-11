package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {70,20,30,40,50,60 };
	
		for(int x=0;x<a.length;x++)
		{
			 int min=x;
			for(int y=x+1;y<a.length;y++)
			{
				
				if(a[min]>a[y])
					min=y;
			}
			int t=a[x];
			a[x]=a[min];
			a[min]=t;
			
		}
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
	}

}
