class cp_sp
{
  public static void main(String args[])
  {
   int cost_price=6000,selling_price=4000;
   int profit_or_loss=0;
   if(selling_price<cost_price)
   {
      profit_or_loss=cost_price-selling_price;
      System.out.println(profit_or_loss+"is loss amount");
   }
   else
   {
     profit_or_loss=selling_price-cost_price;
     System.out.println(profit_or_loss+" is profit amount");
   }
 }
}