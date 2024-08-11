package arrays;

public class Multiplication_TwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[][] {{1,2},{2,3}};
		int b[][]=new int[][] {{3,2},{2,4}};
		int c[][]=new int[a.length][];
		for(int x=0;x<c.length;x++)
		{
			c[x]=b[b[x].length];
		}
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<b.length;y++)
			{
				for(int z=0;z<b.length;z++)
				{
					c[x][y]+=a[x][z]*b[z][y];
					System.out.print(c[x][y]);
				}
			}
		}
		
		
		
		
	}

}
