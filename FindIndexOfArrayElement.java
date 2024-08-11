package arrays;

public class FindIndexOfArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {1,2,3,4,5,2,6,7};
		int key=2,index=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]==key)
			{
				index=x;
				System.out.println(index);
			}
		}
		
	}

}
