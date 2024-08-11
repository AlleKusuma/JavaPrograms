package arrays;

public class maximumRepeatedElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,50,30,30,40,20,20,30,30,50,50,50},maxc=2;
		for(int x=0;x<a.length;x++)
		{
			int count=1;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
					count++;
			}
			//maxc=count;
			if(count>=maxc)
			{
				maxc=count;
				System.out.println(a[x]);
			}
				
				//maxc=a[x];
			
		}
		
		
	}

}
