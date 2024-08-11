class fiz
{
	public static void main(String[] args)
	{
		int i=1;
		while(i<=100)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i+" "+"fizz buzz");
			}
			else if(i%3==0)
			{
				System.out.println(i+" "+"fizz");
			}
			else
			{
				System.out.println(i+" "+"buzz");
			}
			i++;
		}
	}
}