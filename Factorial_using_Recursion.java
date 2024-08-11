package methodPrograms;

public class Factorial_using_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fact f=new fact();
		f.fac(6, 1, 1);
		f.facb(1,6);
	}

}
class fact
{
	void fac(int num,int start,int sum)
	{
		if(start==num+1)
		{
			System.out.println(sum);
		}
		else
		{
			sum=sum*start;
			fac(num,++start,sum);
		}
	}
	void facb(int sum,int start)
	{
		if(start==0)
		{
			System.out.println(sum);
		}
		else
		{
			sum=sum*start;
			facb(sum,--start);
		}
	}
}