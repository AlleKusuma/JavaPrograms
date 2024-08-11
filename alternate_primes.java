class alternate_primes
{
	public static void main(String args[])
	{
		int i=2,end=100;
		while(i<=end)
		{
			int start=1,count=0;
			while(start<=i)
			{
				if(i%start==0)
				{
					count++;
				}
				start++;
			}
			if(count==2)
			{
				System.out.println(i+" is prime ");
			}
			
			i++;
		}		
	}
}