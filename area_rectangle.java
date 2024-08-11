class area_rectangle
{
  public static void main(String args[])
  {
    int l=4,b=3;
    int area_rectang=l*b;
    int perimeter_rectangle=2*(l+b);
    if(area_rectang>perimeter_rectangle)
    {
        System.out.println("area of rectangle is greater");
    }
    else
    {
        System.out.println("perimeter of rectangle is greater");
    }
  }
}