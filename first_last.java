class first_last
{
	public static void main(String args[])
	{
		int n1=2024,n2=2583;
		int rem1=n1/100;
		int rem2=n2%100;
		if((rem1%2==0)&&(rem2%2==0))
		{
			int sum=rem1+rem2;
			System.out.println(sum);
		}
		else
		{
			int prod=rem1*rem2;
			System.out.println(prod);
		}
	}
}