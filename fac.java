class fac
{
	public static void main(String args[])
	{
		int n=100;
		for(int i=1;i<=n;i++)
		{
			long fact=1;
			for(int j=i;j>=1;j--)
			{
				fact=fact*j;
			}
			System.out.println(i+"!"+"   "+fact);
		}
	}
}