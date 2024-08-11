class insurance
{
	public static void main(String args[])
	{
		String driver="unmarried";
		char gender='f';
		int age=35;
		switch(driver)
		{
			case "unmarried": if((gender=='m')&&(age>30))
						System.out.println("insurance will get male person");
					  else if((age>25))
						System.out.println("insurance will get female person");
					  break;
			case "married": System.out.println("insurance will get");
					break;
			default  : System.out.println("no insurance will get");
			
			
		}
	}
}                      
