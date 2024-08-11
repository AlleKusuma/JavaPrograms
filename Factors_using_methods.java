package methodPrograms;

public class Factors_using_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myclass=new MyClass();
		myclass.factors();
		System.out.println(myclass.factor());
	}

}
class MyClass
{
	int num=12;
	void factors()
	{
		//int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				System.out.print(i+" ");
		}
		System.out.println();
	}
	
	int factor()
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
				//System.out.print(i+" ");
		}
		return count;
	}
}
