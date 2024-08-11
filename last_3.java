class last_3
{
	public static void main(String args[])
	{
		int n=2539;
		int rem=n%100;
		System.out.println(rem);
		if(rem%3==0)
		{
			System.out.println("divisible by 3");
		}
		else
		{
			System.out.println("not divisible by 3");
		}
	}
}