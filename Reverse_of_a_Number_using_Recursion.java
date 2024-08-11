package methodPrograms;

public class Reverse_of_a_Number_using_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse r=new reverse();
		r.rev(123, 0);
		int res=r.rever(r.num,0);
		if(res==r.num)
		{
			System.out.println(r.num+" palindrome");
		}
		else
			System.out.println(r.num+" not palindrome");
	}

}
class reverse
{
	int num=121;
	void rev(int num,int rev)
	{
		if(num==0)
		{
			System.out.println(rev);
		}
		else
		{
			int rem=num%10;
			rev=rev*10+rem;
			rev(num/10,rev);
		}
	}
	int rever(int num,int rev)
	{
		if(num==0)
		{
			return rev;
		}
		else
		{
			int rem=num%10;
			rev=rev*10+rem;
			return rever(num/10,rev);
		}
	}
}