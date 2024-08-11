class perfect_square
{
	public static void main(String args[])
	{
		int num=36;
		double result=Math.sqrt(num);
		int value=(int)result;
		double powvalue=Math.pow(value,2);
		//System.out.println(result);
		if(num==powvalue)
		{
			System.out.print("perfect square");
		}
		else
		{
			System.out.println("not perfect square");
		}
	}

}