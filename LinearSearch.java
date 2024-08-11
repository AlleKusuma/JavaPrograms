package arrays;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,20,30,40,50};
		int search=60;
		int count=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]==search)
			{
				count=1;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("elements found");
		}
		else
		{
			System.out.println("element not found");
		}
	}

}
