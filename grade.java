class grade
{
  public static void main(String args[])
  {
    int hardness=50;
    double carbon=0.6;
    int tensile=5650;
    int grade=5;
    if(hardness>50)
    { 
	grade=6;
      if(carbon<0.7)
      {
        if(tensile>5600)
   	{
	  grade=10;
        }
	else
	{
	  grade=9;
        }
      }
      else
      {
	if(tensile>5600)
        {
	  grade=7;
        }
       }
     }
     else
     {
       if(carbon<0.7)
       { 
  	 grade=6;
         if(tensile>5600)
         {
           grade=8;
         }
       }
       else
	{
          if(tensile>5600)
          {
            grade=6;
          }
          else
	  {
            grade=5;
	  }
        }
      }
     System.out.println(grade);
   }
}

    