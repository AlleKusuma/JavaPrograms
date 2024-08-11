class max_min
{
	public static void main(String args[])
	{
		int a=100,b=2006,c=30,min,max;
		if(a>b && a>c)
		{
			max=a;
			if(b>c)
			{
				min=c;
			}
			else
			{
				min=b;
			}
		}
		else if(b>c && b>a)
		{
			max=b;
			if(a>c)
			{
				min=c;
			}
			else
			{
				min=a;
			}
		}
		else
		{
			max=c;
			if(a>b)
			{
				min=b;
			}
			else
			{
				min=a;
			}
		}
		System.out.println("max value is "+max);
		System.out.println("min value is "+min);
	}
}