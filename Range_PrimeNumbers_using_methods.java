package methodPrograms;

public class Range_PrimeNumbers_using_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Range_PrimeNumbers_using_methods myclass=new Range_PrimeNumbers_using_methods();
		for(int x=1;x<=100;x++)
		{
			int res=myclass.factors(x);
			if(res==2)
				System.out.println(x+" prime");
		}
	}
	int factors(int x)
	{
		int count=0;
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)
				count++;
		}
		return count;
	}

}
/*
class MyClass5
{
	int factors(int x)
	{
		int count=0;
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)
				count++;
		}
		return count;
	}
}*/