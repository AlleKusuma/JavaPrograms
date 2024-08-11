class min_max_sec_max
{
	public static void main(String args[])
	{
		int a=13,b=4,c=2;
		int min,max,sec;
		if(a>=b && a>=c)
		{
			max=a;
			if(b>=c)
			{
				sec=b;
				min=c;
			}
			else
			{
				sec=c;
				min=b;
			}
		}
		else if(b>=a && b>=c)
		{
			max=b;
			if(a>=c)
			{
				sec=a;
				min=c;
			}
			else
			{
				sec=c;
				min=a;
			}
		}
		else
		{
			max=c;
			if(a>=b)
			{
				sec=a;
				min=b;
			}
			else
			{
				sec=b;
				min=a;
			}
		}
		System.out.println("max value is "+max);
		System.out.println("min value is "+min);
		System.out.println("second max value is "+sec);
	}
}