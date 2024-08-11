package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {60,50,40,30,20,10};
		int c=0;
		for(int x=1;x<=a.length-1;x++)
		{
			for(int y=0;y<a.length-x;y++)
			{
				
//				if(a.length-1-x!=x )
//				{
				c++;
				
					if(a[y]>a[y+1])
					{
						int t=a[y];
						a[y]=a[y+1];
						a[y+1]=t;
					}
				//}
			}
		}
		System.out.println("iterations"+c);
		for(int t:a)
			System.out.println(t);
	}

}
