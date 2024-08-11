package methodPrograms;

public class perfectNumber_using_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		my m=new my();
		int res=m.factors(m.n,0,1);
		System.out.println(res);
		if(m.n==res)
			System.out.println(m.n+" perfect number");
		else
			System.out.println(m.n+" not perfect number");
	}

}
class my
{
	int n=10;
	int factors(int num,int sum,int i)
	{
		if(i!=num+1)
		{
			if(num%i==0)
			{
				sum=sum+i;
				//System.out.println(sum);
			}
			return factors(num,sum,++i);
		}
		else
		{
			return sum;
		}
		
	}
}