class even_pattern
{
  public static void main(String args[])
  {
    char k='A';
    for(int i=1;i<=4;i++)
    {
	int k1=i;
      for(int j=1;j<=4;j++)
      {
        if(i%2==0)
        { 
         System.out.print(k1+" ");
	 k1++;
        }
        else
	{
	  System.out.print(k+" ");
	   k++;
	}
        
      }
      System.out.println();
    }
  }
}