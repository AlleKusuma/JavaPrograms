package methodPrograms;

public class PrimeFactors_using_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCl m=new MyCl();
		for(int i=1;i<=100;i++)
		{
			System.out.println("prime factors of "+i);
			m.factors(i);
		}
		
		
	}

}
class MyCl
{
	//int num=12;
	void factors(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				prime(i);
			}
				
		}
	}
	void prime(int x)
	{
		int count=0,i=2;
		for(;i<=x/2;i++)
		{
			if(x%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0 && x>1)
			System.out.println(x+" prime");
	}
}