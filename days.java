class days
{
	public static void main(String args[])
	{
		String s="June";
		int days=0;
		int year=2024;
		if(s=="jan"||s=="mar"||s=="may"||s=="July"||s=="aug"||s=="oct"||s=="dec")
		{
			days=31;
		}
		else if(s=="April"||s=="June"||s=="sept"||s=="nov")
		{
			days=30;
		}
		else if(s=="feb")
		{
			if(((year%4==0)&&(year%100!=0))||(year%400==0))
			{
				days=28;
			}
			else
			{
				days=29;
			}
		}
		else
		{
			System.out.println("wrong input");
		}
		System.out.println(s+" has "+days+" days");
	}
}