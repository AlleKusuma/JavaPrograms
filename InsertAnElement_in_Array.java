package arrays;

public class InsertAnElement_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,20,30};
		//int value=90;
		int index=2;
		for(int x=0;x<a.length+1;x++)
		{
			if(x==index)
			{
				a[x]=90;
				
			}
		
		}
		for(int temp:a)
		{
			System.out.println(temp);
		}
		System.out.println(a.length);
		}
	}


