package methodPrograms;

public class Palindrome_or_not_using_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass3 myclass=new MyClass3();
		/*
		for(int i=1;i<=1000;i++)
		{
			if(myclass.reverse(i)==i)
				System.out.println(i+" palindrome");
//			else
//				System.out.println(i+" not palindrome");
		}
		*/
		//int num=122;
		if(myclass.num==myclass.reverse(124))
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("not pal");
	}

}
class MyClass3
{
	int num=122;
	int reverse(int num)
	{
		int rev=0,temp=num;
		while(temp>0)
		{
			int rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
		}
		return rev;
	}
}