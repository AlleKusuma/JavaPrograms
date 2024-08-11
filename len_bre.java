class len_bre
{
  public static void main(String args[])
  {
    int len=10,bre=5,area,perimeter;
    area=len*bre;
    perimeter=(len+bre)*2;
    if(area>perimeter)
    {
	System.out.println("area is greater");
    }
    else{
   	System.out.println("area is not greater");
	}
  }
}