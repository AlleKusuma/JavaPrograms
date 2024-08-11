package methodPrograms;

public class StrongNumber_using_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrongNumber_using_Recursion s=new StrongNumber_using_Recursion();
		
		int res=s.digit(s.num1);
		System.out.println("original number "+s.num1);
		if(s.num1==res)
		{
			System.out.println(s.num1+" strong number");
		}
		else
		{
			System.out.println(s.num1+" not strong number");
		}
	}
	int sum1=0,num1=145;
	int digit(int num)
	{
		number n=new number();
		if(num!=0)
		{
			int rem=num%10;
			sum1=sum1+n.factorial(rem,1,1);
			return digit(num/10);
		}
		else {
			
			return sum1;
		}
	}

}
class number
{
	int sum=0;
	
	int factorial(int num,int start,int fact)
	{
		if(start==num+1)
		{
			sum=sum+fact;
			//System.out.println(sum);
			return sum;
		}
		else
		{
			fact=fact*start;
			
			return factorial(num,++start,fact);
		}
	}
}