package arrays;

public class LargestElement_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {-10,100,-50,-80,-100,-40};
		int max=a[0];
		for(int x=1;x<a.length;x++)
		{
			if(a[x]>max)
				max=a[x];
		}
		System.out.println(max);
		int min=a[0];
		for(int x=0;x<a.length;x++)
		{
			if(a[x]<min)
				min=a[x];
		}
		System.out.println(min);
	}

}
