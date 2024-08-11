package arrays;

public class countLeapYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {1900,2000,2024,2004,2007,1986};
		int count1=0;
		for(int x=0;x<a.length;x++)
		{
			int temp=a[x],count=0;
			while(temp>0)
			{
				count++;
				temp/=10;
			}
			if(count==4 && (a[x]%4==0 )&& (a[x]%100!=0||a[x]%400==0))
			{
				count1++;
				System.out.println(a[x]);
			}
		}
		System.out.println(count1);
	}

}
