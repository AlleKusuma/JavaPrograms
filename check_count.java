class check_count
{
	public static void main(String args[])
	{
		int i=2000;
		int count=0;
		while(i<=2024)
		{
			if(((i%4==0)&&(i%100!=0))||(i%400==0))
			{
				count++;
			}
			i++;
		}
		System.out.println(count);
	}
}