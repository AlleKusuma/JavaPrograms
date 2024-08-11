class coding
{
	public static void main(String args[])
	{
	 int num=25,count=0,rem;
	  if(num>0)
	  {
	    count=count+1;
	    rem=num%10;
            if(rem>0)
	    {
		num=num/10;
	        count=count+1;
	     }
	  }
	  
	System.out.println(count);
       }
}