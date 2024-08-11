class Armstrong
{
  public static void main(String args[])
  {
    int num=154,rem,sum=0;
    int temp=num;
    while(num>0)
    {
      rem=num%10;
      sum=sum+rem*rem*rem;
      num=num/10;
     }
     if(temp==sum)
     {
       System.out.println("Armstrong number");
     }
     else
     {
       System.out.println("not Armstrong number");
     }
  }
}
      