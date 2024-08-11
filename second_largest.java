package arrays;

public class second_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,40,20,50,30,40,50,50},max=Integer.MIN_VALUE,sec_max=Integer.MIN_VALUE;
		for(int x=0;x<a.length;x++)
		{
			if(max<a[x])
			{
				sec_max=max;
				max=a[x];
			}
			else if(max!=a[x] && sec_max!=a[x])
			{
				sec_max=a[x];
			}
		}
		System.out.println(sec_max);
	}

}
