class criteria
{
	public static void main(String args[])
	{
		String qualification="BTech";
		double percentage=75.6;
		int yop=2023;
		String skills="Java";
		String exam="pass";
		int fee=35000;
		int discount=20000;
		if((qualification=="BTech"||qualification=="MCA"||qualification=="MTech")&&(yop==2023||yop==2024)&&percentage>=60&&(skills=="Java"||skills=="c"||skills=="python")&&(exam=="pass"))
		{
			fee=fee-discount;
			System.out.println("qualified");
		}
		else
		{
			System.out.println("not qualified");
		}
		System.out.println(fee);
	}
}