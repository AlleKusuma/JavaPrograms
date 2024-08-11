class convert
{
	public static void main(String args[])
	{
		char c='A';
		int d=c;
		int val;
		if(((c>=65)&&(c<=90)))
		{
			val=d+32;
			System.out.println(val);
		}
		else if((c>=97)&&(c<=122))
		{
			val=d-32;
			System.out.println(val);
		}
		else
		{
			System.out.println("not uppercase and lowercase letters");
		}
	}
}