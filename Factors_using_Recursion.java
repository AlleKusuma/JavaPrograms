package methodPrograms;

public class Factors_using_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mymethod(3));
		//Factors_using_Recursion f=new Factors_using_Recursion();
		factors f=new factors();
		f.fact(12,1);
	}
	static int mymethod(int x)
	{
		return 5+x;
	}
	

}
class factors
{
	void fact(int num,int start)
	{
		if(num!=start)
		{
			if(num%start==0)
			{
				System.out.println(start);
				
			}
			fact(num,++start);
		}

	}
}