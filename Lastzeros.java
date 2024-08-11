package arrays;

public class Lastzeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {1,0,2,0,3,0,4,0,5,0,6,0,7,0};
		int b[]=new int[a.length];
		for(int x=0,y=0;x<a.length;x++)
		{
			if(a[x]>0)
			{
				b[y]=a[x];
				y++;
			}	
		}
		for(int temp:b)
		{
			System.out.println(temp);
		}
	}

}
