package arrays;

public class Sub2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[][] { {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
		int b[][]=new int[][] { {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}};
		int c[][]=new int[a.length][];
		int d[][]=new int[5][5];
		for(int x=0;x<a.length;x++)
		{
			c[x]=new int[a[x].length];
		}
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a[x].length;y++)
			{
				c[x][y]=a[x][y]+b[x][y];
				System.out.print(c[x][y]+" ");
			}
			System.out.println();
		}
		System.out.println("subtraction array");
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a[x].length;y++)
			{
				c[x][y]=b[x][y]-a[x][y];
				System.out.print(c[x][y]+" ");
			}
			System.out.println();
		}
		int k=1;
		for(int x=0;x<d.length;x++)
		{
			for(int y=0;y<d[x].length;y++)
			{
				System.out.printf("%2d ",k);
				k++;
			}
			System.out.println();
		}
		System.out.println("Multiplication of two arrays");
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a[x].length;y++)
			{
				for(int z=0;z<b.length;z++)
				{
					c[x][y]+=b[x][z]*a[x][z];
					
					
				}
				//System.out.print(c[x][y]+" ");
			}
			//System.out.println();
		}
		for(int x=0;x<c.length;x++)
		{
			for(int y=0;y<c[x].length;y++)
			{
				System.out.print(c[x][y]+" ");
			}
			System.out.println();
		}
	}

}
